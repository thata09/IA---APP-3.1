package app;

import model.Cat;
import enums.FurColor;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(
                "Whiskers",
                3,
                4.5,
                FurColor.GRAY,
                true,
                "Fish",
                25,
                false
        );

        cat.displayInfo();
        System.out.println();

        cat.makeSound();
        cat.sleep();
        cat.purr();
        System.out.println();

        cat.move(3, 40);
        cat.move(2, "mouse");
        System.out.println();
   
        cat.loseLife();
        cat.loseLife();

        System.out.println();

        System.out.println("Lives: " + cat.getLives());
        System.out.println("Fur Color: " + cat.getFurColor().getDisplayName());
        System.out.println("Indoor: " + cat.isIndoor());
    }
}