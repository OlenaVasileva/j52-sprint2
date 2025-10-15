package edu.praktikum.sprint2.model;

import static edu.praktikum.sprint2.model.constants.Colour.COLOUR_1;
import static edu.praktikum.sprint2.model.constants.Discount.APPLE_COLOUR_1_DISCOUNT;

public class Apple extends Food {
    private final String colour;
    public Apple(int amount, double price, boolean isVegetarian, String colour) {
        super(amount, price, isVegetarian);
        this.colour = colour;
    }

    @Override
    public double getDiscount()
    {
        return COLOUR_1.equals(colour) ? APPLE_COLOUR_1_DISCOUNT : 0;
    }
}


