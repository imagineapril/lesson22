package ru.timokhina.algorithm.lesson22;
import java.util.*;

public class PersonSuperComparator {

    public static void main(String[] args) {
        publicSuperComparing();
    }

    private static void publicSuperComparing() {
        List<Person> list = createExamplePersons();
        Collections.sort(list, Comparator.comparing(Person::getAge)
                .thenComparing(Comparator.comparing(Person::getName)));
        System.out.printf("Отсортировано сначало по возрасту, потом по имени: %s%n", list);
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
}