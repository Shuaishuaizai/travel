package com.yx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.bean.User;

import java.util.List;

public interface UserDao extends BaseMapper<User> {

    List<User> findUserList(User user);
}
