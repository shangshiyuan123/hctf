package com.javakc.cms.modules.settlement.entity;

import java.util.Date;

public class Settlement {

    /** 序号 */
    private String settlementId ;
    /** 月份 */
    private Date month ;
    /** 分成比例 */
    private String proportion ;
    /** 结算金额（分成前） */
    private Double settlementAmountBefore ;
    /** 结算金额（分成后） */
    private Double settlementAmountAfter ;
    /** 打款时间 */
    private Date paymentTime ;
    /** 结算状态 */
    private Integer settlementStatus ;
    /** 备注 */
    private String remarks ;
    /** 操作人 */
    private String inputer ;
    /** 批次外键 */
    private String batchId ;

    /** 序号 */
    public String getSettlementId(){
        return this.settlementId;
    }
    /** 序号 */
    public void setSettlementId(String settlementId){
        this.settlementId = settlementId;
    }
    /** 月份 */
    public Date getMonth(){
        return this.month;
    }
    /** 月份 */
    public void setMonth(Date month){
        this.month = month;
    }
    /** 分成比例 */
    public String getProportion(){
        return this.proportion;
    }
    /** 分成比例 */
    public void setProportion(String proportion){
        this.proportion = proportion;
    }
    /** 结算金额（分成前） */
    public Double getSettlementAmountBefore(){
        return this.settlementAmountBefore;
    }
    /** 结算金额（分成前） */
    public void setSettlementAmountBefore(Double settlementAmountBefore){
        this.settlementAmountBefore = settlementAmountBefore;
    }
    /** 结算金额（分成后） */
    public Double getSettlementAmountAfter(){
        return this.settlementAmountAfter;
    }
    /** 结算金额（分成后） */
    public void setSettlementAmountAfter(Double settlementAmountAfter){
        this.settlementAmountAfter = settlementAmountAfter;
    }
    /** 打款时间 */
    public Date getPaymentTime(){
        return this.paymentTime;
    }
    /** 打款时间 */
    public void setPaymentTime(Date paymentTime){
        this.paymentTime = paymentTime;
    }
    /** 结算状态 */
    public Integer getSettlementStatus(){
        return this.settlementStatus;
    }
    /** 结算状态 */
    public void setSettlementStatus(Integer settlementStatus){
        this.settlementStatus = settlementStatus;
    }
    /** 备注 */
    public String getRemarks(){
        return this.remarks;
    }
    /** 备注 */
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }
    /** 操作人 */
    public String getInputer(){
        return this.inputer;
    }
    /** 操作人 */
    public void setInputer(String inputer){
        this.inputer = inputer;
    }
    /** 批次外键 */
    public String getBatchId(){
        return this.batchId;
    }
    /** 批次外键 */
    public void setBatchId(String batchId){
        this.batchId = batchId;
    }
}
