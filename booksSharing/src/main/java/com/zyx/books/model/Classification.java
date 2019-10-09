package com.zyx.books.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 童书分类
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
@TableName("book_share_classification")
public class Classification implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类编号
     */
    @TableId("classification_id")
    private String classificationId;
    /**
     * 分类名称
     */
    @TableField("classification_name")
    private String classificationName;
    /**
     * 分类PID
     */
    @TableField("classification_pid")
    private String classificationPid;
    /**
     * 创建时间
     */
    private Date setupTime;
    /**
     * 更新时间
     */
    @TableField("update_Time")
    private Date updateTime;
    @TableField("Column_6")
    private String column6;
    @TableField("Column_7")
    private String column7;
    @TableField("Column_8")
    private String column8;


    public String getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(String classificationId) {
        this.classificationId = classificationId;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    public String getClassificationPid() {
        return classificationPid;
    }

    public void setClassificationPid(String classificationPid) {
        this.classificationPid = classificationPid;
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

    public String getColumn6() {
        return column6;
    }

    public void setColumn6(String column6) {
        this.column6 = column6;
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

    @Override
    public String toString() {
        return "Classification{" +
        "classificationId=" + classificationId +
        ", classificationName=" + classificationName +
        ", classificationPid=" + classificationPid +
        ", setupTime=" + setupTime +
        ", updateTime=" + updateTime +
        ", column6=" + column6 +
        ", column7=" + column7 +
        ", column8=" + column8 +
        "}";
    }
}
