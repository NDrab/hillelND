package Homeworks14and15;

public class Main {

    public  static void main (String [] args) {

        Swallow swallow1 = new Swallow(2, "Europe");
        System.out.println(swallow1.toString());
        swallow1.bird();
        swallow1.hasABeak();
        swallow1.canEat();
        swallow1.canFly();


        Swan swan = new Swan(2);
        System.out.println(swan.toString());
        swan.canFly();
        swan.canEat();
        swan.canSwim();

        RubberDuck rubberDuck = new RubberDuck(6, "yellow");
        System.out.println(rubberDuck.toString());
        System.out.println(rubberDuck.equals(swallow1));
        System.out.println(rubberDuck.getColor());

        Platypus platypus = new Platypus(10, "Zoo");
        System.out.println(platypus.toString());
        System.out.println(platypus.equals(swan));

    }

    }

