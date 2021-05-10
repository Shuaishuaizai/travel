package com.yx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.bean.RouteImg;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RouteImgDao extends BaseMapper<RouteImg> {
    @Select("select * from tab_route_img where rid = #{rid}")
    public List<RouteImg> findByRid(Integer rid);
}
