package Stream.One;

import Functional_Java_Interface.FunctionInstructors;
import Functional_Java_Interface.Instructor;

import java.util.Optional;

public class ExampleFindFirstFindAny {
    public static void main(String[] args) {
        Optional<Instructor> instructor = FunctionInstructors.getAll()
                .stream()
                .findAny();
    }
}
