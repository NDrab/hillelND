package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Objects;

public class SportCar extends Car {
    private int topSpeed;

    SportCar (String carClass, String brand, Driver driver, Engine engine,int topSpeed){
        super(carClass,  brand,  driver,  engine);
        this.topSpeed=topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
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
        return "SportCar{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                ", topSpeed=" + topSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportCar sportCar = (SportCar) o;
        return topSpeed == sportCar.topSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(topSpeed);
    }
}
