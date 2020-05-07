package com.blb.service.Impl;

import com.blb.bean.Menu;
import com.blb.dao.MenuDao;
import com.blb.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cxk
 * @Description:
 * @Date: Created in 16:28 2019/12/20
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao menuDao;
    @Override
    public List<Menu> selectMenus() {
        return menuDao.selectMenus();
    }
}
