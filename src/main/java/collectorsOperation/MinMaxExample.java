package collectorsOperation;

import functional_Java_Interface.Instructor;
import functional_Java_Interface.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxExample {
    public static void main(String[] args) {

        // min Instructor year
        Optional<Instructor> instructor = Instructors.getAll()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Instructor::getYears)));

        instructor = Instructors.getAll()
                .stream().min(Comparator.comparing(Instructor::getYears));
    }
}
