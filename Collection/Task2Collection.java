package Collection;

import java.util.HashMap;
import java.util.Map;

public class Task2Collection {

    public static void main (String [] arg) {

        HashMap <String, Cat > catList = new HashMap<>();

        catList.put("Jack", new Cat("Jack", 2, "Europe", true));
        catList.put("Lolly", new Cat("Lolly", 1,"Africa", true));
        catList.put("Kuzya", new Cat("Kuzya", 7, "Asia",false));
        catList.put("Snowy", new Cat("Snowy", 11, "Austrlia",true));
        catList.put("Murzik", new Cat("Murzik", 12,"Austrlia", false));
        catList.put("Barsik", new Cat("Barsik", 3, "Europe",true));
        catList.put("Ruby", new Cat("Ruby", 8, "Africa",true));
        catList.put("Blacky", new Cat("Blacky", 2, "Africa",false));
        catList.put("Lucy", new Cat("Lucy", 12, "Europe",false));
        catList.put("Murka", new Cat("Murka", 2,"South America", false));

        System.out.println(catList.size());

        for (HashMap.Entry <String, Cat > entry: catList.entrySet())
            System.out.println("Key "  +  entry.getKey() + "\n" + entry.getValue() );

    }
}
