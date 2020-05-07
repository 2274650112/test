package com.blb.bean;

/**
 * @Author: cxk
 * @Description: 角色权限
 * @Date: Created in 11:24 2019/12/20
 */
public class RoleMenu {
    private  Integer id;// bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    private  Integer roleid;// bigint(20) DEFAULT NULL COMMENT '角色id',
    private  Integer menuid;// bigint(20) DEFAULT NULL COMMENT '菜单id',
    private  Integer dr;// int(1) DEFAULT '0' COMMENT '删除标志 0未删除 1已删除',

    public RoleMenu() {
    }

    public RoleMenu(Integer id, Integer roleid, Integer menuid, Integer dr) {
        this.id = id;
        this.roleid = roleid;
        this.menuid = menuid;
        this.dr = dr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
                "id=" + id +
                ", roleid=" + roleid +
                ", menuid=" + menuid +
                ", dr=" + dr +
                '}';
    }
}
