package Homeworks14and15;

import java.util.Objects;

public class Platypus implements BeakIsPresent, CanSwim, CanEat{

    final String group = "mammal";
    int age;
    String location;

    Platypus (int age, String location){
        this.age=age;
        this.location=location;
    }

    @Override public void canEat() { System.out.println("I can eat bugs"); }

    @Override public void canSwim() { System.out.println("I can swim");}

    @Override public void hasABeak () { System.out.println("I have a beak");}

    public String getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platypus platypus = (Platypus) o;
        return age == platypus.age && Objects.equals(group, platypus.group) && Objects.equals(location, platypus.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, age, location);
    }

    @Override
    public String toString() {
        return "Platypus{" +
                "group='" + getGroup()+ '\'' +
                ", age=" + getAge() +
                ", location='" + getLocation() + '\'' +
                '}';
    }
}
