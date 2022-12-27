package functionalprogrammingamigoscode;

import java.util.ArrayList;
import java.util.List;

import static functionalprogrammingamigoscode.Inrto.Person.Gender.FEMALE;
import static functionalprogrammingamigoscode.Inrto.Person.Gender.MALE;

public class Inrto {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Max", MALE),
                new Person("Aren", MALE),
                new Person("Alice", FEMALE)
        );

        soutCountOfFemale(people);
        soutCountOfFemaleUsingStream(people);
    }

    // Imperative approach
    public static List<Person> soutCountOfFemale(List<Person> people) {
        List<Person> listOfFEMALE = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                listOfFEMALE.add(person);
                System.out.println(person);
            }
        }
        return listOfFEMALE;
    }

    // Declarative approach
    public static void soutCountOfFemaleUsingStream(List<Person> people) {
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);
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

        enum Gender {
            MALE, FEMALE
        }
    }
}
