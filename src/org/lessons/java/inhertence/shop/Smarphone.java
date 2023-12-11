package org.lessons.java.inhertence.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smarphone extends Product{
private int memory;
private int imei;



    public Smarphone(String name, String description, BigDecimal price, BigDecimal vat, int memory) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.memory = memory;
        this.imei = generateCode();
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }
    private int generateCode(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(0, 10000);
    }

    public Smarphone(String name, String description, BigDecimal price, BigDecimal vat) throws IllegalArgumentException {
        super(name, description, price, vat);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "IMEI='" + imei + '\'' +
                ", memorySize=" + memory +
                '}';
    }
}
