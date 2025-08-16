package com.Prad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // This annotation tells hibernate that this class needs to be represented in the database.
public class Students {

    @Id
    private int rollNo;
    private String name;
    private int age;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
