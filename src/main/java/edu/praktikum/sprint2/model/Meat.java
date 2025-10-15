package edu.praktikum.sprint2.model;

public class Meat extends Food {
    public Meat(int amount, double price, boolean isVegetarian) {
        super(amount, price, isVegetarian);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
