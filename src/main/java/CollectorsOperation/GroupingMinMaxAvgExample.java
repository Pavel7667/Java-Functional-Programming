package CollectorsOperation;

import Functional_Java_Interface.Instructor;
import Functional_Java_Interface.Instructors;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingMinMaxAvgExample {
    public static void main(String[] args) {
        // group by two group Online and Not and avg of Years
        Map<Boolean, IntSummaryStatistics> onlineYears = Instructors.getAll()
                .stream().
                collect(Collectors.groupingBy(Instructor::isOnlineCourse,
                        Collectors.summarizingInt(Instructor::getYears)));


        onlineYears.forEach((k, v) -> {
            System.out.println(k + " kay " + v + " value ");
        });
    }
}
