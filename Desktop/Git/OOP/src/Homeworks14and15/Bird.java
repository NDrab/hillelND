package Homeworks14and15;

import java.util.Objects;

public abstract class Bird {

    final int legs = 2;
    final int wings =2;

    public void bird () {
        System.out.println("I am a bird." + name());
    }

    public abstract String name();

    public int getWings() { return wings; }

    public int getLegs() { return legs; }

    @Override
    public String toString() {
        return "I am a bird with {" +
                getLegs() +"legs=" +
                getWings() +", wings=" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return legs == bird.legs && wings == bird.wings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(legs, wings);
    }
}

