package CollectorsOperation;

import Functional_Java_Interface.Instructor;
import Functional_Java_Interface.Instructors;

import java.util.stream.Collectors;

public class SumAvgExm {
    public static void main(String[] args) {
        // sumInt
        int sum = Instructors.getAll()
                .stream()
                .collect(Collectors.summingInt(Instructor::getYears));

        int sum2 = Instructors.getAll()
                .stream().mapToInt(Instructor::getYears).sum();
        // avgInt
        double sum3 = Instructors.getAll()
                .stream()
                .collect(Collectors.averagingInt(Instructor::getYears));


    }
}
