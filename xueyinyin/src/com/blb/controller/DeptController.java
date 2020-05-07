package com.blb.controller;

import com.blb.bean.Dept;
import com.blb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: cxk
 * @Description:
 * @Date: Created in 18:06 2019/12/20
 */
@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("queryAlldept.do")
    public String queryAlldept(Model model){
        List<Dept> dlist=deptService.queryAllDept();
        if(dlist.size()>0){
            model.addAttribute("depts",dlist);
            return "deptInfo";
        }
        return "mainpage.jsp";
    }
}
