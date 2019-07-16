package org.junhi.service;

import com.github.pagehelper.PageInfo;
import org.junhi.domain.Agent;
import org.springframework.stereotype.Service;

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
    PageInfo<Agent> findAll(Integer currentPage, Integer pageSize);

    /**
     * 根据id查询一条记录
     * @param id
     * @return
     */
    Agent findAgentById(Integer id);

}
