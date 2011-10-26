package cn.com.jit.ida.ca.display;

import java.io.File;

import cn.com.jit.ida.IDAException;
import cn.com.jit.ida.ca.config.CAConfigConstant;
import cn.com.jit.ida.ca.displayrelated.initserver.InitSystem;
import cn.com.jit.ida.ca.initserver.GenConfigFile;
import cn.com.jit.ida.ca.initserver.InitServerException;
import cn.com.jit.ida.globalconfig.ConfigTool;

public class DisplayInitServer extends DisplayOperate {

	public void operate() {
		initServer();
	}
	void initServer() {
		File initFile = new File("./config/init.xml");
		if (!initFile.exists()) {
			System.out.println("./config/init.xml不存在，CA无法初始化");
			return;
		}
		if ((isBeenInit_noPrint())&& (!ConfigTool.getYesOrNo(
		"系统已经初始化，如果重新初始化系统原有数据将会全部丢失！！！\n\n是否确定要重新初始化？[Y/N(默认)]","N"))){
			return;
		}
		//制作CAConfig.xml文件样式
		if (!GenConfigFile.makefileCainit()){
			System.out.println("初始化CAConfig.xml配置文件发生错误。");
			return;
		}
		//进行详细的初始化操作
		try {
			InitSystem initSystem = new InitSystem();
			initSystem.runInit();
		} catch (Exception e) {
			if(e instanceof IDAException){
				IDAException idae = (IDAException)e;
				idae.getMessage();
			}
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DisplayInitServer dd = new DisplayInitServer();
		dd.initServer();
	}
}
