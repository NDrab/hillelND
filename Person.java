//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company.professions;

public class Person {
    private int age;
    public String fullName;

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    Person(String fullName) {
        this.fullName = fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        String PersonInfo = String.format("Driver's full name is %s, his or her age is %d.", this.getFullName(), this.getAge());
        return PersonInfo;
    }
}
