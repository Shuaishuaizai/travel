package com.yx.service.impl;

import com.github.pagehelper.PageInfo;
import com.yx.bean.User;
import com.yx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Arrays;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Resource
    private UserService userService;
    @Test
    public void testFindPage() {
        User u = new User();
//        u.setName("张继科");
//        System.out.println(u.getName());
        PageInfo<User> page = userService.findPage(u, 1, 10);
        page.getList().forEach(System.out :: println);
        System.out.println("总行数=" + page.getTotal());
        System.out.println("当前页=" + page.getPageNum());
        System.out.println("每页行数=" + page.getPageSize());
        System.out.println("总页数=" + page.getPages());
        System.out.println("起始行数=" + page.getStartRow());
        System.out.println("是第一页=" + page.isIsFirstPage());
        System.out.println("是最后页=" + page.isIsLastPage());
        System.out.println("还有下一页=" + page.isHasNextPage());
        System.out.println("还有上一页=" + page.isHasPreviousPage());
        System.out.println("页码列表" + Arrays.toString(page.getNavigatepageNums()));
    }


}