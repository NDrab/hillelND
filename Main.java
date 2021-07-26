package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Main {

    public static void main (String[] args){
        Driver driver = new Driver("Jim Marko", 56, 38);
        Engine engine = new Engine(10000, "Man2");
        Lorry lorry = new Lorry("3st", "Man",driver, engine,15000 );
        System.out.println(lorry.toString());

        Driver driver1 = new Driver("Jennifer Millano", 41, 5);
        Engine engine1 = new Engine(1500, "Tesla");
        SportCar sportCar = new SportCar("Lux","Tesla",driver1, engine1,250 );
        System.out.println(sportCar.toString());
    }
}
