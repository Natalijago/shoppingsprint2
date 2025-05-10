package model;

public class Meat {
    int amount;
    double price;
    boolean isVegetarian = false;

    Meat(double meatPrice, int meatAmount, boolean meatIsVegetarian) {
        price = meatPrice;
        amount = meatAmount;
    }
}