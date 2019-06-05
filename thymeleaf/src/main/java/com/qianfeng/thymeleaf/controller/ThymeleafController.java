package com.qianfeng.thymeleaf.controller;

import com.qianfeng.thymeleaf.entity.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("view")
public class ThymeleafController {

    @RequestMapping("hello")
    public String hello(Model model){
        //1.
        model.addAttribute("username","雷军");
        //2. 对象的方式
        Teacher teacher = new Teacher(1,99,"huangguizhao");
        model.addAttribute("teacher",teacher);
        //3. 集合的方式
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher(1,39,"chenglaoshi"));
        list.add(new Teacher(2,18,"huanglaoshi"));
        model.addAttribute("list",list);
        //4.
        model.addAttribute("now",new Date());
        return "hello";
    }
}
