package com.blb.bean;

import java.sql.Timestamp;

/**
 * @Author: cxk
 * @Description:
 * @Date: Created in 16:13 2019/12/20
 */
public class Menu {
    private Integer menuid;// bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
    private Integer menuparaid;// bigint(20) DEFAULT NULL COMMENT '上级菜单ID',
    private String menuname;// varchar(50) DEFAULT NULL COMMENT '菜单名称',
    private String menucode;// varchar(50) DEFAULT NULL COMMENT '菜单编码',
    private Integer menuno;// int(10) DEFAULT NULL COMMENT '菜单序号',
    private String menuurl;// varchar(200) DEFAULT NULL COMMENT '菜单URL',
    private String menuimgurl;// varchar(300) DEFAULT NULL COMMENT '菜单图片地址url',
    private Integer  dr;// int(1) NOT NULL DEFAULT '0' COMMENT '删除标志 0未删除 1已删除',
    private Integer menutype;// int(1) DEFAULT NULL COMMENT '菜单类型',
    private Timestamp create_time;// timestamp NULL DEFAULT NULL COMMENT '创建时间',
    private Timestamp update_time;// timestamp NULL DEFAULT NULL COMMENT '更新时间',
    private Integer create_id;// bigint(20) DEFAULT NULL COMMENT '创建人',
    private Integer update_id;// bigint(20) DEFAULT NULL COMMENT '更新人',

    private String checked;
    public Menu() {
    }

    public Menu(Integer menuid, Integer menuparaid, String menuname, String menucode, Integer menuno, String menuurl, String menuimgurl, Integer dr, Integer menutype, Timestamp create_time, Timestamp update_time, Integer create_id, Integer update_id) {
        this.menuid = menuid;
        this.menuparaid = menuparaid;
        this.menuname = menuname;
        this.menucode = menucode;
        this.menuno = menuno;
        this.menuurl = menuurl;
        this.menuimgurl = menuimgurl;
        this.dr = dr;
        this.menutype = menutype;
        this.create_time = create_time;
        this.update_time = update_time;
        this.create_id = create_id;
        this.update_id = update_id;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getMenuparaid() {
        return menuparaid;
    }

    public void setMenuparaid(Integer menuparaid) {
        this.menuparaid = menuparaid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode;
    }

    public Integer getMenuno() {
        return menuno;
    }

    public void setMenuno(Integer menuno) {
        this.menuno = menuno;
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    public String getMenuimgurl() {
        return menuimgurl;
    }

    public void setMenuimgurl(String menuimgurl) {
        this.menuimgurl = menuimgurl;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public Integer getMenutype() {
        return menutype;
    }

    public void setMenutype(Integer menutype) {
        this.menutype = menutype;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }

    public Integer getCreate_id() {
        return create_id;
    }

    public void setCreate_id(Integer create_id) {
        this.create_id = create_id;
    }

    public Integer getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(Integer update_id) {
        this.update_id = update_id;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }
}
