package org.junhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junhi.dao.UserDao;
import org.junhi.domain.Agent;
import org.junhi.domain.User;
import org.junhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author junhi
 * @date 2019/7/14 15:16
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User queryUserByName(User user) {
        return userDao.findUserByName(user.getUName());
    }

    @Override
    public PageInfo<User> findAll(Integer currentPage, Integer pageSize) {
        //使用pagehelper插件进行分页
        PageHelper.startPage(currentPage, pageSize);
        List<User> userList = userDao.findAll();
        PageInfo<User> userPageInfo = new PageInfo<>(userList);
        return userPageInfo;
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
