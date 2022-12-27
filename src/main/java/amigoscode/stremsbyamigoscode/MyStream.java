package amigoscode.stremsbyamigoscode;

import java.util.List;

import static amigoscode.stremsbyamigoscode.MyStream.Gender.FEMALE;
import static amigoscode.stremsbyamigoscode.MyStream.Gender.MALE;

public class MyStream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Max", MALE),
                new Person("Aren", MALE),
                new Person("Alice", FEMALE)
        );

//        Function<Person, String> personStringFunction = person -> person.name;
//        ToIntFunction<String> length = String::length;
//        IntConsumer println = System.out::println;
//
//        people.stream()
//                .map(personStringFunction)
//                .mapToInt(length)
//                .forEach(println);

        boolean b = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));

        System.out.println(b);

    }
    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE
    }
}
