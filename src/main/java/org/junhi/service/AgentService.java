package org.junhi.service;

import org.junhi.domain.Agent;

import java.util.List;

/**
 * @author junhi
 * @date 2019/7/15 11:35
 */
public interface AgentService {

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
