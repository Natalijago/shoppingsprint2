package model;

public class Meat extends Food {
    public Meat (int price, double amount, boolean isVegetarian) {
        super(price, amount, isVegetarian);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}