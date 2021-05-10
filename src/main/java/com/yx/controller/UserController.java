package com.yx.controller;

import com.github.pagehelper.PageInfo;
import com.yx.bean.User;
import com.yx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin/user")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 分页查询
     * @param user 请求参数
     * @param pageNum 当前页
     * @param pageSize 每页行数
     * @param model
     * @return
     */
    @RequestMapping("/page")
    public String page(
            User user,
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize,
            Model model) {
        PageInfo<User> page = userService.findPage(user, pageNum, pageSize);
        model.addAttribute("page", page);
        return "/user/list";
    }
    /**
     * 跳到添加页面
     * @return
     */
    @RequestMapping("/toadd")
    public String toAdd() {
        return "/user/add";
    }
    /**
     * 添加
     * @param user
     * @return
     */
    @RequestMapping("/doadd")
    public String doAdd(User user) {
        userService.add(user);
        return "redirect:/admin/user/page";
    }
    /**
     * 跳到修改页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/toupdate/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "/user/update";
    }
    @RequestMapping("/doup")
    public String doUpdate(User user) {
        userService.update(user);
        return "redirect:/admin/user/page";
    }
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        userService.delete(id);
        return "redirect:/admin/user/page";
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public String batchDelete(@RequestParam("ids") Integer[] ids) {
        for (Integer id : ids) {
            userService.delete(id);
        }
        return "redirect:/admin/user/page";
    }
}
