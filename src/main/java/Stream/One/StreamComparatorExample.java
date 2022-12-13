package Stream.One;

import Functional_Java_Interface.FunctionInstructors;
import Functional_Java_Interface.Instructor;

import java.util.Comparator;
import java.util.List;

public class StreamComparatorExample {
    public static void main(String[] args) {

        List<Instructor> list = FunctionInstructors.getAll()
                .stream()
                .sorted(Comparator.comparing(Instructor::getName))
                .toList();

        list.forEach(System.out::println);
    }
}
