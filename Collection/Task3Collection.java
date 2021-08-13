package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task3Collection {

    public static void main (String [] args) {

        HashSet<Pet> petList = new HashSet<>();
        petList.add(new Cat("Mania", 5, "Europe", true));
        petList.add(new Cat("Nusha", 1, "Europe", false));
        petList.add(new Cat("Ksusha", 2, "Asia", true));
        petList.add(new Dog("Rick", 5, "Europe", "shepherd"));
        petList.add(new Dog("Jack", 5, "North America", "dachshund"));
        petList.add(new Dog("Mike", 4, "Europe", "bulldog"));


       Iterator iterator = petList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        } }}

