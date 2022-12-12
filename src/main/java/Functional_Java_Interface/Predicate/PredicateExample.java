package Functional_Java_Interface.Predicate;

import Functional_Java_Interface.FunctionInstructors;
import Functional_Java_Interface.Instructor;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        //if number > 10 = true
        Predicate<Integer> moreThan10 = (i -> i > 10);
        System.out.println(moreThan10.test(100));

        // number > 10 && number is even number -and
        Predicate<Integer> twoCase = (integer -> integer % 2 == 0);
        System.out.println(twoCase.negate().test(10));

        // number > 10 || number is even number = or

        // case offline
        Predicate<Instructor> offline = (i) -> i.isOnlineCourse() == false;
        // case years > 10
        Predicate<Instructor> years = (instructor -> instructor.getYears() > 10);

        List<Instructor> instructors = FunctionInstructors.getAll();
        instructors.forEach(instructor -> {
            if (offline.and(years).test(instructor)) {
                System.out.println(instructor);
            }
        });
    }
}
