package CollectorsOperation;

import Functional_Java_Interface.Instructor;
import Functional_Java_Interface.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {

        // map
        List<String> list = Instructors.getAll()
                .stream()
                .map(Instructor::getName)
                .toList();

        // mapping
        list = Instructors.getAll()
                .stream()
                .collect(Collectors.mapping(Instructor::getName,
                        Collectors.toList()));

        // groupBy
        Map<Integer, List<String>> mapYearsOfExperience = Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(Instructor::getYears,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));

        System.out.println(mapYearsOfExperience);
    }
}
