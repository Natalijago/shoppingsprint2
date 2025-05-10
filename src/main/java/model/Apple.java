package model;

public abstract class Apple extends Food {
    private String colour;
    public Apple (int price, double amount, boolean isVegetarian, String colour) {
        super(price, amount, isVegetarian);
        this.colour = colour;
    }
}
