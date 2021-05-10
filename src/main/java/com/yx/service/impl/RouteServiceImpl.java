package com.yx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yx.bean.Route;
import com.yx.dao.RouteDao;
import com.yx.service.RouteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RouteServiceImpl implements RouteService {
    @Resource
    private RouteDao routeDao;

    @Override
    public PageInfo<Route> findPage(Route conditioin, int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> {
            routeDao.find(conditioin);
        });
    }
    @Override
    public int add(Route route) {
        return routeDao.insert(route);
    }
    @Override
    public Route findById(Integer id) {
        return routeDao.findById(id);
    }
    @Override
    public int update(Route route) {
        return routeDao.updateById(route);
    }
    @Override
    public int delete(Integer id) {
        return routeDao.deleteById(id);
    }
}
