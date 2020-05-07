package com.blb.dao;

import com.blb.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: cxk
 * @Description: 用户操作
 * @Date: Created in 11:32 2019/12/20
 */
public interface UserDao {
    public Integer checkLoginName(String email);

    User login(@Param("email") String email,@Param("password") String password);

    int zhuce(User user);

    int changepwd(@Param("newpwd") String newpwd,@Param("userid") Integer userid);
}
