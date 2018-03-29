package test.in28minutes.start;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */
@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String defaultGreeting() {
        return "{\"App\":\"running\"}";
    }
}
