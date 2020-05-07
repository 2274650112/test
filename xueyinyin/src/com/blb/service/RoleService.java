package com.blb.service;

import com.blb.bean.Role;
import com.blb.bean.RoleMenu;

import java.util.List;

/**
 * @Author: cxk
 * @Description:
 * @Date: Created in 15:43 2019/12/20
 */
public interface RoleService {
    public List<Role> selectRole();

    boolean addRole(Role role,String menuids);

    int deleteRole(int roleid);

    Role selectRoleByid(Integer roleid);

    int upateRole(Role role);

    List<RoleMenu> queryRoleMenuByid(Integer roleid);

    int deleteRoleMenu(int rmid);

    int addRoleMenu(int rmid,Integer roleid);
}
