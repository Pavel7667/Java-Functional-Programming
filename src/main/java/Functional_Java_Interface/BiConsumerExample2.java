package Functional_Java_Interface;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> list = Instructors.getAll();

        // how ForEach BiConsumer (param,param)
        BiConsumer<String, String> biConsumer = (name, gender) -> {
            System.out.println(name + " " + gender);
        };

        list.forEach(e -> biConsumer.accept(e.getName(), e.getGender()));


        // how ForEach BiConsumer (param,param(asList))
        BiConsumer<String, List<String>> paramAsList = (name, courses) -> {
            System.out.println("name is " + name + "courses" + courses);
        };

        list.forEach(element -> {
            paramAsList.accept(element.getName(), element.getCourse());
        });

        // how ForEach BiConsumer (param,param2)
        BiConsumer<String, Boolean> nameOnline = (name, online) -> {
            System.out.println(name + "  " + online);
        };

        list.forEach(element -> {
            nameOnline.accept(element.getName(), element.isOnlineCourse());
        });

    }
}
