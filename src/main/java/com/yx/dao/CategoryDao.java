package com.yx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.bean.Category;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryDao extends BaseMapper<Category> {

    List<Category> findAllCategory(Category category);

    @Select("SELECT cname,cid FROM tab_category WHERE cid=#{id}")
    public Category findById(Integer id);
}
