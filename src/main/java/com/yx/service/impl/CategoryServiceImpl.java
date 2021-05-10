package com.yx.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yx.bean.Category;
import com.yx.dao.CategoryDao;
import com.yx.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryDao categoryDao;
    @Override
    public List<Category> find() {
        return categoryDao.selectList(Wrappers.query());
    }
    @Override
    public int add(Category category) {
        return categoryDao.insert(category);
    }
    @Override
    public Category findById(Integer id) {
        return categoryDao.selectById(id);
    }
    @Override
    public int update(Category category) {
        return categoryDao.updateById(category);
    }
    @Override
    public int delete(Integer id) {
        return categoryDao.deleteById(id);
    }
}
