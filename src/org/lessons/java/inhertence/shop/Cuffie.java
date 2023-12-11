package org.lessons.java.inhertence.shop;

import java.math.BigDecimal;

public class Cuffie extends Product {
private String color;
private boolean wireless=false;



    public Cuffie(String name, String description, BigDecimal price, BigDecimal vat, String color,boolean wireless ) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.color = color;
        this.wireless = wireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Headphones{" +
                "color='" + color + '\'' +
                ", areWired=" + wireless +
                '}';
    }
}
