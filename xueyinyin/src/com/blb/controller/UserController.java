package com.blb.controller;

import com.blb.bean.User;
import com.blb.dao.UserDao;
import com.blb.service.UserService;
import com.blb.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: cxk
 * @Description:用户模块
 * @Date: Created in 10:33 2019/12/20
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("loginView.do")
    public String loginView(){
        return "login";
    }
    @RequestMapping("checkName.do")
    public @ResponseBody String checkloginName(String email){
        if(userService.chenckLonginName(email)){
            return "1";
        }
        return  "-1";
    }
    @RequestMapping("login.do")
    public String login(String email, String sign, String password, String remember, HttpServletResponse response, HttpServletRequest request){
        email=email+sign;
        User user=userService.login(email,password);
        if(user!=null){
            UserContext.setLoginUser(user);
            Cookie namecookie=new Cookie("cname", email);
            namecookie.setPath(request.getContextPath());
            if("remember".equals(remember)){
                    namecookie.setMaxAge(7*24*60*60);
            }else{
                    namecookie.setMaxAge(0);
            }


            return "redirect:mainView.do";
        }else{
            request.setAttribute("msg","登录失败");
            return "login";
        }
    }

    @RequestMapping("mainView.do")
    public String mainView(){
        if(UserContext.getLoginUser()!=null){
            return "mainpage";
        }
        return "login";
    }
    @RequestMapping("zhuceView.do")
    public String zhuceView(){
        return "zhuce";
    }
    @RequestMapping("zhuce.do")
    public String zhuce(User user,String sign){
        user.setEmail(user.getEmail()+sign);
        if(userService.zhuce(user)>0){
            return "login";
        }else{
            return "zhuce";
        }
    }

    /*
    * 账号退出
    * */
    @RequestMapping("quitLogin.do")
    public String quitLogin(){
        UserContext.clearLoginUser();
        return "login";
    }

    /*
    * 修改密码
    * */
    @RequestMapping("changepwdViwe.do")
    public String changepassword(){
        return "changepwd";
    }

    /*
    * 查看密码是否正确
    * */
    @RequestMapping("checkpwd.do")
    public @ResponseBody String checkpwd(String oldpassword){
        if(userService.checkpwd(oldpassword)){
            return "1";
        }else{
            return "-1";
        }

    }

    @RequestMapping("changepwd.do")
    public String changepwd(String newpwd){
        if(userService.changepwd(newpwd,UserContext.getLoginUser().getUserid())>0){
            return "login";
        }else{
            return "changepwd";
        }

    }

}
