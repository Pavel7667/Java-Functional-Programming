package amigoscode.compinatorpattern;

import java.time.LocalDate;
import java.time.Period;

/**
 * Simple Custom Validator class in Declarative approach
 */
public class CustomerValidator {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumber(String email) {
        return email.contains("+0");
    }

    private boolean isAdult(LocalDate date) {
        return Period
                .between(date, LocalDate.now())
                .getYears() > 16;
    }


}
