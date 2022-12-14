package Stream.One;

import Functional_Java_Interface.Instructor;
import Functional_Java_Interface.Instructors;

import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {


        Set<String> names = Instructors.getAll()
                .stream()
                .map(Instructor::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

    }
}
