package com.dreamuscompany.logan.spring.cloud.k8s.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 김판기(Logan) / pahnki.kim@dreamus.io
 * @date 2021/06/10
 */
@RestController
public class HelloController {

    @Value("${bean.message:empty}")
    private String message;

    @GetMapping("/hello")
    public String getMessage() {
        return message;
    }

}
