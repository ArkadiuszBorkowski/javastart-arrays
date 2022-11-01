package cw1;

import java.util.Arrays;

public class DatabaseTest {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.add(new Person("Jan", "Kowalski", "12345"));
        database.add(new Person("Ania", "Zaleska", "122345"));
        database.add(new Person("Karol", "Piotrowski", "425"));
        database.add(new Person("Patryk", "Nowak", "43242"));

        Person person = database.get(1);
        System.out.println(person);

        System.out.println(database);

        database.remove(new Person("Ania" , "Zaleska", "122345"));
        System.out.println();
        System.out.println(database);


    }
}
