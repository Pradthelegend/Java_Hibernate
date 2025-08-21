package com.Prad;

import jakarta.persistence.Embeddable;
//Note:This is linked to "Developer" class and this is part of lecture 140.
@Embeddable // When you mark a class as "Embeddable" the class attributes like "brand", "ram" etc get added as columns while creating the table. Refer "Developer" class you'll understand.
public class Laptop {

    private String brand;
    private String model;
    private int ram;

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

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
