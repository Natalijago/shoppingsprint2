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
            total += foods.getTotalPrice();
        }
        return total;
    }

    public void allSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public int discSum (int getDiscount) {
        return getDiscount;
    }

    public int sumVeg (int amount) {
        return amount;
    }
}
