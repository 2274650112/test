package com.blb.service.Impl;

import com.blb.bean.Dept;
import com.blb.dao.DeptDao;
import com.blb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cxk
 * @Description:
 * @Date: Created in 16:27 2019/12/20
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Dept> queryAllDept() {
        return deptDao.queryAllDept();
    }
}
