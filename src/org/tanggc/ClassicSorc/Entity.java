package org.tanggc.ClassicSorc;

import java.util.HashMap;
import java.util.Map;

public class Entity {

    int animalNum;
    long animalValue;
    boolean canSold;
    double price;
    public int getAnimalNum() {
        System.out.println();
        System.out.println();
        Map<String, Object> nnn = new HashMap<>();
        Map<String, Object> aaaa = new HashMap<>();
        return animalNum;
    }
    public static void main(String[] args) {
        new Entity().getAnimalNum();
    }

    public void setAnimalNum(int animalNum) {
        this.animalNum = animalNum;
    }

    public long getAnimalValue() {
        return animalValue;
    }

    public void setAnimalValue(long animalValue) {
        this.animalValue = animalValue;
    }

    public boolean isCanSold() {
        return canSold;
    }

    public void setCanSold(boolean canSold) {
        this.canSold = canSold;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
