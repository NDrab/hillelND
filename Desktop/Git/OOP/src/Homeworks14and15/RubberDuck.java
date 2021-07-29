package Homeworks14and15;

import java.util.Objects;

public class RubberDuck implements CanSwim, BeakIsPresent{
    final boolean toy=true;
    int size;
    String color;

    RubberDuck (int size, String color){
    this.size=size;
    this.color=color; }

    @Override public void canSwim() { }

    @Override public void hasABeak() { }


    public boolean isToy() {
        return toy;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RubberDuck that = (RubberDuck) o;
        return toy == that.toy && size == that.size && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toy, size, color);
    }

    @Override
    public String toString() {
        return "RubberDuck{" +
                "toy=" + toy +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
