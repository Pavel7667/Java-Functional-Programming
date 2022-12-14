package CollectorsOperation;

import Functional_Java_Interface.Instructor;
import Functional_Java_Interface.Instructors;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PortioningBy {
    public static void main(String[] args) {

        // TAKE SOME PREDICATE
        Predicate<Instructor> years = i -> i.getYears() > 10;
        Map<Boolean, Set<Instructor>> map = Instructors.getAll()
                .stream()
                .collect(Collectors.partitioningBy(years, Collectors.toSet()));
    }
}
