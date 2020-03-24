package com.javakc.cms.modules.customer.entity;

import com.javakc.cms.base.entity.BaseEntity;
import com.javakc.cms.modules.copyright.entity.Copyright;

import java.util.Date;

public class Customer extends BaseEntity {

    /** 主键id;客户主键 */
    private String customerId ;
    /** 姓名;客户名称 */
    private String name ;
    /** 性别;性别：1男，2女 */
    private Integer gender ;
    /** 出生日期;出生日期 */
    private Date birthday ;
    /** 职务;职务 */
    private String post ;
    /** 手机号;手机号 */
    private String telephone ;
    /** 座机号;座机号 */
    private String landline ;
    /** 邮箱;邮箱 */
    private String email ;
    /** QQ;qq号码 */
    private String qq ;
    /** 公司地址;公司地址 */
    private String companyAddress ;
    /** 状态;1版权方，2运营方 */
    private Integer status ;
    /** 版权外键;版权外键 */
    private Copyright copyright;

    /** 主键id;客户主键 */
    public String getCustomerId(){
        return this.customerId;
    }
    /** 主键id;客户主键 */
    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }
    /** 姓名;客户名称 */
    public String getName(){
        return this.name;
    }
    /** 姓名;客户名称 */
    public void setName(String name){
        this.name = name;
    }
    /** 性别;性别：1男，2女 */
    public Integer getGender(){
        return this.gender;
    }
    /** 性别;性别：1男，2女 */
    public void setGender(Integer gender){
        this.gender = gender;
    }
    /** 出生日期;出生日期 */
    public Date getBirthday(){
        return this.birthday;
    }
    /** 出生日期;出生日期 */
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    /** 职务;职务 */
    public String getPost(){
        return this.post;
    }
    /** 职务;职务 */
    public void setPost(String post){
        this.post = post;
    }
    /** 手机号;手机号 */
    public String getTelephone(){
        return this.telephone;
    }
    /** 手机号;手机号 */
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    /** 座机号;座机号 */
    public String getLandline(){
        return this.landline;
    }
    /** 座机号;座机号 */
    public void setLandline(String landline){
        this.landline = landline;
    }
    /** 邮箱;邮箱 */
    public String getEmail(){
        return this.email;
    }
    /** 邮箱;邮箱 */
    public void setEmail(String email){
        this.email = email;
    }
    /** QQ;qq号码 */
    public String getQq(){
        return this.qq;
    }
    /** QQ;qq号码 */
    public void setQq(String qq){
        this.qq = qq;
    }
    /** 公司地址;公司地址 */
    public String getCompanyAddress(){
        return this.companyAddress;
    }
    /** 公司地址;公司地址 */
    public void setCompanyAddress(String companyAddress){
        this.companyAddress = companyAddress;
    }
    /** 备注;备注 */
    public String getRemarks(){
        return this.remarks;
    }
    /** 备注;备注 */
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }
    /** 状态;1版权方，2运营方 */
    public Integer getStatus(){
        return this.status;
    }
    /** 状态;1版权方，2运营方 */
    public void setStatus(Integer status){
        this.status = status;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }
}
