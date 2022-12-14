package Stream.One;

import Functional_Java_Interface.Instructor;
import Functional_Java_Interface.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional result = list.stream().reduce((a, b) -> a + b);
        System.out.println(result.get());

        Optional instructorList = Instructors.getAll()
                .stream()
                .reduce((s1, s2) -> s2.getYears() > s1.getYears() ? s2 : s1);

        List<Instructor> someList;
        if (instructorList.isPresent()) {
            someList = instructorList.stream().toList();
        }

        System.out.println(instructorList);

    }
}
