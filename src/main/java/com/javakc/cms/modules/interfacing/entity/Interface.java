package com.javakc.cms.modules.interfacing.entity;

public class Interface {
    /** 主键id */
    private String interfaceId ;
    /** 运营方IP */
    private String operatorIp ;
    /** 合作方IP */
    private String cooperationIp ;
    /** 运营方简介 */
    private String operatorContent ;
    /** 版权简介 */
    private String copyrightContent ;
    /** 授权秘钥 */
    private String authorizeKey ;
    /** 合作状态;1失效，2生效 */
    private Integer cooperation ;
    /** 唯一标识 */
    private String uniqueIdentification ;
    /** 资源ID */
    private String resourcesId ;
    /** 版权外键 */
    private String copyrightId ;
    /** 运营方外键 */
    private String operatorId ;

    /** 主键id */
    public String getInterfaceId(){
        return this.interfaceId;
    }
    /** 主键id */
    public void setInterfaceId(String interfaceId){
        this.interfaceId = interfaceId;
    }
    /** 运营方IP */
    public String getOperatorIp(){
        return this.operatorIp;
    }
    /** 运营方IP */
    public void setOperatorIp(String operatorIp){
        this.operatorIp = operatorIp;
    }
    /** 合作方IP */
    public String getCooperationIp(){
        return this.cooperationIp;
    }
    /** 合作方IP */
    public void setCooperationIp(String cooperationIp){
        this.cooperationIp = cooperationIp;
    }
    /** 运营方简介 */
    public String getOperatorContent(){
        return this.operatorContent;
    }
    /** 运营方简介 */
    public void setOperatorContent(String operatorContent){
        this.operatorContent = operatorContent;
    }
    /** 版权简介 */
    public String getCopyrightContent(){
        return this.copyrightContent;
    }
    /** 版权简介 */
    public void setCopyrightContent(String copyrightContent){
        this.copyrightContent = copyrightContent;
    }
    /** 授权秘钥 */
    public String getAuthorizeKey(){
        return this.authorizeKey;
    }
    /** 授权秘钥 */
    public void setAuthorizeKey(String authorizeKey){
        this.authorizeKey = authorizeKey;
    }
    /** 合作状态;1失效，2生效 */
    public Integer getCooperation(){
        return this.cooperation;
    }
    /** 合作状态;1失效，2生效 */
    public void setCooperation(Integer cooperation){
        this.cooperation = cooperation;
    }
    /** 唯一标识 */
    public String getUniqueIdentification(){
        return this.uniqueIdentification;
    }
    /** 唯一标识 */
    public void setUniqueIdentification(String uniqueIdentification){
        this.uniqueIdentification = uniqueIdentification;
    }
    /** 资源ID */
    public String getResourcesId(){
        return this.resourcesId;
    }
    /** 资源ID */
    public void setResourcesId(String resourcesId){
        this.resourcesId = resourcesId;
    }
    /** 版权外键 */
    public String getCopyrightId(){
        return this.copyrightId;
    }
    /** 版权外键 */
    public void setCopyrightId(String copyrightId){
        this.copyrightId = copyrightId;
    }
    /** 运营方外键 */
    public String getOperatorId(){
        return this.operatorId;
    }
    /** 运营方外键 */
    public void setOperatorId(String operatorId){
        this.operatorId = operatorId;
    }
}
