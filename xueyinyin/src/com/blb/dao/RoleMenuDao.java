package com.blb.dao;

import com.blb.bean.RoleMenu;

import java.util.List;

/**
 * @Author: cxk
 * @Description:
 * @Date: Created in 17:04 2019/12/20
 */
public interface RoleMenuDao {
    int addRoleMenu(RoleMenu rm);
    int deleteRoleMenu(int roleid);

    List<RoleMenu> queryRoleMenuByid(Integer roleid);
}
