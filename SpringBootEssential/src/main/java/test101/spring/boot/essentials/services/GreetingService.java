package test101.spring.boot.essentials.services;

import org.springframework.stereotype.Service;

import java.util.Calendar;

/**
 * Created on 4/7/2018
 *
 * @author Pankaj Nimgade
 */
@Service
public class GreetingService {

    private static final String MORNING = "Good Morning";
    private static final String AFTER_NO0N = "Good Afternoon";
    private static final String EVENING = "Good Evening";

    public String getGreeting() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(Calendar.HOUR_OF_DAY) >= 0 &&
                calendar.get(Calendar.HOUR_OF_DAY) < 12 &&
                calendar.get(Calendar.MINUTE) < 60) {
            return MORNING;
        } else if (calendar.get(Calendar.HOUR_OF_DAY) >= 12 &&
                calendar.get(Calendar.HOUR_OF_DAY) < 4 &&
                calendar.get(Calendar.MINUTE) < 60) {
            return AFTER_NO0N;
        } else {
            return EVENING;
        }
    }
}
