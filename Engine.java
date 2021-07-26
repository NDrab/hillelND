//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company.details;

public class Engine {
    int power;
    String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    void setPower(int power) {
        this.power = power;
    }

    void setCompany(String company) {
        this.company = company;
    }

    public int getPower() {
        return this.power;
    }

    public String getCompany() {
        return this.company;
    }

    public String toString() {
        String engineInfo = String.format("Engine power is %d kW,the manufactor's company is %s.", this.getPower(), this.getCompany());
        return engineInfo;
    }

    public static void main(String[] args) {
        Engine engine1 = new Engine(1500, "Auto");
        System.out.println(engine1.toString());
    }
}
