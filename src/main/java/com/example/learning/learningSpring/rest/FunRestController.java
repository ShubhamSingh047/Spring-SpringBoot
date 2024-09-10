package com.example.learning.learningSpring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FunRestController {
    //exporse a "/" return hello world
    @GetMapping("/")
    public String sayHello(){
        return "Hello World !";
    }

}
