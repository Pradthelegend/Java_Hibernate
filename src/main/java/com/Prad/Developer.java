package com.Prad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//Note:This is part of lecture 140.
@Entity
public class Developer {

    @Id
    private int dID;
    private String dName;
    private String dtech;
    private Laptop laptop;

    public int getdID() {
        return dID;
    }

    public void setdID(int dID) {
        this.dID = dID;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getDtech() {
        return dtech;
    }

    public void setDtech(String dtech) {
        this.dtech = dtech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "dID=" + dID +
                ", dName='" + dName + '\'' +
                ", dtech='" + dtech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
