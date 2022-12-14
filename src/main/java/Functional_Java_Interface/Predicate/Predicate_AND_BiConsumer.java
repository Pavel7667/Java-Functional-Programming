package Functional_Java_Interface.Predicate;

import Functional_Java_Interface.Instructor;
import Functional_Java_Interface.Instructors;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class Predicate_AND_BiConsumer {

    public static void main(String[] args) {
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourse();
        Predicate<Instructor> p2 = (i) -> i.getYears() > 10;
        BiConsumer<String, List<String>> biConsumer = (name, course) -> {
            System.out.println(name + "   " + course);
        };
        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(element -> {
            if (p1.and(p2).test(element)) {
                biConsumer.accept(element.getName(), element.getCourse());
            }
        });

    }
}
