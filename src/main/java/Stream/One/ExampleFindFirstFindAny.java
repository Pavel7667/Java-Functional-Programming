package Stream.One;

import functional_Java_Interface.Instructor;
import functional_Java_Interface.Instructors;

import java.util.Optional;

public class ExampleFindFirstFindAny {
    public static void main(String[] args) {
        Optional<Instructor> instructor = Instructors.getAll()
                .stream()
                .findAny();
    }
}
