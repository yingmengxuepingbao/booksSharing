package com.zyx.books.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 身份认证表
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
@TableName("book_share_authentication")
public class Authentication implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 认证编码
     */
    @TableId("authentication_id")
    private String authenticationId;
    /**
     * 认证方式1：个人2：企业
     */
    @TableField("authentication_method")
    private Integer authenticationMethod;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 证件号码
     */
    private String userNumber;
    /**
     * 身份证正面照片
     */
    @TableField("pic_zheng")
    private String picZheng;
    /**
     * 身份证 反面照片
     */
    @TableField("pic_fan")
    private String picFan;
    /**
     * 手持身份证照片
     */
    @TableField("pic_ren")
    private String picRen;
    /**
     * 法人代表名称
     */
    private String legalName;
    /**
     * 营业执照
     */
    @TableField("business_license")
    private String businessLicense;
    /**
     * 统一社会信用代码
     */
    @TableField("xinyong_code")
    private String xinyongCode;
    @TableField("Column_7")
    private String column7;
    @TableField("Column_8")
    private String column8;
    @TableField("Column_9")
    private String column9;


    public String getAuthenticationId() {
        return authenticationId;
    }

    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
    }

    public Integer getAuthenticationMethod() {
        return authenticationMethod;
    }

    public void setAuthenticationMethod(Integer authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getPicZheng() {
        return picZheng;
    }

    public void setPicZheng(String picZheng) {
        this.picZheng = picZheng;
    }

    public String getPicFan() {
        return picFan;
    }

    public void setPicFan(String picFan) {
        this.picFan = picFan;
    }

    public String getPicRen() {
        return picRen;
    }

    public void setPicRen(String picRen) {
        this.picRen = picRen;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getXinyongCode() {
        return xinyongCode;
    }

    public void setXinyongCode(String xinyongCode) {
        this.xinyongCode = xinyongCode;
    }

    public String getColumn7() {
        return column7;
    }

    public void setColumn7(String column7) {
        this.column7 = column7;
    }

    public String getColumn8() {
        return column8;
    }

    public void setColumn8(String column8) {
        this.column8 = column8;
    }

    public String getColumn9() {
        return column9;
    }

    public void setColumn9(String column9) {
        this.column9 = column9;
    }

    @Override
    public String toString() {
        return "Authentication{" +
        "authenticationId=" + authenticationId +
        ", authenticationMethod=" + authenticationMethod +
        ", userName=" + userName +
        ", userNumber=" + userNumber +
        ", picZheng=" + picZheng +
        ", picFan=" + picFan +
        ", picRen=" + picRen +
        ", legalName=" + legalName +
        ", businessLicense=" + businessLicense +
        ", xinyongCode=" + xinyongCode +
        ", column7=" + column7 +
        ", column8=" + column8 +
        ", column9=" + column9 +
        "}";
    }
}
