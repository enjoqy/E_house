package org.junhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<Agent> findAll(Integer currentPage,Integer pageSize) {
        //使用pagehelper插件进行分页
        PageHelper.startPage(currentPage, pageSize);
        List<Agent> agentList = agentDao.findAll();
        PageInfo<Agent> agentPageInfo = new PageInfo<>(agentList);
        return agentPageInfo;
    }

    @Override
    public Agent findAgentById(Integer id) {
        return agentDao.findAgentById(id);
    }
}
