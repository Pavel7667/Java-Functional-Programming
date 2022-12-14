package Stream.One;

import functional_Java_Interface.Instructor;
import functional_Java_Interface.Instructors;

import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        boolean haveCourseJ = Instructors.getAll()
                .stream()
                .map(Instructor::getCourse)
                .flatMap(List::stream)
                .noneMatch(e -> e.startsWith("J"));

        System.out.println(haveCourseJ);


    }
}
