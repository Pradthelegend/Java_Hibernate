package com.Prad.Lecture_142_OneToOne_Mapping;

import com.Prad.Laptop;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Developer1 {

    @Id
    private int dID;
    private String dName;
    private String dtech;
    @OneToOne
    private Laptop1 laptop;

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

    public Laptop1 getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop1 laptop) {
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
