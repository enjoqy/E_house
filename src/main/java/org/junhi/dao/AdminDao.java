package org.junhi.dao;

import org.junhi.domain.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author junhi
 * @date 2019/7/15 11:36
 */
@Repository
public interface AdminDao {

    /**
     * 查询所有的管理员
     * @return
     */
    List<Admin> findAll();

}
