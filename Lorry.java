package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int capacity;

    Lorry (String carClass, String brand, Driver driver, Engine engine, int getCapacity){
        super( carClass,  brand,  driver,  engine);
        this.capacity=getCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lorry lorry = (Lorry) o;
        return capacity == lorry.capacity;
    }

    @Override
    public String getCarClass() {
        return super.getCarClass();
    }

    @Override
    public void setCarClass(String carClass) {
        super.setCarClass(carClass);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public Driver getDriver() {
        return super.getDriver();
    }

    @Override
    public void setDriver(Driver driver) {
        super.setDriver(driver);
    }

    @Override
    public Engine getEngine() {
        return super.getEngine();
    }

    @Override
    public void setEngine(Engine engine) {
        super.setEngine(engine);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void turnRight() {
        super.turnRight();
    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }

    @Override
    public String toString() {
        return super.toString() + "capacity -  " + getCapacity();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
