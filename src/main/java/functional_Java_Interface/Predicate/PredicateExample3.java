package functional_Java_Interface.Predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static void main(String[] args) {

        IntPredicate p1 = (i) -> i > 100;
        System.out.println(p1.test(1010));

        LongPredicate p2 = (l) -> l > 100L;
        System.out.println(p2.test(1111111111111L));

        DoublePredicate p3 = (d) -> d > 20.20;
        System.out.println(p3.test(10.10));
    }
}
