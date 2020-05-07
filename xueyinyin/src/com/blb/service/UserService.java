package com.blb.service;

import com.blb.bean.User;

/**
 * @Author: cxk
 * @Description:
 * @Date: Created in 11:40 2019/12/20
 */
public interface UserService {
    public boolean chenckLonginName(String email);

    User login(String email, String password);

    int zhuce(User user);

    boolean checkpwd(String oldpwd);

    int changepwd(String newpwd, Integer userid);
}
