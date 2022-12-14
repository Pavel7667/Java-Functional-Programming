package Stream.One;

import Functional_Java_Interface.Instructor;
import Functional_Java_Interface.Instructors;

import java.util.Comparator;
import java.util.List;

public class StreamComparatorExample {
    public static void main(String[] args) {

        List<Instructor> list = Instructors.getAll()
                .stream()
                .sorted(Comparator.comparing(Instructor::getName))
                .toList();

        list.forEach(System.out::println);
    }
}
