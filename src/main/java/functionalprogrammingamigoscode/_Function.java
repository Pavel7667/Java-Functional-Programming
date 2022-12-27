package functionalprogrammingamigoscode;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int incrementI = incrementI(0);
        System.out.println(incrementI);
        int incrementD = incrementD(0);
        System.out.println(incrementD);
        int incrementF = incrementFUnction.apply(0);
        System.out.println(incrementF);
    }

    //    Imperative approach
    static int incrementI(int number) {
        return number + 1;
    }

    //    Declarative  approach
    static int incrementD(int number) {
        Function<Integer, Integer> sums = e -> ++e;
        return sums.apply(number);
    }

    // Functional Style
    static Function<Integer, Integer> incrementFUnction = e -> ++e;

}
