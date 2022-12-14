package Functional_Java_Interface.Function;

import Functional_Java_Interface.Instructor;
import Functional_Java_Interface.Instructors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FuncExam2 {
    public static void main(String[] args) {

        Predicate<Instructor> p1 = i -> i.isOnlineCourse();

        Function<List<Instructor>, Map<String, Integer>> mapFunction =
                (instructors -> {
                    Map<String, Integer> map = new HashMap<>();
                    instructors.forEach(element -> {
                        if (p1.test(element)) {
                            map.put(element.getName(), element.getYears());
                        }
                    });
                    return map;
                });

        System.out.println(mapFunction.apply(Instructors.getAll()));

    }
}
