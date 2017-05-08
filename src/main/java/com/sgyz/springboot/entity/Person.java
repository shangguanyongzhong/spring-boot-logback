package com.sgyz.springboot.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created by P0093203 on 2017/3/24.
 */
public class Person implements Serializable{
    @NotNull(message = "{id名不能为空}")
    private Long id;
    @NotEmpty(message = "{用户名不能为空}")
    @Length(min = 5, max = 20, message = "{用户名长度异常}")
    @Pattern(regexp = "[a-zA-Z]{5,20}", message = "{用户名非法字符}")
    private String name;

    @NotNull(message = "{密码不能为空}")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}