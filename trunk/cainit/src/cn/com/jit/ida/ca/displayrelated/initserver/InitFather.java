package cn.com.jit.ida.ca.displayrelated.initserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import cn.com.jit.ida.IDAException;
import cn.com.jit.ida.ca.exception.OperateException;
import cn.com.jit.ida.ca.key.keyutils.Keytype;
import cn.com.jit.ida.globalconfig.ConfigException;
import cn.com.jit.ida.globalconfig.ParseXML;
import cn.com.jit.ida.log.LogManager;
import cn.com.jit.ida.log.SysLogger;

public abstract class InitFather {
	protected ParseXML init;
	// 审计管理员的密钥算法
	protected String baseDN;
	public static final String RSA = "RSA";
	public static final String SM2 = "SM2";
	public static final String RSA_ALGORITHM = "SHA1withRSA";
	public static final String SM2_ALGORITHM = "SM3WITHSM2";
	public static final String RUAN = "RUAN";
	public static final String YING = "YING";
	public static String KEYPAIR_TYPE;
	private SysLogger logger;
	
	public InitFather() throws IDAException {
		this.init = new ParseXML("./config/init.xml");
		initConfig();
		initialize();
	}

	public InitFather(ParseXML init) throws IDAException {
		this.init = init;
		initConfig();
		try {
			initialize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public abstract void initialize() throws IDAException;

	// 初始化方法 供子类实现
	public void initConfig() throws ConfigException, OperateException {
		baseDN = init.getString("BaseDN");
		KEYPAIR_TYPE = init.getString("KeyPairType");
		if(null != KEYPAIR_TYPE && RUAN.equals(KEYPAIR_TYPE)){
			KEYPAIR_TYPE = Keytype.SOFT_VALUE;
		}else if(null != KEYPAIR_TYPE && YING.equals(KEYPAIR_TYPE)){
			KEYPAIR_TYPE = Keytype.FISHMAN_VALUE;
		}else{
			OperateException oexception = new OperateException(
					OperateException.KEYPAIRTYPE_ERROR,
					OperateException.KEYPAIRTYPE_ERROR_DES);
			throw oexception;
		}
		LogManager.init();
		logger = LogManager.getSysLogger();
	}

	public String getCerPath(String path) throws OperateException {
		File localFile1 = new File(path);
		String democerpath;
		File localFile2 = new File(localFile1.getParent());
		localFile2.mkdir();
		String jkspathParent = localFile1.getParent();
		democerpath = jkspathParent + "\\DemoCA.cer";
		localFile1 = new File(democerpath);
		if (localFile1.exists()) {
			return democerpath;
		} else {
			OperateException oexception = new OperateException(
					OperateException.DEMOCA_CER_NULL_ERROR,
					OperateException.DEMOCA_CER_NULL_ERROR_DES);
			throw oexception;
		}
	}
	public byte[] getCertficateByte(String filePath) throws OperateException{
		FileInputStream localFileInputStream;
		try {
			localFileInputStream = new FileInputStream(getCerPath(filePath));
			byte[] arrayOfByte = new byte[localFileInputStream.available()];
			localFileInputStream.read(arrayOfByte);
			localFileInputStream.close();
			return arrayOfByte;
		} catch (FileNotFoundException e) {
			OperateException oexception = new OperateException(
					OperateException.DEMOCA_CER_NULL_ERROR,
					OperateException.DEMOCA_CER_NULL_ERROR_DES);
			throw oexception;
		} catch (IOException e) {
			OperateException oexception = new OperateException(
					OperateException.DEMOCA_FILE_ERROR,
					OperateException.DEMOCA_FILE_ERROR_DES);
			throw oexception;
		}
	}

	public SysLogger getLogger() {
		return logger;
	}

	public void setLogger(SysLogger logger) {
		this.logger = logger;
	}
}