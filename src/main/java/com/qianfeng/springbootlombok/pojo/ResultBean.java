package com.qianfeng.springbootlombok.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultBean <T>{

    private String statusCode;

    private T data;
}
