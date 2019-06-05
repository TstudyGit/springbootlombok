package com.qianfeng.springbootlombok.controller;

import com.qianfeng.springbootlombok.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;

@Controller
@RequestMapping("hello")
public class DemoController {

    @Value("${image.server}")
    private String httpImage;

    @RequestMapping("boot")
    @ResponseBody
    public String demo(){
        return "hello,springboot!!!!！！！"+httpImage;
    }

    @RequestMapping("getDate")
    @ResponseBody
    public Date getDate(Date date){
        System.out.println(date);
        return date;
    }

    @RequestMapping("getImageServer")
    @ResponseBody
    public String getImageServer(){
        return httpImage;
    }

    @RequestMapping("save")
    @ResponseBody
    public String saveStudent(@Valid Student student){
        System.out.println(student.getName());
               return "ok";
    }
}
