package com.zyx.books.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 图片表：童书中的图片
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
@TableName("book_share_pictures")
public class Pictures implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片编号
     */
    @TableId("pic_id")
    private String picId;
    /**
     * 店铺编号
     */
    @TableField("shop_id")
    private String shopId;
    /**
     * 童书编号
     */
    @TableField("cb_id")
    private String cbId;
    /**
     * 图片内容：二进制
     */
    @TableField("pic_content")
    private String picContent;
    /**
     * 图片分类：0：轮播图；1：详情图片；2：商铺logo
     */
    @TableField("pic_sort")
    private Integer picSort;
    /**
     * 图片大小
     */
    @TableField("pic_size")
    private String picSize;
    /**
     * 图片URL
     */
    @TableField("pic_url")
    private String picUrl;
    /**
     * 创建时间
     */
    @TableField("setup_time")
    private Date setupTime;
    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;
    @TableField("Column_7")
    private String column7;
    @TableField("Column_8")
    private String column8;
    @TableField("Column_9")
    private String column9;


    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCbId() {
        return cbId;
    }

    public void setCbId(String cbId) {
        this.cbId = cbId;
    }

    public String getPicContent() {
        return picContent;
    }

    public void setPicContent(String picContent) {
        this.picContent = picContent;
    }

    public Integer getPicSort() {
        return picSort;
    }

    public void setPicSort(Integer picSort) {
        this.picSort = picSort;
    }

    public String getPicSize() {
        return picSize;
    }

    public void setPicSize(String picSize) {
        this.picSize = picSize;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
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
        return "Pictures{" +
        "picId=" + picId +
        ", shopId=" + shopId +
        ", cbId=" + cbId +
        ", picContent=" + picContent +
        ", picSort=" + picSort +
        ", picSize=" + picSize +
        ", picUrl=" + picUrl +
        ", setupTime=" + setupTime +
        ", updateTime=" + updateTime +
        ", column7=" + column7 +
        ", column8=" + column8 +
        ", column9=" + column9 +
        "}";
    }
}
