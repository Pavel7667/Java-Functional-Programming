package functional_Java_Interface.Predicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        BiPredicate<Boolean, Integer> p1 =
                (online, years) -> online == true && years > 10;

    }
}
