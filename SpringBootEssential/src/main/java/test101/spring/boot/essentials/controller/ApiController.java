package test101.spring.boot.essentials.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test101.spring.boot.essentials.services.GreetingService;

/**
 * Created on 4/7/2018
 *
 * @author Pankaj Nimgade
 */

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public String getGreeting(){
        return greetingService.getGreeting();
    }

}
