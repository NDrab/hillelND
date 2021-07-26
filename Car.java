package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    String carClass;
    String brand;
    Driver driver;
    Engine engine;

    Car (String carClass, String brand,Driver driver, Engine engine ){
        this.carClass=carClass;
        this.brand=brand;
        this.driver=driver;
        this.engine=engine;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Let`s drive");
    }
   public void stop(){
       System.out.println("Stop");
   }
    public void  turnRight(){
        System.out.println("Turn Right");
    }
    public void turnLeft (){
        System.out.println("Turn Left");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {

        Driver driver= new Driver("Anton", 30,9);
        Engine engine = new Engine(3000,"Tesla" );
        Car car = new Car ("1st", "Tesla", driver, engine);

        System.out.println(car.toString());

    }
}










