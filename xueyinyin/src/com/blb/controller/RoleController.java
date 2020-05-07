package com.blb.controller;

import com.blb.bean.Dept;
import com.blb.bean.Menu;
import com.blb.bean.Role;
import com.blb.bean.RoleMenu;
import com.blb.service.DeptService;
import com.blb.service.MenuService;
import com.blb.service.RoleService;
import org.bouncycastle.math.raw.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: cxk
 * @Description: 角色操作
 * @Date: Created in 15:41 2019/12/20
 */
@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("queryRole.do")
    public String queryRole(Model model){
        List<Role> list=roleService.selectRole();
        if(list.size()>0){
            model.addAttribute("rolelist",list);
            return "roleManage";
        }
        return "";
    }
    @Autowired
    private DeptService deptService;
    @Autowired
    private MenuService menuService;
    @RequestMapping("addRoleView.do")
    public String addRoleView(Model model){
        List<Dept> dlist=deptService.queryAllDept();
        List<Menu> mlist=menuService.selectMenus();
        model.addAttribute("depts",dlist);
        model.addAttribute("menus",mlist);
        return "addRoleView";
    }
    @RequestMapping("addRole.do")
    public String addRole(Role role,String menuids){
        if(roleService.addRole(role,menuids)){
            return "redirect:queryRole.do";
        }else{
            return "addRoleView";
        }
    }
    @RequestMapping("deleteRole.do")
    public String deleteRole(int roleid){
        if(roleService.deleteRole(roleid)>0){
            return "redirect:queryRole.do";
        }
        return "redirect:queryRole.do";
    }

    @RequestMapping("selectRoleByid.do")
    public String  selectRoleByid(Integer roleid,Model model){
        Role role=roleService.selectRoleByid(roleid);
        List<Dept> dlist=deptService.queryAllDept();
        model.addAttribute("role",role);
        model.addAttribute("depts",dlist);
        return "upateRole";
    }

    @RequestMapping("upateRole.do")
    public String  upateRole(Role role){
        if(roleService.upateRole(role)>0){
            return "redirect:queryRole.do";
        }
        return "upateRole.jsp";
    }

    @RequestMapping("allocation.do")
    public String  allocation(Integer roleid,Model model){
        List<Menu> mlist=menuService.selectMenus();
        model.addAttribute("menus",mlist);
        List<RoleMenu> roleMenu=roleService.queryRoleMenuByid(roleid);
        model.addAttribute("roleMenu",roleMenu);
        model.addAttribute("rid",roleid);
        for(int i=0;i<mlist.size();i++){
            for (int j=0;j<roleMenu.size();j++){
                if(mlist.get(i).getMenuid()==roleMenu.get(j).getMenuid()){
                    mlist.get(i).setChecked("checked");
                    continue;
                }
            }
        }
        return "allocation";
    }

    @RequestMapping("allocationMenu.do")
    public String  allocationMenu(String menuids,Integer roleid){
        int row=0;
        roleService.deleteRoleMenu(roleid);
        for (String s:menuids.split(",")){
            row= roleService.addRoleMenu(Integer.parseInt(s),roleid);
        }
        if(row>0){
            return "redirect:queryRole.do";
        }
        return "redirect:allocation.do";
    }
}
