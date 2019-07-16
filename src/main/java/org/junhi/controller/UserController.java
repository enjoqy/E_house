package org.junhi.controller;

import com.github.pagehelper.PageInfo;
import org.junhi.domain.User;
import org.junhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author junhi
 * @date 2019/7/14 15:16
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有的用户
     * @return
     */
    @RequestMapping(value = "/findAll", produces="text/html;charset=UTF-8")
    @ResponseBody
    public PageInfo<User> findAll(@RequestParam(value = "currentPage", defaultValue = "1")Integer currentPage,
                                  @RequestParam(value = "pageSize", defaultValue = "10")Integer pageSize){
        return userService.findAll(currentPage, pageSize);
    }

}
