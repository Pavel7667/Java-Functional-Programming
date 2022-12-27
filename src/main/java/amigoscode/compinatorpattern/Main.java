package amigoscode.compinatorpattern;

import java.time.LocalDate;

import static amigoscode.compinatorpattern.CustomerRegistrationValidator.isAnAdultValid;
import static amigoscode.compinatorpattern.CustomerRegistrationValidator.isEmailValid;
import static amigoscode.compinatorpattern.CustomerRegistrationValidator.isPhoneValid;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+099999",
                LocalDate.of(2000, 1, 1)

        );
//        Imperative approach
//        System.out.println(new CustomerValidator().isValid(customer));


        // Declarative approach
        ValidationResult apply = isEmailValid().
                and(isPhoneValid())
                .and(isAnAdultValid())
                .apply(customer);

        System.out.println(apply);

        if (apply != ValidationResult.SUCCESS) {
            throw new IllegalThreadStateException(apply.name());
        }
    }
}
