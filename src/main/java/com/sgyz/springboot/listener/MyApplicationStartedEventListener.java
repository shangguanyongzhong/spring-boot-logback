package com.sgyz.springboot.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by P0093203 on 2017/3/21.
 */
public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {
   private Logger logger = LoggerFactory.getLogger(MyApplicationStartedEventListener.class);


    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        SpringApplication app = event.getSpringApplication();
        app.setShowBanner(true);// 不显示banner信息
        System.out.println("hello");
        logger.info("==MyApplicationStartedEventListener=="+event);
        System.out.println("hellow");
    }
}