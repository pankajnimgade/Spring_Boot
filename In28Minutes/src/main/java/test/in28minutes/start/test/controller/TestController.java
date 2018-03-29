package test.in28minutes.start.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */
@RestController
@RequestMapping("/test")
@ComponentScan("test.in28minutes")// this defines where (in which package) spring looks for components
public class TestController {

    @Autowired
    private WelcomeComponent welcomeComponent;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String defaultMessage() {
        return "{\"App\":\"running\"}";
    }

    @RequestMapping(value = "/greeting")
    public String getGreeting() {
        return welcomeComponent.getGreeting();
    }
}
