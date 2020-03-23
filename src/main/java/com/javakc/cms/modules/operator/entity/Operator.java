package com.javakc.cms.modules.operator.entity;

import java.util.Date;

public class Operator {

    /** 运营方主键 */
    private Integer operatorId ;
    /** 公司名 */
    private String company ;
    /** 运营方名称 */
    private String operatorName ;
    /** 合同起始时间 */
    private Date contractStartdate ;
    /** 合同结束时间 */
    private Date contractEnddate ;
    /** 更新时间 */
    private Date updatedTime ;

    /** 运营方主键 */
    public Integer getOperatorId(){
        return this.operatorId;
    }
    /** 运营方主键 */
    public void setOperatorId(Integer operatorId){
        this.operatorId = operatorId;
    }
    /** 公司名 */
    public String getCompany(){
        return this.company;
    }
    /** 公司名 */
    public void setCompany(String company){
        this.company = company;
    }
    /** 运营方名称 */
    public String getOperatorName(){
        return this.operatorName;
    }
    /** 运营方名称 */
    public void setOperatorName(String operatorName){
        this.operatorName = operatorName;
    }
    /** 合同起始时间 */
    public Date getContractStartdate(){
        return this.contractStartdate;
    }
    /** 合同起始时间 */
    public void setContractStartdate(Date contractStartdate){
        this.contractStartdate = contractStartdate;
    }
    /** 合同结束时间 */
    public Date getContractEnddate(){
        return this.contractEnddate;
    }
    /** 合同结束时间 */
    public void setContractEnddate(Date contractEnddate){
        this.contractEnddate = contractEnddate;
    }
    /** 更新时间 */
    public Date getUpdatedTime(){
        return this.updatedTime;
    }
    /** 更新时间 */
    public void setUpdatedTime(Date updatedTime){
        this.updatedTime = updatedTime;
    }
}
