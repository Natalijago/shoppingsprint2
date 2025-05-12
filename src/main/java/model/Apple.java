package model;


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
    public int getDiscount() {
        if (colour == "red") {
            getDiscount();
        }
        return 0;
    }
}
