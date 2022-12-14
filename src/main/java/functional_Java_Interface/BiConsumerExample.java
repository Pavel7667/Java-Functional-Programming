package functional_Java_Interface;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        // print out SUM of Two numbers
        BiConsumer<Integer, Integer> biConsumerIntSum =
                (a, b) -> System.out.println(a + b);
        biConsumerIntSum.accept(20, 20);

        // print out String of Two numbers
        BiConsumer<String, String> biConsumerStringConcat =
                (a, b) -> System.out.println(a + b);
        biConsumerStringConcat.accept("20", "20");

    }
}
