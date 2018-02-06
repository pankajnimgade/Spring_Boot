package com.test101.rest.api.test101.rest.api.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/helloworld")
    public String sayHelloWorld(){
        return "Hello World";
    }
}
