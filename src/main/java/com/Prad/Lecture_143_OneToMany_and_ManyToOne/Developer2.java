package com.Prad.Lecture_143_OneToMany_and_ManyToOne;

import com.Prad.Lecture_142_OneToOne_Mapping.Laptop1;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Developer2 {

    @Id
    private int dID;
    private String dName;
    private String dtech;
    @OneToMany(mappedBy = "dev") //By using "mappedBy" you are saying who is mapping it.
    private List<Laptop2> laptops;

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

    public List<Laptop2> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop2> laptops) {
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
