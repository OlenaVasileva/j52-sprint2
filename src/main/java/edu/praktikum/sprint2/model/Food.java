package edu.praktikum.sprint2.model;

import static model.praktikum.sprint2.constants.Colour.COLOUR_1;

public abstract class Food implements Discountable {
    private final int amount;
    private final double price;
    private final boolean isVegetarian;


    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getTotalWithoutDiscount() {

        return amount * price;
    }

    public double getTotalWithDiscount() {
        return ((amount * price) * getDiscount()) / 100;
    }

    public double getTotalVegetarianWithoutDiscount() {
        boolean result = true;

        if (isVegetarian) {
            return amount * price;
        }
        return 0;
    }
}
