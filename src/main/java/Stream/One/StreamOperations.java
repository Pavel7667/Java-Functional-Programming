package Stream.One;

import Functional_Java_Interface.FunctionInstructors;
import Functional_Java_Interface.Instructor;

import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        long countOfElement = FunctionInstructors.getAll()
                .stream()
                .map(Instructor::getCourse)
                .flatMap(List::stream)
                .count();

        List<String> elementNoDuplicate = FunctionInstructors.getAll()
                .stream()
                .map(Instructor::getCourse)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();

    }
}
