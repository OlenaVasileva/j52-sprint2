package edu.praktikum.sprint2.model.service;

import edu.praktikum.sprint2.model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;

    }
    public double getTotalWithoutDiscount() {
        double result = 0;
        for (Food food : foods) {
            result += food.getTotalWithoutDiscount();
        }
        return result;
    }

    public double getTotalWithDiscount() {
        double result = 0;
        for (Food food : foods) {
            result += food.getTotalWithoutDiscount() - food.getTotalWithDiscount();
        }
        return result;
    }
    public double getTotalVegetarianWithoutDiscount() {
        double result = 0;
        for (Food food : foods) {
            result += food.getTotalVegetarianWithoutDiscount();
        }
        return result;
    }
}
