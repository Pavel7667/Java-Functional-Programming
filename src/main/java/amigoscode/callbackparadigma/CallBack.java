package amigoscode.callbackparadigma;

import java.util.function.Consumer;

public class CallBack {

    public static void main(String[] args) {

        hello("John", null, value -> {
            System.out.println("noLastName for " + value);
        });
    }

    private static void hello(String firstName, String lastName,
                              Consumer<String> callBack) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callBack.accept(firstName);
        }
    }
}
