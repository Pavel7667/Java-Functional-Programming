package Stream.One;

import Functional_Java_Interface.FunctionInstructors;
import Functional_Java_Interface.Instructor;

public class StreamMapFilterReduce {
    public static void main(String[] args) {

        int yearsOfExperienceAndOnline = FunctionInstructors.getAll()
                .stream()
                .filter(Instructor::isOnlineCourse)
                .map(Instructor::getYears)
                .reduce(0, (a, b) -> a - b);

        System.out.println(yearsOfExperienceAndOnline);
    }
}
