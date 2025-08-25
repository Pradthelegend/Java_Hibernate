package com.Prad.Lecture_144_ManyToMany;

import com.Prad.Lecture_143_OneToMany_and_ManyToOne.Laptop2;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Developer3 {

    @Id
    private int dID;
    private String dName;
    private String dtech;
    @ManyToMany
    private List<Laptop3> laptops;

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

    public List<Laptop3> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop3> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "dID=" + dID +
                ", dName='" + dName + '\'' +
                ", dtech='" + dtech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
