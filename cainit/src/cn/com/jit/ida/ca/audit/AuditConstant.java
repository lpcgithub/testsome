package cn.com.jit.ida.ca.audit;

import cn.com.jit.ida.ca.control.CommandConstant;
import cn.com.jit.ida.ca.res.CAConstant;
import java.util.Hashtable;

public class AuditConstant extends CAConstant
{
  public static final String PROTOCOL_OPERATOR_SN = "operatorSN";
  public static final String PROTOCOL_OPERATOR_DN = "operatorSubject";
  public static final String PROTOCOL_OPERATOR_DNUPPERCASE = "operatorsubjectuppercase";
  public static final String PROTOCOL_OBJECT_CERT_SN = "objectCertSN";
  public static final String PROTOCOL_OBJECT_SUBJECT = "objectSubject";
  public static final String PROTOCOL_OBJECT_SUBJECTUPPERCASE = "objectsubjectuppercase";
  public static final String PROTOCOL_OBJECT_CTML_NAME = "objectCTMLName";
  public static final String PROTOCOL_OPERATION_TYPE = "optType";
  public static final String PROTOCOL_OPERATION_TIME = "optTime";
  public static final String PROTOCOL_OPERATION_TIME_BEGIN = "optTimeBegin";
  public static final String PROTOCOL_OPERATION_TIME_ENG = "optTimeEnd";
  public static final String PROTOCOL_OPERATION_RESULT = "result";
  public static final String PROTOCOL_QUERY_FROM = "fromIndex";
  public static final String PROTOCOL_QUERY_COUNT = "rowCount";
  public static final String PROTOCOL_TOTAL_COUNT = "totalCount";
  public static final String PROTOCOL_EXACT_QUERY = "exactQuery";
  public static final String PROTOCOL_IS_LOG = "isLog";
  public static final String PROTOCOL_CERT_SN = "certSN";
  public static final String PROTOCOL_CTML_NAME = "ctmlName";
  public static final String PROTOCOL_SUBJECT = "subject";
  public static final String PROTOCOL_SUBJECTUPPERCASE = "subjectuppercase";
  public static final String PROTOCOL_NOT_BEFORE = "notBefore";
  public static final String PROTOCOL_NOT_AFTER = "notAfter";
  public static final String PROTOCOL_VALIDITY = "validity";
  public static final String PROTOCOL_CERT_STATUS = "certStatus";
  public static final String PROTOCOL_APPLICANT = "applicant";
  public static final String PROTOCOL_APPLICANTUPPERCASE = "applicantuppercase";
  public static final String PROTOCOL_CREATE_TIME = "createTime";
  public static final String PROTOCOL_CREATETIME_BEGIN = "createTimeStart";
  public static final String PROTOCOL_CREATETIME_END = "createTimeEnd";
  public static final String PROTOCAL_SORT_BY = "sortBy";
  public static final String PROTOCAL_SORT = "sort";
  public static final String PROTOCAL_COUNT_BY_SORT = "count";
  public static final String SORT_BY_CTML = "ctmlName";
  public static final String SORT_BY_APPLICANT = "applicant";
  public static final String SORT_BY_STATUS = "certStatus";
  public static final String DIS_SORT_BY_CTML = "证书模板";
  public static final String DIS_SORT_BY_STATUS = "证书状态";
  public static final String DIS_SORT_BY_APPLICANT = "管理员主题";
  public static Hashtable SORT_DISPLAY = new Hashtable();
  public static final String OPT_RESULT_SCCESS = "1";
  public static final String OPT_RESULT_FAILED = "0";
  public static final String DIS_OPT_RESULT_ALL = "全部结果";
  public static final String DIS_OPT_RESULT_SCCESS = "成功";
  public static final String DIS_OPT_RESULT_FAILED = "失败";
  public static final String DIS_ALL_CTML = "全部模板";
  public static final String DIS_NO_CTML = "没有合适的证书模板";
  public static final String DIS_STATUS_ALL = "全部状态";
  public static final String DIS_STATUS_USE = "使用中";
  public static final String DIS_STATUS_HOLD = "冻结";
  public static final String DIS_STATUS_REVOKE = "注销";
  public static final String DIS_STATUS_UNDOWN = "未下载";
  public static final String DIS_STATUS_UNDOWN_REVOKE = "未下载注销";
  public static final String DIS_ALL_OPT = "全部业务类型";
  public static final String DIS_CERT_REQ = "申请证书";
  public static final String DIS_CERT_DOWN = "下载证书";
  public static final String DIS_CERT_REQ_DOWN = "申请并下载证书";
  public static final String DIS_CERT_HOLD = "冻结证书";
  public static final String DIS_CERT_UNHOLD = "解冻证书";
  public static final String DIS_CERT_UPDATE = "更新证书";
  public static final String DIS_CERT_UPDATE_DOWN = "更新并下载证书";
  public static final String DIS_CERT_RVK = "注销证书";
  public static final String DIS_AUTHCODE_UPDATE = "更新授权码";
  public static final String DIS_CERT_QUERY = "查询证书";
  public static final String DIS_CERT_ENTITY_QUERY = "查询证书实体";
  public static final String DIS_CERT_UPDATEQUERY = "查询更新证书";
  public static final String DIS_CTML_QUERY = "浏览模板";
  public static final String DIS_CTML_CREATE = "添加模板";
  public static final String DIS_CTML_MODIFY = "修改模板";
  public static final String DIS_CTML_DEL = "删除模板";
  public static final String DIS_CTML_REVOKE = "注销模板";
  public static final String DIS_SELFEXT_QUERY = "浏览自定义扩展";
  public static final String DIS_SELFEXT_CREATE = "添加自定义扩展";
  public static final String DIS_SELFEXT_MODIFY = "修改自定义扩展";
  public static final String DIS_SELFEXT_DEL = "删除自定义扩展";
  public static final String DIS_SELFEXT_REVOKE = "注销自定义扩展";
  public static final String DIS_RACTML_UPDATE = "模板自动更新";
  public static final String DIS_PRIVILEGE_SETADMIN = "授权管理员权限";
  public static final String DIS_PRIVILEGE_GETADMINLIST = "查询管理员列表";
  public static final String DIS_PRIVILEGE_GETADMINROLES = "查询管理员权限";
  public static final String DIS_PRIVILEGE_SETTEMADMIN = "管理员业务权限授权";
  public static final String DIS_PRIVILEGE_GETROLELIST = "角色列表查询";
  public static final String DIS_PRIVILEGE_GETTEMADMIN = "管理员业务权限查询";
  public static final String DIS_AUDIT_QUERYLOG = "查询业务日志";
  public static final String DIS_AUDIT_COUNTCERT = "统计证书";
  public static final String DIS_AUDIT_ARCHIVELOG = "归档业务日志";
  public static final String DIS_AUDIT_QUERYARCHIVELOG = "归档日志查询";
  public static final String DIS_SUPERARCHIVECERT = "证书归档";
  public static final String DIS_SUPER_QUERYARCHIVECERT = "证书归档查询";
  public static final String DIS_SYSTEM_VIEWCONFIG = "全局配置信息查询";
  public static final String DIS_SYSTEM_MODIFYCONFIG = "全局配置信息设置";
  public static final String DIS_START_SERVER = "启动服务";
  public static final String DIS_STOP_SERVER = "停止服务";
  public static final String DIS_DEBUG_1 = "进入实时故障诊断模式";
  public static final String DIS_STOP_DEBUG_1 = "退出实时故障诊断模式";
  public static final String DIS_DEBUG_2 = "进入实时故障诊断模式2";
  public static final String DIS_STOP_DEBUG_2 = "退出实时故障诊断模式2";
  public static final String DIS_UPDATE_ADMIN = "更新超级管理员";
  public static final String DIS_UPDATE_AUDITADMIN = "更新审计管理员";
  public static final String DIS_UPDATE_COMM = "更新通信证书";
  public static final String DIS_UPDATE_ROOT = "更新根证书";
  public static final String DIS_GENERATE_ACROSS_CERT = "更新交叉认证证书";
  public static final String DIS_UPDATE_CHILD = "更新子CA证书";
  public static final String DIS_IMPORT_KMC_CERT = "导入KMC通信证书";
  public static final String DIS_RECOVER_USER_CERT = "恢复用户证书";
  public static final String DIS_RECOVER_CA_ROOT_CERT = "恢复CA根证书";
  public static final String DIS_CREATEVISCA = "创建下级虚拟CA";
  public static final String DIS_DELVISCA = "删除虚拟CA";
  public static final String DIS_RESTORELDAP = "恢复目录服务器";
  public static final String DIS_DBBACKUP = "数据库备份";
  public static final String DIS_DBRESTORE = "数据库恢复";
  public static final String DIS_DBENCRYPT = "数据库加密";
  public static final String DIS_DBVERIFY = "数据库完整性验证";
  public static final String DIS_SIGNCRL = "签发CRL";
  public static final String DIS_SIGNARL = "签发ARL";
  public static final String DIS_ADDUSERTORO = "增加注册机构用户";
  public static final String DIS_DELUSERFROMRO = "删除注册机构用户";
  public static final String DIS_MODIFYRO = "修改注册机构信息";
  public static final String DIS_MODIFYVCA = "修改虚拟CA信息";
  public static final String DIS_CERTARCH = "证书归档";
  public static final String DIS_ARCHTODISK = "证书归档到磁盘";
  public static final String DIS_LOGARCHTODISK = "日志归档到磁盘";
  public static Hashtable OPT_DIS_NAME;

  static
  {
    SORT_DISPLAY.put("ctmlName", "证书模板");
    SORT_DISPLAY.put("applicant", "管理员主题");
    SORT_DISPLAY.put("certStatus", "证书状态");
    OPT_DIS_NAME = new Hashtable();
    OPT_DIS_NAME.put("CERTREQDOWN", "申请并下载证书");
    OPT_DIS_NAME.put("CERTREQUST", "申请证书");
    OPT_DIS_NAME.put("CERTDOWNLOAD", "下载证书");
    OPT_DIS_NAME.put("CERTUPDATE", "更新证书");
    OPT_DIS_NAME.put("CERTUPDDOWN", "更新并下载证书");
    OPT_DIS_NAME.put("AUTHCODEUPDATE", "更新授权码");
    OPT_DIS_NAME.put("CERTREVOKE", "注销证书");
    OPT_DIS_NAME.put("CERTHOLD", "冻结证书");
    OPT_DIS_NAME.put("CERTUNHOLD", "解冻证书");
    OPT_DIS_NAME.put("CERTQUERY", "查询证书");
    OPT_DIS_NAME.put("CERTENTITYQUERY", "查询证书实体");
    OPT_DIS_NAME.put("CERTUPDATEQUERY", "查询更新证书");
    OPT_DIS_NAME.put("CTMLCREATE", "添加模板");
    OPT_DIS_NAME.put("CTMLDELETE", "删除模板");
    OPT_DIS_NAME.put("CTMLMODIFY", "修改模板");
    OPT_DIS_NAME.put("CTMLGET", "浏览模板");
    OPT_DIS_NAME.put("CTMLREVOKE", "注销模板");
    OPT_DIS_NAME.put("CTMLSELFEXTCREATE", "添加自定义扩展");
    OPT_DIS_NAME.put("CTMLSELFEXTDELETE", "删除自定义扩展");
    OPT_DIS_NAME.put("CTMLSELFEXTMODIFY", "修改自定义扩展");
    OPT_DIS_NAME.put("CTMLSELFEXTGET", "浏览自定义扩展");
    OPT_DIS_NAME.put("CTMLSELFEXTREVOKE", "注销自定义扩展");
    OPT_DIS_NAME.put("RACTMLUPDATE", "模板自动更新");
    OPT_DIS_NAME.put("PRIVILEGESETADMIN", "授权管理员权限");
    OPT_DIS_NAME.put("PRIVILEGEGETADMINLIST", "查询管理员列表");
    OPT_DIS_NAME.put("PRIVILEGEGETADMINROLES", "查询管理员权限");
    OPT_DIS_NAME.put("PRIVILEGEGETTEMPLATEADMIN", "管理员业务权限查询");
    OPT_DIS_NAME.put("PRIVILEGESETTEMPLATEADMIN", "管理员业务权限授权");
    OPT_DIS_NAME.put("PRIVILEGEGETROLELIST", "角色列表查询");
    OPT_DIS_NAME.put("AUDITQUERYLOG", "查询业务日志");
    OPT_DIS_NAME.put("AUDITCOUNTCERT", "统计证书");
    OPT_DIS_NAME.put("AUDITARCHIVELOG", "归档业务日志");
    OPT_DIS_NAME.put("AUDITQUERYARCHIVELOG", "归档日志查询");
    OPT_DIS_NAME.put("SUPERARCHIVECERT", "证书归档");
    OPT_DIS_NAME.put("SUPERQUERYARCHIVECERT", "证书归档查询");
    OPT_DIS_NAME.put("SYETEMVIEWCONFIG", "全局配置信息查询");
    OPT_DIS_NAME.put("SYSTEMMODIFYCONFIG", "全局配置信息设置");
    OPT_DIS_NAME.put(CommandConstant.Start, "启动服务");
    OPT_DIS_NAME.put(CommandConstant.Stop, "停止服务");
    OPT_DIS_NAME.put(CommandConstant.Debug_1, "进入实时故障诊断模式");
    OPT_DIS_NAME.put(CommandConstant.StopDebug_1, "退出实时故障诊断模式");
    OPT_DIS_NAME.put(CommandConstant.Debug_2, "进入实时故障诊断模式2");
    OPT_DIS_NAME.put(CommandConstant.StopDebug_2, "退出实时故障诊断模式2");
    OPT_DIS_NAME.put(CommandConstant.UpdateAdmin, "更新超级管理员");
    OPT_DIS_NAME.put("-IssueUserCert", "恢复用户证书");
    OPT_DIS_NAME.put("-IssueCARootCert", "恢复CA根证书");
    OPT_DIS_NAME.put(CommandConstant.UpdateAuditAdmin, "更新审计管理员");
    OPT_DIS_NAME.put(CommandConstant.UpdateCommuCert, "更新通信证书");
    OPT_DIS_NAME.put(CommandConstant.UpdateRoot, "更新根证书");
    OPT_DIS_NAME.put(CommandConstant.GenerateAcrossCert, "更新交叉认证证书");
    OPT_DIS_NAME.put(CommandConstant.UpdateChild, "更新子CA证书");
    OPT_DIS_NAME.put(CommandConstant.ImportKMCCert, "导入KMC通信证书");
    OPT_DIS_NAME.put("CREATEVISCA", "创建下级虚拟CA");
    OPT_DIS_NAME.put("DELVISCA", "删除虚拟CA");
    OPT_DIS_NAME.put("RESTORELDAP", "恢复目录服务器");
    OPT_DIS_NAME.put("DBBACKUP", "数据库备份");
    OPT_DIS_NAME.put("DBRESTORE", "数据库恢复");
    OPT_DIS_NAME.put("DBENCRYPT", "数据库加密");
    OPT_DIS_NAME.put("DBVERIFY", "数据库完整性验证");
    OPT_DIS_NAME.put("SIGNCRL", "签发CRL");
    OPT_DIS_NAME.put("SIGNARL", "签发ARL");
    OPT_DIS_NAME.put("ADDUSERTORO", "增加注册机构用户");
    OPT_DIS_NAME.put("DELUSERFROMRO", "删除注册机构用户");
    OPT_DIS_NAME.put("MODIFYRO", "修改注册机构信息");
    OPT_DIS_NAME.put("MODIFYVCA", "修改虚拟CA信息");
    OPT_DIS_NAME.put("CERTARCH", "证书归档");
    OPT_DIS_NAME.put("ARCHTODISK", "证书归档到磁盘");
    OPT_DIS_NAME.put("LOGARCHTODISK", "日志归档到磁盘");
  }
}

/* Location:           C:\Program Files\JIT\CA50\lib\IDA\ida.jar
 * Qualified Name:     cn.com.jit.ida.ca.audit.AuditConstant
 * JD-Core Version:    0.6.0
 */