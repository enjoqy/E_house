package org.junhi.service;

import com.github.pagehelper.PageInfo;
import org.junhi.domain.User;

/**
 * @author junhi
 * @date 2019/7/14 15:43
 */
public interface UserService {

    /**
     * 根据用户名查询用户,同时验证密码是否存在
     * @param user
     * @return
     */
    User queryUserByName(User user);

    /**
     * 查询所有的用户
     * @return
     */
    PageInfo<User> findAll(Integer currentPage, Integer pageSize);

    /**
     * 注册用户，保存一条user对象
     * @param user
     */
    void saveUser(User user);
}
