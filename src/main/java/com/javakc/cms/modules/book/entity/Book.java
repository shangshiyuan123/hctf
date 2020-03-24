package com.javakc.cms.modules.book.entity;

import com.javakc.cms.base.entity.BaseEntity;

import java.util.Date;

public class Book extends BaseEntity<Book> {
    /** 书籍id;塔读书籍id */
    private String bookTdid ;
    /** cp书籍id;书籍主键 */
    private String bookCpid ;
    /** 书名;书名 */
    private String bookName ;
    /** 作者;作者 */
    private String author ;
    /** 书籍接收时间;书籍接收时间 */
    private Date recieveTime ;
    /** 初审通过时间;初审通过时间 */
    private Date passtime ;
    /** 入库时间;入库时间 */
    private Date warehousingTime ;
    /** 删除时间;删除时间 */
    private Date deleteTime ;
    /** 驳回时间;驳回时间 */
    private Date rejectTime ;
    /** 驳回原因;驳回原因 */
    private String reason ;
    /** 操作人;操作人 */
    private String operator ;
    /** 分类;分类：1言情，2玄幻，3穿越，4其他 */
    private Integer classify ;
    /** 版权名;版权名 */
    private String copyrightName ;
    /** 书单名;书单名 */
    private String booklistName ;
    /** 批次名;批次名 */
    private String batchName ;
    /** 连载;连载：0否，1是 */
    private Integer serialization ;
    /** 字数;字数 */
    private String wordnumber ;
    /** 状态;1上线，2驳回 */
    private Integer state ;
    /** 全本收费;0否，1是 */
    private Integer fullcharge ;
    /** 全本价格;全本价格 */
    private Double fullprice ;
    /** 原创;0否，1是 */
    private Integer original ;
    /** 出版社;出版社 */
    private String press ;
    /** 简介;简介 */
    private String synopsis ;
    /** 书封;书封 */
    private String photo ;
    /** 出版时间;出版时间 */
    private Date presstime ;
    /** 章节数;章节数 */
    private Integer chapterNumber ;
    /** 原站链接;原站链接 */
    private String originalLink ;
    /** 合作方;合作方 */
    private String partners ;
    /** 最后章节发布时间;剩余时间 */
    private Date remainingTime ;
    /** 最后章节名;最后章节名 */
    private String lastName ;
    /** 下架申请;下架申请 */
    private String underApply ;
    /** 申请时间;申请时间 */
    private Date applyTime ;
    /** 下架时间;下架时间 */
    private Date underTime1 ;
    /** 处理状态;未处理，驳回 */
    private Integer handlingStatus ;
    /** 授权起始时间;授权起始时间 */
    private Date startime ;
    /** 授权结束时间;授权结束时间 */
    private Date endtime ;
    /** 作者授权起始时间;作者授权起始时间 */
    private Date authorStartime ;
    /** 作者授权结束时间;作者授权结束时间 */
    private Date authorEndtime ;
    /** 授权状态;1有效，2过期 */
    private Integer authorizationStatus ;
    /** 书单外键;书单外键 */
    private String booklistId ;
    /** 备注;备注 */
    private String remarks ;

    /** 书籍id;塔读书籍id */
    public String getBookTdid(){
        return this.bookTdid;
    }
    /** 书籍id;塔读书籍id */
    public void setBookTdid(String bookTdid){
        this.bookTdid = bookTdid;
    }
    /** cp书籍id;书籍主键 */
    public String getBookCpid(){
        return this.bookCpid;
    }
    /** cp书籍id;书籍主键 */
    public void setBookCpid(String bookCpid){
        this.bookCpid = bookCpid;
    }
    /** 书名;书名 */
    public String getBookName(){
        return this.bookName;
    }
    /** 书名;书名 */
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    /** 作者;作者 */
    public String getAuthor(){
        return this.author;
    }
    /** 作者;作者 */
    public void setAuthor(String author){
        this.author = author;
    }
    /** 书籍接收时间;书籍接收时间 */
    public Date getRecieveTime(){
        return this.recieveTime;
    }
    /** 书籍接收时间;书籍接收时间 */
    public void setRecieveTime(Date recieveTime){
        this.recieveTime = recieveTime;
    }
    /** 初审通过时间;初审通过时间 */
    public Date getPasstime(){
        return this.passtime;
    }
    /** 初审通过时间;初审通过时间 */
    public void setPasstime(Date passtime){
        this.passtime = passtime;
    }
    /** 入库时间;入库时间 */
    public Date getWarehousingTime(){
        return this.warehousingTime;
    }
    /** 入库时间;入库时间 */
    public void setWarehousingTime(Date warehousingTime){
        this.warehousingTime = warehousingTime;
    }
    /** 删除时间;删除时间 */
    public Date getDeleteTime(){
        return this.deleteTime;
    }
    /** 删除时间;删除时间 */
    public void setDeleteTime(Date deleteTime){
        this.deleteTime = deleteTime;
    }
    /** 驳回时间;驳回时间 */
    public Date getRejectTime(){
        return this.rejectTime;
    }
    /** 驳回时间;驳回时间 */
    public void setRejectTime(Date rejectTime){
        this.rejectTime = rejectTime;
    }
    /** 驳回原因;驳回原因 */
    public String getReason(){
        return this.reason;
    }
    /** 驳回原因;驳回原因 */
    public void setReason(String reason){
        this.reason = reason;
    }
    /** 操作人;操作人 */
    public String getOperator(){
        return this.operator;
    }
    /** 操作人;操作人 */
    public void setOperator(String operator){
        this.operator = operator;
    }
    /** 分类;分类：1言情，2玄幻，3穿越，4其他 */
    public Integer getClassify(){
        return this.classify;
    }
    /** 分类;分类：1言情，2玄幻，3穿越，4其他 */
    public void setClassify(Integer classify){
        this.classify = classify;
    }
    /** 版权名;版权名 */
    public String getCopyrightName(){
        return this.copyrightName;
    }
    /** 版权名;版权名 */
    public void setCopyrightName(String copyrightName){
        this.copyrightName = copyrightName;
    }
    /** 书单名;书单名 */
    public String getBooklistName(){
        return this.booklistName;
    }
    /** 书单名;书单名 */
    public void setBooklistName(String booklistName){
        this.booklistName = booklistName;
    }
    /** 批次名;批次名 */
    public String getBatchName(){
        return this.batchName;
    }
    /** 批次名;批次名 */
    public void setBatchName(String batchName){
        this.batchName = batchName;
    }
    /** 连载;连载：0否，1是 */
    public Integer getSerialization(){
        return this.serialization;
    }
    /** 连载;连载：0否，1是 */
    public void setSerialization(Integer serialization){
        this.serialization = serialization;
    }
    /** 字数;字数 */
    public String getWordnumber(){
        return this.wordnumber;
    }
    /** 字数;字数 */
    public void setWordnumber(String wordnumber){
        this.wordnumber = wordnumber;
    }
    /** 状态;1上线，2驳回 */
    public Integer getState(){
        return this.state;
    }
    /** 状态;1上线，2驳回 */
    public void setState(Integer state){
        this.state = state;
    }
    /** 全本收费;0否，1是 */
    public Integer getFullcharge(){
        return this.fullcharge;
    }
    /** 全本收费;0否，1是 */
    public void setFullcharge(Integer fullcharge){
        this.fullcharge = fullcharge;
    }
    /** 全本价格;全本价格 */
    public Double getFullprice(){
        return this.fullprice;
    }
    /** 全本价格;全本价格 */
    public void setFullprice(Double fullprice){
        this.fullprice = fullprice;
    }
    /** 原创;0否，1是 */
    public Integer getOriginal(){
        return this.original;
    }
    /** 原创;0否，1是 */
    public void setOriginal(Integer original){
        this.original = original;
    }
    /** 出版社;出版社 */
    public String getPress(){
        return this.press;
    }
    /** 出版社;出版社 */
    public void setPress(String press){
        this.press = press;
    }
    /** 简介;简介 */
    public String getSynopsis(){
        return this.synopsis;
    }
    /** 简介;简介 */
    public void setSynopsis(String synopsis){
        this.synopsis = synopsis;
    }
    /** 书封;书封 */
    public String getPhoto(){
        return this.photo;
    }
    /** 书封;书封 */
    public void setPhoto(String photo){
        this.photo = photo;
    }
    /** 出版时间;出版时间 */
    public Date getPresstime(){
        return this.presstime;
    }
    /** 出版时间;出版时间 */
    public void setPresstime(Date presstime){
        this.presstime = presstime;
    }
    /** 章节数;章节数 */
    public Integer getChapterNumber(){
        return this.chapterNumber;
    }
    /** 章节数;章节数 */
    public void setChapterNumber(Integer chapterNumber){
        this.chapterNumber = chapterNumber;
    }
    /** 原站链接;原站链接 */
    public String getOriginalLink(){
        return this.originalLink;
    }
    /** 原站链接;原站链接 */
    public void setOriginalLink(String originalLink){
        this.originalLink = originalLink;
    }
    /** 合作方;合作方 */
    public String getPartners(){
        return this.partners;
    }
    /** 合作方;合作方 */
    public void setPartners(String partners){
        this.partners = partners;
    }
    /** 最后章节发布时间;剩余时间 */
    public Date getRemainingTime(){
        return this.remainingTime;
    }
    /** 最后章节发布时间;剩余时间 */
    public void setRemainingTime(Date remainingTime){
        this.remainingTime = remainingTime;
    }
    /** 最后章节名;最后章节名 */
    public String getLastName(){
        return this.lastName;
    }
    /** 最后章节名;最后章节名 */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    /** 下架申请;下架申请 */
    public String getUnderApply(){
        return this.underApply;
    }
    /** 下架申请;下架申请 */
    public void setUnderApply(String underApply){
        this.underApply = underApply;
    }
    /** 申请时间;申请时间 */
    public Date getApplyTime(){
        return this.applyTime;
    }
    /** 申请时间;申请时间 */
    public void setApplyTime(Date applyTime){
        this.applyTime = applyTime;
    }
    /** 下架时间;下架时间 */
    public Date getUnderTime1(){
        return this.underTime1;
    }
    /** 下架时间;下架时间 */
    public void setUnderTime1(Date underTime1){
        this.underTime1 = underTime1;
    }
    /** 处理状态;未处理，驳回 */
    public Integer getHandlingStatus(){
        return this.handlingStatus;
    }
    /** 处理状态;未处理，驳回 */
    public void setHandlingStatus(Integer handlingStatus){
        this.handlingStatus = handlingStatus;
    }
    /** 授权起始时间;授权起始时间 */
    public Date getStartime(){
        return this.startime;
    }
    /** 授权起始时间;授权起始时间 */
    public void setStartime(Date startime){
        this.startime = startime;
    }
    /** 授权结束时间;授权结束时间 */
    public Date getEndtime(){
        return this.endtime;
    }
    /** 授权结束时间;授权结束时间 */
    public void setEndtime(Date endtime){
        this.endtime = endtime;
    }
    /** 作者授权起始时间;作者授权起始时间 */
    public Date getAuthorStartime(){
        return this.authorStartime;
    }
    /** 作者授权起始时间;作者授权起始时间 */
    public void setAuthorStartime(Date authorStartime){
        this.authorStartime = authorStartime;
    }
    /** 作者授权结束时间;作者授权结束时间 */
    public Date getAuthorEndtime(){
        return this.authorEndtime;
    }
    /** 作者授权结束时间;作者授权结束时间 */
    public void setAuthorEndtime(Date authorEndtime){
        this.authorEndtime = authorEndtime;
    }
    /** 授权状态;1有效，2过期 */
    public Integer getAuthorizationStatus(){
        return this.authorizationStatus;
    }
    /** 授权状态;1有效，2过期 */
    public void setAuthorizationStatus(Integer authorizationStatus){
        this.authorizationStatus = authorizationStatus;
    }
    /** 书单外键;书单外键 */
    public String getBooklistId(){
        return this.booklistId;
    }
    /** 书单外键;书单外键 */
    public void setBooklistId(String booklistId){
        this.booklistId = booklistId;
    }
    /** 备注;备注 */
    public String getRemarks(){
        return this.remarks;
    }
    /** 备注;备注 */
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }
}
