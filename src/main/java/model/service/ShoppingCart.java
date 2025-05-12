package model.service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

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
