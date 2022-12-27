package functionalprogrammingamigoscode;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        Function<Integer, Integer> combineFunction =
                incrementFunction.andThen(multiplyFunction);

        Integer apply = combineFunction.apply(3);

        System.out.println(apply);
    }

    // Functional Style
    static Function<Integer, Integer> incrementFunction = e -> ++e;
    static Function<Integer, Integer> multiplyFunction = e -> e * e;

}
