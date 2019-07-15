package org.junhi.dao;

import org.junhi.domain.Agent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 代理人
 * @author junhi
 * @date 2019/7/15 11:36
 */
@Repository
public interface AgentDao {

    /**
     * 查询所有的业务员
     * @return
     */
    List<Agent> findAll();

    /**
     * 根据id查询一条记录
     * @param id
     * @return
     */
    Agent findAgentById(Integer id);

}
