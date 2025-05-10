package model;

public class Apple extends Food {
    private String colour;
    public Apple(int price, int amount, boolean isVegetarian, String colour) {
        super(price, amount, isVegetarian);
        this.colour = colour;
    }

    @Override
    public int getDiscount() {
        if (colour == "red") {
            getDiscount();
        }
        return 0;
    }
}
