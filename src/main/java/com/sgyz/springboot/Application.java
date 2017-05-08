package com.sgyz.springboot;

import com.sgyz.springboot.listener.MyApplicationStartedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.logging.logback.ColorConverter;
import org.springframework.context.annotation.Profile;

/**
 * Created by P0093203 on 2017/3/21.
 * @Configuration : 表示Application作为sprig配置文件存在
 * @EnableAutoConfiguration: 启动spring boot内置的自动配置
 * @ComponentScan : 扫描bean，路径为Application类所在package以及package下的子路径，
 * 这里为 com.sgyz.springboot，在spring boot中bean都放置在该路径已经子路径下。
 *
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
      SpringApplication.run(Application.class, args);

//       SpringApplication app = new SpringApplication(Application.class);
//        app.addListeners(new MyApplicationStartedEventListener());
//        app.run(args);
    }
}