//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company.professions;

public class Driver extends Person {
    public int experience;

    public Driver(String getFullName, int getAge, int experience) {
        super(getFullName,getAge );
        this.experience = experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return this.experience;
    }

    public String toString() {
        String DriverInfo = String.format("Driver's full name is %s. He/She is %d. His/her drive experience is %d.", super.getFullName(),super.getAge(), this.getExperience());
        return DriverInfo;
    }

    public static void main(String[] args) {
        Driver driver1 = new Driver("John Russel",50, 20);
        System.out.println(driver1.toString());
        System.out.println(driver1.getExperience());
    }
}
