package com.manthanhd.gradlelinttest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by manthanhd on 25/06/2016.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings!";
    }

}
