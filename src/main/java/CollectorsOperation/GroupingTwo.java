package CollectorsOperation;

import Functional_Java_Interface.Instructor;
import Functional_Java_Interface.Instructors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingTwo {
    public static void main(String[] args) {

        // groping by length of string and also checking that the names have "e"
        List<String> names = List.of("Syd", "Mary", "Gene", "Rajeev", "Jenny");
        LinkedHashMap<Integer, List<String>> map = names.stream()
                .collect(Collectors.groupingBy(String::length,
                        LinkedHashMap::new,
                        Collectors.filtering(s -> s.contains("e"), Collectors.toList())));

        System.out.println(map);

        Map<String, List<Instructor>> mapSJ = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(i -> i.getYears() > 10 ? "S" : "J",
                        Collectors.filtering(Instructor::isOnlineCourse,
                                Collectors.toList())));

        mapSJ.forEach((key, value) -> {
            System.out.println("key " + key + " value " + value);
        });
    }
}
