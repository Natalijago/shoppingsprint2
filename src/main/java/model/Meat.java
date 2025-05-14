package model;

public class Meat extends Food {
    public Meat (int price, double amount) {
        super(price, amount, false);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}