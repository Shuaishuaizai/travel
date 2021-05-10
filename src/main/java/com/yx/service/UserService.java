package com.yx.service;

import com.github.pagehelper.PageInfo;
import com.yx.bean.User;

import java.util.List;

public interface UserService {

    /**
     * 分页查询
     * @param conditioin 查询条件
     * @return
     */
    public PageInfo<User> findPage(User conditioin, int pageNum, int pageSize);
    /**
     * 查询
     * @param conditioin 查询条件
     * @return
     */
    public List<User> find(User conditioin);
    /**
     * 添加
     * @param user
     * @return
     */
    public int add(User user);
    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    public User findById(Integer id);
    /**
     * 修改
     * @param user
     * @return
     */
    public int update(User user);
    /**
     * 删除
     实现类
     注意：分页方法采用的lambda表达式的写法
     测试
     * @param id
     * @return
     */
    public int delete(Integer id);
}
