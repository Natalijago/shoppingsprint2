package model;

public abstract class Apple extends Food {
    private String colour;
    public Apple (int price, double amount, boolean isVegetarian) {
        super(price, amount, isVegetarian);
    }
}
