package Stream.One;

import Functional_Java_Interface.FunctionInstructors;
import Functional_Java_Interface.Instructor;

import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        boolean haveCourseJ = FunctionInstructors.getAll()
                .stream()
                .map(Instructor::getCourse)
                .flatMap(List::stream)
                .noneMatch(e -> e.startsWith("J"));

        System.out.println(haveCourseJ);


    }
}
