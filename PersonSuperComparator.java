package ru.timokhina.algorithm.lesson22;
import java.util.*;

public class PersonSuperComparator implements Comparator <Person>{

    public static void main(String[] args) {
        List<Person> list = createExamplePersons();
       Collections.sort(list, new PersonSuperComparator());
       System.out.println(list);
    }

    private static List<Person> createExamplePersons() {
        return Arrays.asList(
                new Person(33, "Sean"),
                new Person(76, "Paul"),
                new Person(13, "Smith"),
                new Person(13, "Rachel"),
                new Person(33, "Monica"),
                new Person(45, "Rose")
        );
    }

    @Override
    public int compare(Person firstPerson, Person secondPerson) {

       return Comparator.comparing(Person::getAge).thenComparing(Person::getName).compare(firstPerson, secondPerson);
    }
}