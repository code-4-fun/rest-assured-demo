package com.example.api.integration.tests.restassureddemo.junit.controller;

import com.example.api.integration.tests.restassureddemo.model.ResponseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    @ResponseBody
    String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/respond")
    @ResponseBody
    ResponseModel respond() {
        return new ResponseModel("Test", "Some Random Message");
    }

}
