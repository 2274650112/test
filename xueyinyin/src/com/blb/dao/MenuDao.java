package com.blb.dao;

import com.blb.bean.Menu;

import java.util.List;

/**
 * @Author: cxk
 * @Description:
 * @Date: Created in 16:21 2019/12/20
 */
public interface MenuDao {
    public List<Menu> selectMenus();
}
