package Stream.One;

import Functional_Java_Interface.FunctionInstructors;
import Functional_Java_Interface.Instructor;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {

        // two case
        Predicate<Instructor> isOnline =
                Instructor::isOnlineCourse;
        Predicate<Instructor> moreThanTen =
                (i) -> i.getYears() > 10;

        //get List
        List<Instructor> baseInfo = FunctionInstructors.getAll();
        System.out.println(baseInfo);

        Map<String, List<String>> afterStream = // set <K,V>
                baseInfo.stream()
                        .filter(isOnline)
                        .filter(moreThanTen)
                        .collect(Collectors.toMap // set <K,V>
                                (Instructor::getName,
                                        Instructor::getCourse));

        System.out.println(afterStream);
    }

}
