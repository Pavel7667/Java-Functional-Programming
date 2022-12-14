package functional_Java_Interface;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerIntLongDouble {
    public static void main(String[] args) {
        IntConsumer intConsumer = (a) -> System.out.println(a * a);
        intConsumer.accept(10);

        LongConsumer longConsumer = (value) -> System.out.println(value * value);
        longConsumer.accept(10L);

        DoubleConsumer doubleConsumer = (value) -> System.out.println(value * value);
        doubleConsumer.accept(10.0);
    }
}
