package org.junhi.controller;

import com.github.pagehelper.PageInfo;
import org.junhi.domain.Agent;
import org.junhi.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author junhi
 * @date 2019/7/15 11:34
 */
@Controller
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    private AgentService agentService;

    /**
     * 查询所有的业务员
     * @return
     */
    @RequestMapping(value = "/findAll", produces="text/html;charset=UTF-8")
    @ResponseBody
    public  PageInfo<Agent> findAll(@RequestParam(value = "currentPage", defaultValue = "1")Integer currentPage,
                                    @RequestParam(value = "pageSize", defaultValue = "10")Integer pageSize) {
        return agentService.findAll(currentPage, pageSize);
    }

    /**
     * 根据id查询一条记录
     * @param id
     * @return
     */
    @RequestMapping(value = "/findAgentById", produces="text/html;charset=UTF-8")
    @ResponseBody
    public Agent findAgentById(Integer id) {
        return agentService.findAgentById(id);
    }
}
