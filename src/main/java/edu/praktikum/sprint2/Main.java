package edu.praktikum.sprint2;

import edu.praktikum.sprint2.model.Apple;
import edu.praktikum.sprint2.model.Food;
import edu.praktikum.sprint2.model.Meat;
import edu.praktikum.sprint2.model.service.ShoppingCart;

import static model.praktikum.sprint2.constants.Colour.COLOUR_1;
import static model.praktikum.sprint2.constants.Colour.COLOUR_2;

public class Main {
    public static void main(String[] args) {

        Food[] foods = new Food[] {
                new Meat(5, 100, false),
                new Apple(10, 50, true, COLOUR_1),
                new Apple(8, 60, true, COLOUR_2),
        };
        ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("Cумма товаров без скидки " + shoppingCart.getTotalWithoutDiscount());
        System.out.println("Сумма товаров со скидкой " + shoppingCart.getTotalWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.getTotalVegetarianWithoutDiscount());
    }
}
