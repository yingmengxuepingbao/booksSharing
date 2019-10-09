package com.zyx.books.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 童书表
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
@TableName("book_share_childrensbooks")
public class Childrensbooks implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 童书编号
     */
    @TableId("cb_id")
    private String cbId;
    /**
     * 童书盒编号
     */
    @TableField("cb_boxNumber")
    private String cbBoxnumber;
    /**
     * 童书名称：多本书名用“,”隔开
     */
    @TableField("cb_bookName")
    private String cbBookname;
    /**
     * 是否套装：0：是；1：否
     */
    @TableField("cb_suit")
    private String cbSuit;
    /**
     * 童书本数
     */
    @TableField("cb_bookNumber")
    private String cbBooknumber;
    /**
     * 适用年龄段
     */
    @TableField("cb_applicationAge")
    private Integer cbApplicationage;
    /**
     * 价格
     */
    @TableField("cb_price")
    private String cbPrice;
    /**
     * 童书介绍
     */
    @TableField("cb_introduction")
    private String cbIntroduction;
    /**
     * 店铺编号
     */
    @TableField("shop_id")
    private String shopId;
    /**
     * 是否上架：0：上架；1：不上架
     */
    @TableField("cb_shelf")
    private String cbShelf;
    /**
     * 分类编号：三级联动
     */
    @TableField("classification_id")
    private String classificationId;
    /**
     * 是否配送 0：是；1：否
     */
    @TableField("cb_delivery")
    private Integer cbDelivery;
    /**
     * 是否同城：0：是；1：不是
     */
    @TableField("cb_sameCity")
    private Integer cbSamecity;
    /**
     * 是否到期提醒：0：是 1：否
     */
    @TableField("cb_expire")
    private Integer cbExpire;
    /**
     * 创建时间
     */
    @TableField("cb_setupTime")
    private Date cbSetuptime;
    /**
     * 更新时间
     */
    @TableField("cb_updateTime")
    private Date cbUpdatetime;
    @TableField("Column_17")
    private String column17;
    @TableField("Column_18")
    private String column18;
    @TableField("Column_19")
    private String column19;


    public String getCbId() {
        return cbId;
    }

    public void setCbId(String cbId) {
        this.cbId = cbId;
    }

    public String getCbBoxnumber() {
        return cbBoxnumber;
    }

    public void setCbBoxnumber(String cbBoxnumber) {
        this.cbBoxnumber = cbBoxnumber;
    }

    public String getCbBookname() {
        return cbBookname;
    }

    public void setCbBookname(String cbBookname) {
        this.cbBookname = cbBookname;
    }

    public String getCbSuit() {
        return cbSuit;
    }

    public void setCbSuit(String cbSuit) {
        this.cbSuit = cbSuit;
    }

    public String getCbBooknumber() {
        return cbBooknumber;
    }

    public void setCbBooknumber(String cbBooknumber) {
        this.cbBooknumber = cbBooknumber;
    }

    public Integer getCbApplicationage() {
        return cbApplicationage;
    }

    public void setCbApplicationage(Integer cbApplicationage) {
        this.cbApplicationage = cbApplicationage;
    }

    public String getCbPrice() {
        return cbPrice;
    }

    public void setCbPrice(String cbPrice) {
        this.cbPrice = cbPrice;
    }

    public String getCbIntroduction() {
        return cbIntroduction;
    }

    public void setCbIntroduction(String cbIntroduction) {
        this.cbIntroduction = cbIntroduction;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCbShelf() {
        return cbShelf;
    }

    public void setCbShelf(String cbShelf) {
        this.cbShelf = cbShelf;
    }

    public String getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(String classificationId) {
        this.classificationId = classificationId;
    }

    public Integer getCbDelivery() {
        return cbDelivery;
    }

    public void setCbDelivery(Integer cbDelivery) {
        this.cbDelivery = cbDelivery;
    }

    public Integer getCbSamecity() {
        return cbSamecity;
    }

    public void setCbSamecity(Integer cbSamecity) {
        this.cbSamecity = cbSamecity;
    }

    public Integer getCbExpire() {
        return cbExpire;
    }

    public void setCbExpire(Integer cbExpire) {
        this.cbExpire = cbExpire;
    }

    public Date getCbSetuptime() {
        return cbSetuptime;
    }

    public void setCbSetuptime(Date cbSetuptime) {
        this.cbSetuptime = cbSetuptime;
    }

    public Date getCbUpdatetime() {
        return cbUpdatetime;
    }

    public void setCbUpdatetime(Date cbUpdatetime) {
        this.cbUpdatetime = cbUpdatetime;
    }

    public String getColumn17() {
        return column17;
    }

    public void setColumn17(String column17) {
        this.column17 = column17;
    }

    public String getColumn18() {
        return column18;
    }

    public void setColumn18(String column18) {
        this.column18 = column18;
    }

    public String getColumn19() {
        return column19;
    }

    public void setColumn19(String column19) {
        this.column19 = column19;
    }

    @Override
    public String toString() {
        return "Childrensbooks{" +
        "cbId=" + cbId +
        ", cbBoxnumber=" + cbBoxnumber +
        ", cbBookname=" + cbBookname +
        ", cbSuit=" + cbSuit +
        ", cbBooknumber=" + cbBooknumber +
        ", cbApplicationage=" + cbApplicationage +
        ", cbPrice=" + cbPrice +
        ", cbIntroduction=" + cbIntroduction +
        ", shopId=" + shopId +
        ", cbShelf=" + cbShelf +
        ", classificationId=" + classificationId +
        ", cbDelivery=" + cbDelivery +
        ", cbSamecity=" + cbSamecity +
        ", cbExpire=" + cbExpire +
        ", cbSetuptime=" + cbSetuptime +
        ", cbUpdatetime=" + cbUpdatetime +
        ", column17=" + column17 +
        ", column18=" + column18 +
        ", column19=" + column19 +
        "}";
    }
}
