package com.javakc.cms.modules.batch.entity;

import java.util.Date;

public class Batch {

    /** 批次id */
    private String batchId ;
    /** 批次名称 */
    private String batchName ;
    /** 合同编号 */
    private Integer contractNumber ;
    /** 书单 */
    private String booklist ;
    /** 授权起始时间 */
    private Date startTime ;
    /** 授权结束时间 */
    private Date endTime ;
    /** 结算外键 */
    private String settlementId ;
    /** 运营方外键;运营方外键 */
    private String operatorId ;
    /** 版权外键;版权名称 */
    private String copyrightId ;
    /** 分成比例;分成比例 */
    private String proportion ;

    /** 批次id */
    public String getBatchId(){
        return this.batchId;
    }
    /** 批次id */
    public void setBatchId(String batchId){
        this.batchId = batchId;
    }
    /** 批次名称 */
    public String getBatchName(){
        return this.batchName;
    }
    /** 批次名称 */
    public void setBatchName(String batchName){
        this.batchName = batchName;
    }
    /** 合同编号 */
    public Integer getContractNumber(){
        return this.contractNumber;
    }
    /** 合同编号 */
    public void setContractNumber(Integer contractNumber){
        this.contractNumber = contractNumber;
    }
    /** 书单 */
    public String getBooklist(){
        return this.booklist;
    }
    /** 书单 */
    public void setBooklist(String booklist){
        this.booklist = booklist;
    }
    /** 授权起始时间 */
    public Date getStartTime(){
        return this.startTime;
    }
    /** 授权起始时间 */
    public void setStartTime(Date startTime){
        this.startTime = startTime;
    }
    /** 授权结束时间 */
    public Date getEndTime(){
        return this.endTime;
    }
    /** 授权结束时间 */
    public void setEndTime(Date endTime){
        this.endTime = endTime;
    }
    /** 结算外键 */
    public String getSettlementId(){
        return this.settlementId;
    }
    /** 结算外键 */
    public void setSettlementId(String settlementId){
        this.settlementId = settlementId;
    }
    /** 运营方外键;运营方外键 */
    public String getOperatorId(){
        return this.operatorId;
    }
    /** 运营方外键;运营方外键 */
    public void setOperatorId(String operatorId){
        this.operatorId = operatorId;
    }
    /** 版权外键;版权名称 */
    public String getCopyrightId(){
        return this.copyrightId;
    }
    /** 版权外键;版权名称 */
    public void setCopyrightId(String copyrightId){
        this.copyrightId = copyrightId;
    }
    /** 分成比例;分成比例 */
    public String getProportion(){
        return this.proportion;
    }
    /** 分成比例;分成比例 */
    public void setProportion(String proportion){
        this.proportion = proportion;
    }
}
