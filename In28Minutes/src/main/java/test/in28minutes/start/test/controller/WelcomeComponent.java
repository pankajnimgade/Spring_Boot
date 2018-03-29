package test.in28minutes.start.test.controller;

import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */

@Component
public class WelcomeComponent {

    private static final String GOOD_MORNING = "Good Morning";
    private static final String GOOD_AFTERNOON = "Good Afternoon";
    private static final String GOOD_NIGHT = "Good Night";

    public String getGreeting() {
        String greeting;
        Calendar instance = Calendar.getInstance();
        if (instance.get(Calendar.HOUR_OF_DAY) < 11
                && instance.get(Calendar.MINUTE) < 60) {
            greeting = GOOD_MORNING;
        } else if (instance.get(Calendar.HOUR_OF_DAY) > 12
                && instance.get(Calendar.HOUR_OF_DAY) < 5
                && instance.get(Calendar.MINUTE) < 60) {
            greeting = GOOD_AFTERNOON;
        } else {
            greeting = GOOD_NIGHT;
        }
        return greeting;
    }
}
