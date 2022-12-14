package collectorsOperation;

import functional_Java_Interface.Instructor;
import functional_Java_Interface.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {

        String s1 = Stream.of("e", "f", "h", "s").collect(Collectors.joining());
        // efhs
        String s11 = String.join(",", "e", "f", "h", "s");
        // e,f,h,s
        String s12 = String.join(",", "{", "}", "e", "f", "h", "s");
        // {e,f,h,s}

        String nameOfInstructors = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.joining("}{", "{", "}"));
        System.out.println(nameOfInstructors);

    }
}
