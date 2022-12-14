package functional_Java_Interface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // looping through all the instructor and printing out values
        Consumer<Instructor> all = (s1) -> System.out.println(s1);
        instructors.forEach(all);

        // looping through all the instructor and printing out ONLY name
        Consumer<Instructor> name = (s1) -> System.out.println(s1.getName());
        instructors.forEach(name);

        //  printing out ONLY name AND course
        Consumer<Instructor> course = (s1) -> System.out.println(s1.getCourse());
        instructors.forEach(name.andThen(course));

        // forEach with case
        instructors.forEach(e -> {
            if (e.years > 10) {
                all.accept(e);
            }
        });


        // forEach with case2
        instructors.forEach(e -> {
            if (e.years > 10 && !e.isOnlineCourse()) {
                name.andThen(course).accept(e);
            }
        });

    }
}
