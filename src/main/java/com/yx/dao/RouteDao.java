package com.yx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.bean.Route;
import com.yx.bean.RouteImg;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RouteDao extends BaseMapper<Route> {
    /**
     * 分页查询
     * @param conditioin
     * @return
     */
    public List<Route> find(Route conditioin);
    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    public Route findById(Integer id);

//    @Select("select * from tab_route_img where rid = #{rid}")
//    public List<RouteImg> findByRid(Integer rid);
}
