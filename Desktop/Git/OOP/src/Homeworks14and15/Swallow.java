package Homeworks14and15;

import java.util.Objects;

public class Swallow extends Bird implements CanFly, CanEat, BeakIsPresent {

    int age;
    String location;

    Swallow (int age, String location){
        this.age = age;
        this.location  =location;
    }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getLocation() { return location; }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String name() {
        return " I'm a swallow";
    }

    @Override
    public void canEat() {
        System.out.println("I can eat bugs");
    }

    @Override
    public void canFly() {
        System.out.println("I can fly using by my wings");
    }

    @Override
    public void hasABeak() {
        System.out.println("I have a beak");
    }

    @Override
    public String toString() {
        return name() +
                " with " + getLegs() + " legs " +
                " and with " + getWings() + " wings " +
                " I am " + getAge() +
                 "My location is "+ getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Swallow swallow = (Swallow) o;
        return age == swallow.age && Objects.equals(location, swallow.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age, location);
    }
}
