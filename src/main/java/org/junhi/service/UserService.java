package org.junhi.service;

import org.junhi.domain.User;

import java.util.List;

/**
 * @author junhi
 * @date 2019/7/14 15:43
 */
public interface UserService {

    /**
     * 查询所有的用户
     * @return
     */
    List<User> findAll();
}
