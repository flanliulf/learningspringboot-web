package com.fancyliu.learningspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述:
 *
 *
 * @author : Liu Fan
 * @date : 2019/11/1 15:33
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "hello world";
    }
}
