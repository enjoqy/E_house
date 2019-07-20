package org.junhi.controller;

import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.junhi.domain.ResultInfo;
import org.junhi.domain.User;
import org.junhi.service.UserService;
import org.junhi.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
     *
     * @return
     */
    @RequestMapping(value = "/findAll")
    @ResponseBody
    public PageInfo<User> findAll(@RequestParam(value = "currentPage", defaultValue = "1") Integer currentPage,
                                  @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        return userService.findAll(currentPage, pageSize);
    }

    /**
     * 注册用户
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/register")
    @ResponseBody
    public ResultInfo register(User user) {
        ResultInfo resultInfo = new ResultInfo();

//        if (user.getUName() == null || user.getUName().equals("")) {
        //使用apache的lang3包下的工具类进行非空判断
        if (StringUtils.isBlank(user.getUName())) {
            resultInfo.setErrorMsg("用户名不能为空！");
            return resultInfo;
        }
        if (StringUtils.isBlank(user.getUPassword())) {
            resultInfo.setErrorMsg("密码不能为空！");
            return resultInfo;
        }
//        if (user.getUPhone() == null || user.getUPhone().equals("")) {
//            resultInfo.setErrorMsg("手机号不能为空！");
//            return resultInfo;
//        }
//        if (user.getUEmail() == null || user.getUEmail().equals("")) {
//            resultInfo.setErrorMsg("邮箱不能为空！");
//            return resultInfo;
//        }

        //使用md5对密码进行加密
        String password = Md5Util.encodeByMd5ToSpring(user.getUPassword());
        user.setUPassword(password);
        userService.saveUser(user);

        resultInfo.setFlag(true);

        return resultInfo;
    }

    /**
     * 登录的方法
     * @param user
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public ResultInfo login(User user) {
        ResultInfo resultInfo = new ResultInfo();

        if ("".equals(user.getUName()) || user.getUName() == null || "".equals(user.getUPassword()) || user.getUPassword() == null) {
            resultInfo.setErrorMsg("用户名或者密码不能为空！");
            return resultInfo;
        }

        //从数据库查询的user
        User userTmp = userService.queryUserByName(user);
        System.out.println(userTmp);

        if(null == userTmp || "".equals(userTmp.getUName())){
            resultInfo.setErrorMsg("用户名不存在！");
            return resultInfo;
        }

        //使用md5对密码进行加密,加密过后再进行比较
        String password = Md5Util.encodeByMd5ToSpring(user.getUPassword());
        if(!userTmp.getUPassword().equals(password)){
            resultInfo.setErrorMsg("密码不正确！");
            return resultInfo;
        }

        //用户名&密码正确，返回结果
        resultInfo.setFlag(true);

        return resultInfo;
    }


}
