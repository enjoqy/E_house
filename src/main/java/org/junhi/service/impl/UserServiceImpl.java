package org.junhi.service.impl;

import org.junhi.dao.UserDao;
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
    public List<User> findAll() {
        return userDao.findAll();
    }
}
