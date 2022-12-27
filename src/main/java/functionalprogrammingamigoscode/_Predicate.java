package functionalprogrammingamigoscode;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000"));
        System.out.println(isPhoneNumberValid("09000"));

        System.out.println(isPhoneNumberValidPredicate.test("07000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000"));
        // Should contain two case
        System.out.println(isPhoneNumberValidPredicate
                .and(isPhoneNumberHaveNumber3)
                .test("07050"));


    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 5;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> (phoneNumber.startsWith("07") && phoneNumber.length() == 5);

    static Predicate<String> isPhoneNumberHaveNumber3 =
            phoneNumber -> phoneNumber.contains("3");
}
