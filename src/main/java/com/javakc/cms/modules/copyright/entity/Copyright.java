package com.javakc.cms.modules.copyright.entity;

import com.javakc.cms.base.entity.BaseEntity;

public class Copyright extends BaseEntity {
    /** 版权主键;主键id */
    private String copyrightId ;
    /** 版权;版权名称 */
    private String copyrightName ;
    /** 公司;版权公司 */
    private String company ;


    /** 版权主键;主键id */
    public String getCopyrightId(){
        return this.copyrightId;
    }
    /** 版权主键;主键id */
    public void setCopyrightId(String copyrightId){
        this.copyrightId = copyrightId;
    }
    /** 版权;版权名称 */
    public String getCopyrightName(){
        return this.copyrightName;
    }
    /** 版权;版权名称 */
    public void setCopyrightName(String copyrightName){
        this.copyrightName = copyrightName;
    }
    /** 公司;版权公司 */
    public String getCompany(){
        return this.company;
    }
    /** 公司;版权公司 */
    public void setCompany(String company){
        this.company = company;
    }

    @Override
    public String toString() {
        return "Copyright{" +
                "copyrightId='" + copyrightId + '\'' +
                ", copyrightName='" + copyrightName + '\'' +
                ", company='" + company + '\'' +
                ", remarks='" + remarks + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", createUser=" + createUser +
                ", updateUser=" + updateUser +
                ", delFlag=" + delFlag +
                ", isNewRecord=" + isNewRecord +
                ", page=" + page +
                ", sqlMap=" + sqlMap +
                '}';
    }
}
