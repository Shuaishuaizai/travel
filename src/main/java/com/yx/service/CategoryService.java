package com.yx.service;

import com.yx.bean.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> find();
    /**
     * 添加
     * @param category
     * @return
     */
    public int add(Category category);
    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Category findById(Integer id);
    /**
     * 修改
     * @param category
     * @return
     */
    public int update(Category category);
    /**
     * 删除
     * @param id
     * @return
     */
    public int delete(Integer id);
}
