package com.blb.dao;

import com.blb.bean.Role;

import java.util.List;

/**
 * @Author: cxk
 * @Description:
 * @Date: Created in 15:28 2019/12/20
 */
public interface RoleDao {
    public List<Role> selectRole();

    int addrole(Role role);
    Integer selectRoleId(String rolename);

    int deleteRole(int roleid);
    Role selectRoleByid(int roleid);

    int upateRole(Role role);
}
