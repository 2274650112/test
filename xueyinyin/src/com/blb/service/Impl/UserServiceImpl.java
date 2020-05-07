package com.blb.service.Impl;

import com.blb.bean.User;
import com.blb.dao.UserDao;
import com.blb.service.UserService;
import com.blb.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: cxk
 * @Description:
 * @Date: Created in 11:41 2019/12/20
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean chenckLonginName(String email) {
        return userDao.checkLoginName(email)!=null;
    }

    @Override
    public User login(String email, String password) {
        return userDao.login(email,password);
    }

    @Override
    public int zhuce(User user) {
        return userDao.zhuce(user);
    }

    @Override
    public boolean checkpwd(String oldpwd) {
        System.out.println(oldpwd);
        return userDao.login(UserContext.getLoginUser().getEmail(),oldpwd)!=null;
    }

    @Override
    public int changepwd(String newpwd, Integer userid) {
        return userDao.changepwd(newpwd,userid);
    }
}
