package Stream.One;

import functional_Java_Interface.Instructor;
import functional_Java_Interface.Instructors;

public class StreamMapFilterReduce {
    public static void main(String[] args) {

        int yearsOfExperienceAndOnline = Instructors.getAll()
                .stream()
                .filter(Instructor::isOnlineCourse)
                .map(Instructor::getYears)
                .reduce(0, (a, b) -> a - b);

        System.out.println(yearsOfExperienceAndOnline);
    }
}
