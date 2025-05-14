package model.service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food food : foods) {
            total += food.getTotalPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food food : foods) {
            total += food.getTotalPrice() - food.getDiscount();
        }
        return total;
    }

   public double getTotalPriceVeg() {
        double total = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                total += food.getTotalPrice();
            }
        }
        return total;
   }
}
