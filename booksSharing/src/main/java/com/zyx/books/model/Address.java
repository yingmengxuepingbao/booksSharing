package com.zyx.books.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 地址表
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
@TableName("book_share_address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地址编码
     */
    @TableId("address_id")
    private String addressId;
    /**
     * 用户编码
     */
    @TableField("u_id")
    private String uId;
    /**
     * 收货人
     */
    @TableField("address_uname")
    private String addressUname;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 所在地区
     */
    @TableField("address_content")
    private String addressContent;
    /**
     * 详细地址
     */
    @TableField("address_details")
    private String addressDetails;
    /**
     * 是否默认 0：默认；1：非默认
     */
    @TableField("address_default")
    private Integer addressDefault;
    /**
     * 地址标签。1：家，2：公司；3：学校；4：自定义
     */
    @TableField("address_abel")
    private String addressAbel;
    /**
     * 创建时间
     */
    @TableField("setup_time")
    private Date setupTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    @TableField("Column_11")
    private String column11;
    @TableField("Column_12")
    private String column12;
    @TableField("Column_13")
    private String column13;


    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getAddressUname() {
        return addressUname;
    }

    public void setAddressUname(String addressUname) {
        this.addressUname = addressUname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressContent() {
        return addressContent;
    }

    public void setAddressContent(String addressContent) {
        this.addressContent = addressContent;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    public Integer getAddressDefault() {
        return addressDefault;
    }

    public void setAddressDefault(Integer addressDefault) {
        this.addressDefault = addressDefault;
    }

    public String getAddressAbel() {
        return addressAbel;
    }

    public void setAddressAbel(String addressAbel) {
        this.addressAbel = addressAbel;
    }

    public Date getSetupTime() {
        return setupTime;
    }

    public void setSetupTime(Date setupTime) {
        this.setupTime = setupTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getColumn11() {
        return column11;
    }

    public void setColumn11(String column11) {
        this.column11 = column11;
    }

    public String getColumn12() {
        return column12;
    }

    public void setColumn12(String column12) {
        this.column12 = column12;
    }

    public String getColumn13() {
        return column13;
    }

    public void setColumn13(String column13) {
        this.column13 = column13;
    }

    @Override
    public String toString() {
        return "Address{" +
        "addressId=" + addressId +
        ", uId=" + uId +
        ", addressUname=" + addressUname +
        ", phone=" + phone +
        ", addressContent=" + addressContent +
        ", addressDetails=" + addressDetails +
        ", addressDefault=" + addressDefault +
        ", addressAbel=" + addressAbel +
        ", setupTime=" + setupTime +
        ", updateTime=" + updateTime +
        ", column11=" + column11 +
        ", column12=" + column12 +
        ", column13=" + column13 +
        "}";
    }
}
