package model;

import model.service.ShoppingCart;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public abstract class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(100,5);
        Apple greenApple = Apple.newApple(50, 10, GREEN);
        Apple redApple = Apple.newApple(60,8, RED);

        Food[] foods = {meat, greenApple, redApple};

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getTotalPriceVeg());
    }

}
