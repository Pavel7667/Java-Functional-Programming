package CollectorsOperation;

import Functional_Java_Interface.Instructor;
import Functional_Java_Interface.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingOne {
    public static void main(String[] args) {

        List<String> names = List.of("Syed", "Mary", "Gene", "Rajeev", "Jenny");
        Map<Integer, List<String>> map = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);

        List<Instructor> gender = Instructors.getAll().stream().toList();

        Map<String, List<Instructor>> mapGender = gender.stream()
                .collect(Collectors.groupingBy(Instructor::getGender));
        mapGender.forEach((key, value) -> {
            System.out.println("key " + key + " value " + value);
        });

        Map<String, List<Instructor>> mapSenior = gender.stream()
                .collect(Collectors.groupingBy(e -> e.getYears() > 10 ? "S" : "J"));

        mapSenior.forEach((key, value) -> {
            System.out.println("key " + key + " value " + value);
        });

    }
}
