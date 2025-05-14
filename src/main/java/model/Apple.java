package model;
import model.constants.Discount;

import static model.constants.Colour.RED;
import static model.constants.Discount.DISCOUNT;


public class Apple extends Food {
    private final String colour;

    private Apple(double price,
                  int amount,
                  String colour) {
        super(price, amount, true);
        this.colour = colour;
    }

    public static Apple newApple(double price,
                                 int amount,
                                 String colour) {
        return new Apple(price, amount, colour);
    }


    @Override
    public double getDiscount() {
        if (colour.equals(RED)) {
            return getTotalPrice() * DISCOUNT / 100;
        }
        return 0;
    }
}
