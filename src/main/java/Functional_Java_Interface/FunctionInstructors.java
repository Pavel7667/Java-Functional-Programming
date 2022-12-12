package Functional_Java_Interface;

import java.util.Arrays;
import java.util.List;

public class FunctionInstructors {

    public static List<Instructor> getAll() {
        Instructor instructor1 = new Instructor("mike", "IT", "m", 1, true,
                Arrays.asList("J", "D", "JWT"));
        Instructor instructor2 = new Instructor("JO", "Dev", "m", 20, false,
                Arrays.asList("Java", "Docker", "JSP"));
        Instructor instructor3 = new Instructor("Olga", "Sails", "f", 3, false,
                Arrays.asList("Mango", "Banana", "Fruit"));
        Instructor instructor4 = new Instructor("Anya", "HR", "f", 40, true,
                Arrays.asList("tttt", "xxx", "asfasf"));
        Instructor instructor5 = new Instructor("Tom", "Driver", "m", 5, true,
                Arrays.asList("Audi", "Ford", "Subaru"));

        return Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5);
    }
}
