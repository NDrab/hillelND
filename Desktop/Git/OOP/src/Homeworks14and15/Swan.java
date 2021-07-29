package Homeworks14and15;

import java.util.Objects;

public class Swan extends Bird implements CanFly,CanSwim,CanEat, BeakIsPresent {

    final boolean longNeck = true;
    int age;

    Swan (int age){
        this.age = age;
    }

    public boolean getLongNeck() { return longNeck; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    @Override
    public String name() { return " I'm a swan"; }

    @Override
    public void canEat() { System.out.println("I can eat grass"); }

    @Override
    public void canFly() { System.out.println("I can fly using by my wings"); }

    @Override
    public void hasABeak () { System.out.println("I have a beak"); }

    @Override
    public void canSwim() { System.out.println("I can swim"); }

    @Override
    public int getWings() { return super.getWings(); }

    @Override public int getLegs() { return super.getLegs(); }

    @Override
    public String toString() {
        return name() +
                " with " + getLegs() +" legs " +
                " and with " + getWings() +" wings " +
                " with long neck " + getLongNeck() +
                " My age is (years) " + getAge() ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Swan swan = (Swan) o;
        return longNeck == swan.longNeck && age == swan.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), longNeck, age);
    }
}
