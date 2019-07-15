package org.junhi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhi
 * @date 2019/7/14 16:03
 */
public class SpringTest {

    @Test
    public void getBeanDefinitionNames(){
       ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
