package com.blb.bean;

import java.sql.Timestamp;

/**
 * @Author: cxk
 * @Description:角色表
 * @Date: Created in 11:20 2019/12/20
 */
public class Role {
    private Integer roleid;// bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
    private String rolename;//  varchar(50) DEFAULT NULL COMMENT '角色名称',
    private Integer deptid;//  bigint(20) DEFAULT NULL COMMENT '所属部门ID',
    private Integer dr;//  int(1) NOT NULL DEFAULT '0' COMMENT '删除标志 0未删除 1已删除',
    private Timestamp create_time;//  timestamp NULL DEFAULT NULL COMMENT '创建时间',
    private Integer create_id;//  bigint(20) DEFAULT NULL COMMENT '创建人',
    private Timestamp update_time;//  timestamp NULL DEFAULT NULL COMMENT '修改时间',
    private Integer update_id;//  bigint(20) DEFAULT NULL COMMENT '修改人',

    private String jurisdiction;
    private String deptname;

    public Role() {
    }

    public Role(Integer roleid, String rolename, Integer deptid, Integer dr, Timestamp create_time, Integer create_id, Timestamp update_time, Integer update_id, String jurisdiction, String deptname) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.deptid = deptid;
        this.dr = dr;
        this.create_time = create_time;
        this.create_id = create_id;
        this.update_time = update_time;
        this.update_id = update_id;
        this.jurisdiction = jurisdiction;
        this.deptname = deptname;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Integer getCreate_id() {
        return create_id;
    }

    public void setCreate_id(Integer create_id) {
        this.create_id = create_id;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }

    public Integer getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(Integer update_id) {
        this.update_id = update_id;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }


}
