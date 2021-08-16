package Homework_Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class Main {

    public static void main (String [] args){

        House house1 = new House(100, 100000, "Mykolaiv", true);
        House house2 = new House(200, 2000000, "Odesa", true);
        House house3 = new House(53, 15000, "Kherson", false);
        House house4 = new House(74, 160000, "Kyiv", true);
        House house5 = new House(153, 50000, "Khmelnytsky", true);
        House house6 = new House(106, 100000, "Lviv", false);

       List <House> listHouse = new ArrayList<>();
       listHouse.add(house1);
       listHouse.add(house2);
       listHouse.add(house3);
       listHouse.add(house4);
       listHouse.add(house5);
       listHouse.add(house6);


        System.out.println("Sort by price");
       for (House item : listHouse
        ) { System.out.println(item); }

       sort(listHouse);
        for (House item : listHouse
             ) { System.out.println(item); }

        System.out.println("Sort by area");

        sort(listHouse, new HouseCompare());
        for (House item : listHouse
        ) { System.out.println(item); }


    }
    }

