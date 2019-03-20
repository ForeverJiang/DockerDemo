package com.jyh.dockerdemo.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Creator: jiangyongheng
 * Date: 2019/03/20
 * Time: 11:13
 */

@Controller
public class DockerController {
    @RequestMapping("/love")
    public String index() {
        return "Love";
    }
}
