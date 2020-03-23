package com.javakc.cms.modules.booklist.entity;

public class Booklist {
    /** 书单主键;书单主键 */
    private String booklistId ;
    /** 书单名;书单名称 */
    private String booklistName ;
    /** 版权名;版权名称 */
    private String copyrightName ;
    /** 批次外键;批次外键 */
    private String batchId ;
    /** 版权外键;版权外键 */
    private String copyrightId ;
    /** 运营方外键;运营方外键 */
    private String operatorId ;

    /** 书单主键;书单主键 */
    public String getBooklistId(){
        return this.booklistId;
    }
    /** 书单主键;书单主键 */
    public void setBooklistId(String booklistId){
        this.booklistId = booklistId;
    }
    /** 书单名;书单名称 */
    public String getBooklistName(){
        return this.booklistName;
    }
    /** 书单名;书单名称 */
    public void setBooklistName(String booklistName){
        this.booklistName = booklistName;
    }
    /** 版权名;版权名称 */
    public String getCopyrightName(){
        return this.copyrightName;
    }
    /** 版权名;版权名称 */
    public void setCopyrightName(String copyrightName){
        this.copyrightName = copyrightName;
    }
    /** 批次外键;批次外键 */
    public String getBatchId(){
        return this.batchId;
    }
    /** 批次外键;批次外键 */
    public void setBatchId(String batchId){
        this.batchId = batchId;
    }
    /** 版权外键;版权外键 */
    public String getCopyrightId(){
        return this.copyrightId;
    }
    /** 版权外键;版权外键 */
    public void setCopyrightId(String copyrightId){
        this.copyrightId = copyrightId;
    }
    /** 运营方外键;运营方外键 */
    public String getOperatorId(){
        return this.operatorId;
    }
    /** 运营方外键;运营方外键 */
    public void setOperatorId(String operatorId){
        this.operatorId = operatorId;
    }
}
