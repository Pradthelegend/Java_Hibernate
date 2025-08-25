package com.Prad.Lecture_144_ManyToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity
public class Laptop3 {

    @Id
    private int lid;
    private String brand;
    private String model;
    private int ram;
    @ManyToMany
    private List<Developer3> dev;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public List<Developer3> getDev() {
        return dev;
    }

    public void setDev(List<Developer3> dev) {
        this.dev = dev;
    }

    @Override
    public String toString() {
        return "Laptop1{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
