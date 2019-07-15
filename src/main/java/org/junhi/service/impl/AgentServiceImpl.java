package org.junhi.service.impl;

import org.junhi.dao.AgentDao;
import org.junhi.domain.Agent;
import org.junhi.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author junhi
 * @date 2019/7/15 11:35
 */
@Service("agentService")
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentDao agentDao;

    @Override
    public List<Agent> findAll() {
        return agentDao.findAll();
    }

    @Override
    public Agent findAgentById(Integer id) {
        return agentDao.findAgentById(id);
    }
}
