package com.two57.spring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @GetMapping("/date")
    public String date() {
        return new Date().toString();
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam("s") String s) {
        return "Hello " + s;
    }

}
