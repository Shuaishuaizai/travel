package com.yx.service;

import com.github.pagehelper.PageInfo;
import com.yx.bean.Route;

public interface RouteService {
    /**
     * 分页查询
     * @param conditioin 查询条件
     * @return
     */
    public PageInfo<Route> findPage(Route conditioin, int pageNum, int pageSize);
    /**
     * 添加
     * @param route
     * @return
     */
    public int add(Route route);
    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    public Route findById(Integer id);
    /**
     * 修改
     * @param route
     * @return
     */
    public int update(Route route);
    /**
     * 删除
     * @param id
     * @return
     */
    public int delete(Integer id);
}