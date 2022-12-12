package Stream.One;

import Functional_Java_Interface.FunctionInstructors;
import Functional_Java_Interface.Instructor;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapEx {
    public static void main(String[] args) {

        List<String> allCourses = FunctionInstructors.getAll()
                .stream()
                .map(Instructor::getCourse)
                .flatMap(List::stream)// тут
                .collect(Collectors.toList());

        Set<String> allNoDuplicateCourse = FunctionInstructors.getAll()
                .stream()
                .map(Instructor::getCourse)
                .flatMap(List::stream)// тут
                .collect(Collectors.toSet());

    }
}
