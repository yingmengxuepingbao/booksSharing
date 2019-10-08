package com.zyx.books.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 店铺表
 * </p>
 *
 * @author yixin123
 * @since 2019-10-08
 */
@TableName("book_share_shops")
public class Shops implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 店铺编号
     */
    @TableId("shop_id")
    private String shopId;
    /**
     * 用户编码
     */
    @TableField("u_id")
    private String uId;
    /**
     * 店铺名称
     */
    @TableField("shop_name")
    private String shopName;
    /**
     * 店铺地址
     */
    @TableField("shop_address")
    private String shopAddress;
    /**
     * 店铺联系方式
     */
    @TableField("shop_phone")
    private String shopPhone;
    /**
     * 店铺状态
     */
    @TableField("shop_state")
    private Integer shopState;
    /**
     * 是否签约
     */
    @TableField("shop_signing")
    private Integer shopSigning;
    /**
     * 结算账户编码
     */
    @TableField("bank_code")
    private String bankCode;
    /**
     * 店铺logo
     */
    @TableField("shop_logo")
    private String shopLogo;
    /**
     * 店铺认证方式：0：个人认证，1：企业认证。
     */
    @TableField("authentication_method")
    private Integer authenticationMethod;
    /**
     * 认证编码
     */
    @TableField("authentication_id")
    private String authenticationId;
    @TableField("Column_10")
    private String column10;
    @TableField("Column_11")
    private String column11;
    @TableField("Column_12")
    private String column12;


    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public Integer getShopState() {
        return shopState;
    }

    public void setShopState(Integer shopState) {
        this.shopState = shopState;
    }

    public Integer getShopSigning() {
        return shopSigning;
    }

    public void setShopSigning(Integer shopSigning) {
        this.shopSigning = shopSigning;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    public Integer getAuthenticationMethod() {
        return authenticationMethod;
    }

    public void setAuthenticationMethod(Integer authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    public String getAuthenticationId() {
        return authenticationId;
    }

    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
    }

    public String getColumn10() {
        return column10;
    }

    public void setColumn10(String column10) {
        this.column10 = column10;
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

    @Override
    public String toString() {
        return "Shops{" +
        "shopId=" + shopId +
        ", uId=" + uId +
        ", shopName=" + shopName +
        ", shopAddress=" + shopAddress +
        ", shopPhone=" + shopPhone +
        ", shopState=" + shopState +
        ", shopSigning=" + shopSigning +
        ", bankCode=" + bankCode +
        ", shopLogo=" + shopLogo +
        ", authenticationMethod=" + authenticationMethod +
        ", authenticationId=" + authenticationId +
        ", column10=" + column10 +
        ", column11=" + column11 +
        ", column12=" + column12 +
        "}";
    }
}
