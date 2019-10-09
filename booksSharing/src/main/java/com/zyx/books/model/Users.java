package com.zyx.books.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
@TableName("book_share_users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编码
     */
    @TableId("u_id")
    private String uId;
    /**
     * 用户昵称
     */
    @TableField("u_nickname")
    private String uNickname;
    /**
     * 用户名称
     */
    @TableField("u_name")
    private String uName;
    /**
     * 用户密码
     */
    @TableField("u_password")
    private String uPassword;
    /**
     * 用户电话
     */
    @TableField("u_phone")
    private String uPhone;
    /**
     * 用户邮箱
     */
    @TableField("u_email")
    private String uEmail;
    /**
     * 用户性别：0：女；1：男
     */
    @TableField("u_sex")
    private Integer uSex;
    /**
     * 用户年龄
     */
    @TableField("u_age")
    private String uAge;
    /**
     * 邀请人编号
     */
    @TableField("u_parent_id")
    private String uParentId;
    /**
     * 签到天数
     */
    @TableField("sign_day")
    private Integer signDay;
    /**
     * 用户角色：1：普通用户；2：普通商户；3：管理员
     */
    @TableField("u_role")
    private Integer uRole;
    /**
     * 用户微信qq编号，关联第三方登录表
     */
    @TableField("u_wx_id")
    private String uWxId;
    /**
     * 用户qq编码
     */
    @TableField("u_qq_id")
    private String uQqId;
    /**
     * 创建时间
     */
    @TableField("u_setup_time")
    private Date uSetupTime;
    /**
     * 更新时间
     */
    @TableField("u_update_time")
    private Date uUpdateTime;
    @TableField("Column_17")
    private String column17;
    @TableField("Column_18")
    private String column18;
    @TableField("Column_19")
    private String column19;


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public Integer getuSex() {
        return uSex;
    }

    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }

    public String getuAge() {
        return uAge;
    }

    public void setuAge(String uAge) {
        this.uAge = uAge;
    }

    public String getuParentId() {
        return uParentId;
    }

    public void setuParentId(String uParentId) {
        this.uParentId = uParentId;
    }

    public Integer getSignDay() {
        return signDay;
    }

    public void setSignDay(Integer signDay) {
        this.signDay = signDay;
    }

    public Integer getuRole() {
        return uRole;
    }

    public void setuRole(Integer uRole) {
        this.uRole = uRole;
    }

    public String getuWxId() {
        return uWxId;
    }

    public void setuWxId(String uWxId) {
        this.uWxId = uWxId;
    }

    public String getuQqId() {
        return uQqId;
    }

    public void setuQqId(String uQqId) {
        this.uQqId = uQqId;
    }

    public Date getuSetupTime() {
        return uSetupTime;
    }

    public void setuSetupTime(Date uSetupTime) {
        this.uSetupTime = uSetupTime;
    }

    public Date getuUpdateTime() {
        return uUpdateTime;
    }

    public void setuUpdateTime(Date uUpdateTime) {
        this.uUpdateTime = uUpdateTime;
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
        return "Users{" +
        "uId=" + uId +
        ", uNickname=" + uNickname +
        ", uName=" + uName +
        ", uPassword=" + uPassword +
        ", uPhone=" + uPhone +
        ", uEmail=" + uEmail +
        ", uSex=" + uSex +
        ", uAge=" + uAge +
        ", uParentId=" + uParentId +
        ", signDay=" + signDay +
        ", uRole=" + uRole +
        ", uWxId=" + uWxId +
        ", uQqId=" + uQqId +
        ", uSetupTime=" + uSetupTime +
        ", uUpdateTime=" + uUpdateTime +
        ", column17=" + column17 +
        ", column18=" + column18 +
        ", column19=" + column19 +
        "}";
    }
}
