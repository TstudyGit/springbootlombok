package com.qianfeng.springbootlombok.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Student {

    private Integer id;

    @NotNull(message = "name can't is null!")
    private String name;
}
