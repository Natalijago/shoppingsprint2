package model;
import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;
import static model.constants.Discount.DISCOUNT;


public class Apple extends Food {
    private final String colour;
    private Apple(int price,
                  int amount,
                  boolean isVegetarian,
                  String colour) {
        super(price, amount, isVegetarian);
        this.colour = colour;
    }

    public static Apple newApple(int price,
                                 int amount,
                                 boolean isVegetarian,
                                 String colour) {
        return new Apple(price, amount, isVegetarian, colour);
    }


    @Override
    public double getDiscount() {
        if (colour == RED) {
            amount;
        }
        return 0;
    }
}
