package com.blb.bean;

/**
 * @Author: cxk
 * @Description:用户表
 * @Date: Created in 11:16 2019/12/20
 */
public class User {
    private Integer userid;// bigint(30) NOT NULL AUTO_INCREMENT COMMENT '用户id',
    private String username;// varchar(50) DEFAULT NULL COMMENT '用户真实姓名',
    private String nickname;// varchar(100) DEFAULT NULL COMMENT '用户昵称',
    private String  password;// varchar(50) DEFAULT NULL COMMENT '密码',
    private String email;// varchar(50) DEFAULT NULL COMMENT '邮箱',
    private String phone;// varchar(20) DEFAULT NULL COMMENT '手机号码',
    private Integer deptid;// bigint(30) DEFAULT NULL COMMENT '部门ID',
    private Integer roleid;// bigint(30) DEFAULT NULL COMMENT '角色ID',
    private Integer sex;// int(1) DEFAULT '0' COMMENT '性别  0男  1女',
    private String note;// varchar(200) DEFAULT NULL COMMENT '备注',
    private Integer ischange ;//int(1) DEFAULT '0' COMMENT '是否修改密码 0无1修改',
    private String remember;

    public User() {
    }

    public User(Integer userid, String username, String nickname, String password, String email, String phone, Integer deptid, Integer roleid, Integer sex, String note, Integer ischange, String remember) {
        this.userid = userid;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.deptid = deptid;
        this.roleid = roleid;
        this.sex = sex;
        this.note = note;
        this.ischange = ischange;
        this.remember = remember;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getIschange() {
        return ischange;
    }

    public void setIschange(Integer ischange) {
        this.ischange = ischange;
    }

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }
}
