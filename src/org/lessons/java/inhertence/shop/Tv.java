package org.lessons.java.inhertence.shop;

import java.math.BigDecimal;

public class Tv extends Product{
    //ATTRIBUTI
   private boolean smart=false;
   private int dimension;
    //COSTRUCTOR



    public Tv(String name, String description, BigDecimal price, BigDecimal vat, boolean smart, int dimension) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.smart = smart;
        this.dimension = dimension;
    }
    //GETTER & SETTER


    public Boolean getSmart() {
        return smart;
    }

    public void setSmart(Boolean smart) {
        this.smart = smart;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "Dimensioni" + dimension +
                ", isSmart=" + smart +
                '}';
    }
}
