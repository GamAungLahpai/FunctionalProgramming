package lamda;

import java.util.ArrayList;
import java.util.List;


public class _Demo {
    public static void main(String[]args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.MALE)

        );
        System.out.println("Imperative Approch");

        List<Person> females = new ArrayList<>();
        for(Person person: people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for(Person female: females){
            System.out.println(female);
        }


        System.out.println("  //Declarative approch");
        people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);


    }
    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
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
