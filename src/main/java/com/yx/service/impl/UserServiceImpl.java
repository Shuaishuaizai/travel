package com.yx.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yx.bean.User;
import com.yx.dao.UserDao;
import com.yx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public PageInfo<User> findPage(User user, int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> {
            userDao.findUserList(user);
        });
    }
    @Override
    public List<User> find(User user) {
        return userDao.selectList(Wrappers.<User>query().setEntity(user));
    }
    @Override
    public int add(User user) {
        return userDao.insert(user);
    }
    @Override
    public User findById(Integer id) {
        return userDao.selectById(id);
    }
    @Override
    public int update(User user) {
        return userDao.updateById(user);
    }
    @Override
    public int delete(Integer id) {
        return userDao.deleteById(id);
    }
}
