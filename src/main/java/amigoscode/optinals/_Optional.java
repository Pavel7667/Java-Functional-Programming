package amigoscode.optinals;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {

        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default case");
        System.out.println(value);

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Send email to" + email),
                        () -> System.out.println("can`t send email"));

    }
}
