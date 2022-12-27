package amigoscode.functionalprogrammingamigoscode;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        Integer apply = combineBiFunction.apply(9, 10);
        System.out.println(apply);
    }

    // Functional Style
    static Function<Integer, Integer> incrementFunction = e -> ++e;
    static Function<Integer, Integer> multiplyFunction = e -> e * e;

    static BiFunction<Integer, Integer, Integer> combineBiFunction =
            (e, v) -> ((e + 1) * v);

}
