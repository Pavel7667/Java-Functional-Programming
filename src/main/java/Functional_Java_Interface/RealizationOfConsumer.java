package Functional_Java_Interface;

import java.util.function.Consumer;

public class RealizationOfConsumer {
    public static void main(String[] args) {


        Consumer<String> consumer =
                (x) -> System.out.println(x.length() + "   value of x " + x);
        consumer.accept("some txxxxxt");

        // Consumer with block statement
        Consumer<Integer> d = (x) -> {
            System.out.println("x*x = " + x * x);
            System.out.println("x/x = " + x / x);
        };
        d.accept(10);


    }
}
