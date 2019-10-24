package com.zyx.books.model;

import java.io.Serializable;

/**
 * <p>
 * 图片表-存mongoDB库
 * </p>
 *
 * @author yixin
 * @since 2019-10-14
 */
public class ShopsPicturesMongo implements Serializable {

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
     * 身份证人像面：
     */
    private String picZheng;
    /**
     * 身份证国徽面：
     */
    private String picFan;
    /**
     * 手持身份证照：
     */
    private String picRen;
    /**
     * 营业执照：
     */
    private String businessLicense;
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

	public String getBusinessLicense() {
		return businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}
	@Override
	public String toString() {
		return "ShopsPicturesMongo [picId=" + picId + ", picContent=" + picContent + ", picSort=" + picSort
				+ ", picZheng=" + picZheng + ", picFan=" + picFan + ", picRen=" + picRen + ", businessLicense="
				+ businessLicense + ", setupTime=" + setupTime + ", updateTime=" + updateTime + "]";
	}

	
}
