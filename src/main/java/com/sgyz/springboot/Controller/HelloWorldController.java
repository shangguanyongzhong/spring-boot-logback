package com.sgyz.springboot.Controller;

import com.alibaba.fastjson.JSON;
import com.sgyz.springboot.entity.Person;
import com.sgyz.springboot.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by P0093203 on 2017/3/21.
 */
@RestController
@RequestMapping("/springboot")
public class HelloWorldController {
    @Autowired
    User user;
   public static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
   // @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayWorld(@PathVariable("name") String name) {
       //logger.debug("This is a debug message");
       // logger.info("This is an info message");
       // logger.warn("This is a warn message");
       // logger.error("This is an error message");


        System.out.println("userName"+user.toString());
        return "Hello " + name;
    }
    @RequestMapping("/save")
    public String save(@Valid Person person,BindingResult result){

        if (result.hasErrors()) {
            Map<String,Object> map=result.getModel();
            for(String s:map.keySet()){
                System.out.println(s+"v===="+map.get(s));
            }
        }
        return "hello";
    }
}