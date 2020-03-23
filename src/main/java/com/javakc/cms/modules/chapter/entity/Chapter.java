package com.javakc.cms.modules.chapter.entity;

import java.util.Date;

public class Chapter {

    /** 章节序号;章节主键 */
    private String chapterId ;
    /** 章节名称;章节名称 */
    private String chapterName ;
    /** 书籍外键;书籍外键 */
    private String bookId ;
    /** 书籍名称;书籍名称 */
    private String bookName ;
    /** 状态;0未入库，1已入库 */
    private Integer status ;
    /** 原字数;原字数 */
    private String originalNumber ;
    /** 过滤后字数;过滤后字数 */
    private String filterNumber ;
    /** 过滤词;过滤词 */
    private String filterWords ;
    /** 更新时间;更新时间 */
    private Date updateTime ;
    /** 章节属性;章节属性 */
    private Integer chapterAttribute ;
    /** 类型;类型 */
    private Integer type ;
    /** 章节内容;章节内容 */
    private String chapterContent ;
    /** 原章节文件路径;原章节文件路径 */
    private String originalPath ;
    /** 过滤后章节文件路径;过滤后章节文件路径 */
    private String filterPath ;
    /** 文件大小;文件大小 */
    private Integer filesize ;

    /** 章节序号;章节主键 */
    public String getChapterId(){
        return this.chapterId;
    }
    /** 章节序号;章节主键 */
    public void setChapterId(String chapterId){
        this.chapterId = chapterId;
    }
    /** 章节名称;章节名称 */
    public String getChapterName(){
        return this.chapterName;
    }
    /** 章节名称;章节名称 */
    public void setChapterName(String chapterName){
        this.chapterName = chapterName;
    }
    /** 书籍外键;书籍外键 */
    public String getBookId(){
        return this.bookId;
    }
    /** 书籍外键;书籍外键 */
    public void setBookId(String bookId){
        this.bookId = bookId;
    }
    /** 书籍名称;书籍名称 */
    public String getBookName(){
        return this.bookName;
    }
    /** 书籍名称;书籍名称 */
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    /** 状态;0未入库，1已入库 */
    public Integer getStatus(){
        return this.status;
    }
    /** 状态;0未入库，1已入库 */
    public void setStatus(Integer status){
        this.status = status;
    }
    /** 原字数;原字数 */
    public String getOriginalNumber(){
        return this.originalNumber;
    }
    /** 原字数;原字数 */
    public void setOriginalNumber(String originalNumber){
        this.originalNumber = originalNumber;
    }
    /** 过滤后字数;过滤后字数 */
    public String getFilterNumber(){
        return this.filterNumber;
    }
    /** 过滤后字数;过滤后字数 */
    public void setFilterNumber(String filterNumber){
        this.filterNumber = filterNumber;
    }
    /** 过滤词;过滤词 */
    public String getFilterWords(){
        return this.filterWords;
    }
    /** 过滤词;过滤词 */
    public void setFilterWords(String filterWords){
        this.filterWords = filterWords;
    }
    /** 更新时间;更新时间 */
    public Date getUpdateTime(){
        return this.updateTime;
    }
    /** 更新时间;更新时间 */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }
    /** 章节属性;章节属性 */
    public Integer getChapterAttribute(){
        return this.chapterAttribute;
    }
    /** 章节属性;章节属性 */
    public void setChapterAttribute(Integer chapterAttribute){
        this.chapterAttribute = chapterAttribute;
    }
    /** 类型;类型 */
    public Integer getType(){
        return this.type;
    }
    /** 类型;类型 */
    public void setType(Integer type){
        this.type = type;
    }
    /** 章节内容;章节内容 */
    public String getChapterContent(){
        return this.chapterContent;
    }
    /** 章节内容;章节内容 */
    public void setChapterContent(String chapterContent){
        this.chapterContent = chapterContent;
    }
    /** 原章节文件路径;原章节文件路径 */
    public String getOriginalPath(){
        return this.originalPath;
    }
    /** 原章节文件路径;原章节文件路径 */
    public void setOriginalPath(String originalPath){
        this.originalPath = originalPath;
    }
    /** 过滤后章节文件路径;过滤后章节文件路径 */
    public String getFilterPath(){
        return this.filterPath;
    }
    /** 过滤后章节文件路径;过滤后章节文件路径 */
    public void setFilterPath(String filterPath){
        this.filterPath = filterPath;
    }
    /** 文件大小;文件大小 */
    public Integer getFilesize(){
        return this.filesize;
    }
    /** 文件大小;文件大小 */
    public void setFilesize(Integer filesize){
        this.filesize = filesize;
    }
}
