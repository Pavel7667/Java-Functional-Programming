package Stream.One;

import functional_Java_Interface.Instructor;
import functional_Java_Interface.Instructors;

import java.util.List;

public class Filter {
    public static void main(String[] args) {


        List<Instructor> list = Instructors.getAll()
                .stream()
                .filter(e -> e.getYears() > 10)
                .toList();
    }
}
