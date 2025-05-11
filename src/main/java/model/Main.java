package model;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public abstract class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(100,5,false);
        Apple greenApple = Apple.newApple(50, 10, true, RED);
        Apple redApple = Apple.newApple(60,8, true, GREEN);


    }

}
