package com.jyh.dockerdemo.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Creator: jiangyongheng
 * Date: 2019/03/20
 * Time: 11:13
 */

@RestController
public class DockerController {
    @RequestMapping("/")
    public String index() {
        return "Hello Docker!";
    }
}
