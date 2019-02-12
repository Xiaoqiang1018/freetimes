package com.exam5.xiaoqiang.listener;

import com.exam5.xiaoqiang.utils.Constances;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener implements ServletContextListener {
    private static ApplicationContext APPLICATION_CONTEXT_CONSTANCES;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String contextConfig = servletContextEvent.getServletContext().getInitParameter("contextConfig");
        APPLICATION_CONTEXT_CONSTANCES = new ClassPathXmlApplicationContext(contextConfig);
        servletContextEvent.getServletContext().setAttribute("APPLICATION_CONTEXT_CONSTANCES", APPLICATION_CONTEXT_CONSTANCES);
        System.out.println("============网站启动===============");

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("============网站启动===============");
    }
}
