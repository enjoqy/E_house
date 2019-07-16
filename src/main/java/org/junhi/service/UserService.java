package org.junhi.service;

import com.github.pagehelper.PageInfo;
import org.junhi.domain.User;

/**
 * @author junhi
 * @date 2019/7/14 15:43
 */
public interface UserService {

    /**
     * 查询所有的用户
     * @return
     */
    PageInfo<User> findAll(Integer currentPage, Integer pageSize);
}
