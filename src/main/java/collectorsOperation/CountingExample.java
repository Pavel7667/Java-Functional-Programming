package collectorsOperation;

import functional_Java_Interface.Instructor;
import functional_Java_Interface.Instructors;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {

        // stream count
        long count = Instructors.getAll()
                .stream()
                .filter(Instructor::isOnlineCourse)
                .count();

        // stream collectors counting
        count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourse)
                .collect(Collectors.counting());
    }
}
