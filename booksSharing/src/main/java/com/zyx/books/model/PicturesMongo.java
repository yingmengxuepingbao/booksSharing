package com.zyx.books.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

/**
 * <p>
 * 图片表-存mongoDB库
 * </p>
 *
 * @author yixin
 * @since 2019-10-14
 */
public class PicturesMongo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片编号
     */
    private String picId;
    
    /**
     * 图片内容：二进制
     */
    private String picContent;
    /**
     * 图片分类：0：轮播图；1：详情图片；2：商铺logo
     */
    private Integer picSort;
    /**
     * 创建时间
     */
    private String setupTime;
    /**
     * 修改时间
     */
    private String updateTime;

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
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

    public String getSetupTime() {
        return setupTime;
    }

    public void setSetupTime(String setupTime) {
        this.setupTime = setupTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Pictures{" +
        "picId=" + picId +
        ", picContent=" + picContent +
        ", picSort=" + picSort +
        ", setupTime=" + setupTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
