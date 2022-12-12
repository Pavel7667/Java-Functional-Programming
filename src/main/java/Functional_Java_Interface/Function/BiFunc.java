package Functional_Java_Interface.Function;

import Functional_Java_Interface.Instructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunc {
    public static void main(String[] args) {

        Predicate<Instructor> p1 = Instructor::isOnlineCourse;
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> biFunction =
                ((instructors, instructorPredicate) -> {
                    Map<String, Integer> map = new HashMap<>();
                    instructors.forEach(element -> {
                        if (instructorPredicate.test(element)) {
                            map.put(element.getName(), element.getYears());
                        }
                    });
                    return map;
                });


    }
}
