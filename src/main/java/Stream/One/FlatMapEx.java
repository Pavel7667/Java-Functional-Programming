package Stream.One;

import functional_Java_Interface.Instructor;
import functional_Java_Interface.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapEx {
    public static void main(String[] args) {

        List<String> allCourses = Instructors.getAll()
                .stream()
                .map(Instructor::getCourse)
                .flatMap(List::stream)// тут
                .collect(Collectors.toList());

        Set<String> allNoDuplicateCourse = Instructors.getAll()
                .stream()
                .map(Instructor::getCourse)
                .flatMap(List::stream)// тут
                .collect(Collectors.toSet());

    }
}
