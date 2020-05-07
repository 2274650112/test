package com.blb.service.Impl;

import com.blb.bean.Role;
import com.blb.bean.RoleMenu;
import com.blb.dao.RoleDao;
import com.blb.dao.RoleMenuDao;
import com.blb.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cxk
 * @Description:
 * @Date: Created in 15:44 2019/12/20
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private RoleMenuDao RoleMenuDao;
    @Override
    public List<Role> selectRole() {
        return roleDao.selectRole();
    }

    @Override
    public boolean addRole(Role role,String menuids) {
        boolean mark=false;
        if(roleDao.addrole(role)>0){
            List<Integer> list=new ArrayList<>();
            for (String s:menuids.split(",")){
                list.add(Integer.parseInt(s));
            }
            RoleMenu rm=new RoleMenu();
            for (int menuid:list) {
                rm.setMenuid(menuid);
                rm.setRoleid(roleDao.selectRoleId(role.getRolename()));
                if(RoleMenuDao.addRoleMenu(rm)>0){
                    mark=true;
                }
            }
        }
        return mark;
    }

    @Override
    public int deleteRole(int roleid) {
        if(roleDao.deleteRole(roleid)>0){
            return RoleMenuDao.deleteRoleMenu(roleid);
        }
        return -1;
    }

    @Override
    public Role selectRoleByid(Integer roleid) {
        return roleDao.selectRoleByid(roleid);
    }

    @Override
    public int upateRole(Role role) {
        return roleDao.upateRole(role);
    }

    @Override
    public List<RoleMenu> queryRoleMenuByid(Integer roleid) {
        return RoleMenuDao.queryRoleMenuByid(roleid);
    }

    @Override
    public int deleteRoleMenu(int parseInt) {
        return RoleMenuDao.deleteRoleMenu(parseInt);
    }

    @Override
    public int addRoleMenu(int rmid,Integer roleid) {
        RoleMenu rm=new RoleMenu();
        rm.setRoleid(roleid);
        rm.setMenuid(rmid);
        return RoleMenuDao.addRoleMenu(rm);
    }
}
