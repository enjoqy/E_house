package org.junhi.dao;

import org.junhi.domain.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 用户表
 * @author junhi
 * @date 2019/7/14 15:14
 */
@Repository
public interface UserDao extends Mapper<User> {

    /**
     * 查询所有的用户
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查询一条记录
     * @param id
     * @return
     */
    User findUserById(Integer id);

    /**
     * 根据id查询一条记录
     * @param name
     * @return
     */
    User findUserByName(String name);

    /**
     * 注册用户，保存一条user对象
     * @param user
     */
    void saveUser(User user);
}
