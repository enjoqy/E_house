package org.junhi.dao;

import org.junhi.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户表
 * @author junhi
 * @date 2019/7/14 15:14
 */
@Repository
public interface UserDao {

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
}
