package functional_Java_Interface.Function;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class SomeExmpl {
    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        int c = binaryOperator.apply(10, 10);
        System.out.println(c);

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> max = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> min = BinaryOperator.minBy(comparator);

        System.out.println(max.apply(1, 20));
        System.out.println(min.apply(1, 20));


        // Интерфейс Supplier используется тогда,
        // когда на вход не передаются значения, но необходимо вернуть результат.
        Supplier<Integer> integerSupplier = () -> (int) (Math.random() * 100);
        System.out.println(integerSupplier.get());
        System.out.println(integerSupplier.get());
    }
}
