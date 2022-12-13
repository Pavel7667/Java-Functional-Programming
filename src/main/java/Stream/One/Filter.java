package Stream.One;

import Functional_Java_Interface.FunctionInstructors;
import Functional_Java_Interface.Instructor;

import java.util.List;

public class Filter {
    public static void main(String[] args) {


        List<Instructor> list = FunctionInstructors.getAll()
                .stream()
                .filter(e -> e.getYears() > 10)
                .toList();
    }
}
