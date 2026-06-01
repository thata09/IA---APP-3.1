package model;

import enums.FurColor;
import enums.Habitat;

public class Cat extends Animal {

    private int lives;
    private FurColor furColor;
    private boolean isIndoor;
    private String favoriteFood;
    private int purringFrequency;
    private boolean isNeutered;

    public Cat(String name, int age, double weight,
               FurColor furColor, boolean isIndoor,
               String favoriteFood, int purringFrequency,
               boolean isNeutered) {

        super(
                name,
                30,
                age,
                weight,
                isIndoor ? Habitat.DOMESTIC : Habitat.URBAN,
                !isIndoor
        );

        this.lives = 7;
        this.furColor = furColor;
        this.isIndoor = isIndoor;
        this.favoriteFood = favoriteFood;
        this.purringFrequency = purringFrequency;
        this.isNeutered = isNeutered;
    }

    @Override
    public void makeSound() {
        System.out.println(getName()
                + " diz: Miau! (ronronando a "
                + purringFrequency + " Hz)");
    }

    @Override
    public void sleep() {
        System.out.println(getName()
                + " encontra o lugar mais quente e dorme por 14 horas.");
    }

    public void move(int distance, int speed) {
        System.out.println(getName()
                + " saltou "
                + distance
                + " metros a "
                + speed
                + " km/h.");
    }

    public void move(int distance, String target) {
        System.out.println(getName()
                + " se aproximou silenciosamente de "
                + target
                + " por "
                + distance
                + " metros.");
    }

    public void purr() {
        System.out.println(getName()
                + " está ronronando a "
                + purringFrequency
                + " Hz... purrr~");
    }

    public void loseLife() {
        if (lives > 0) {
            lives--;
            System.out.println(getName()
                    + " perdeu uma vida! Vidas restantes: "
                    + lives);
        } else {
            System.out.println(getName()
                    + " não tem mais vidas.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Vidas: " + lives);
        System.out.println("Cor do pelo: " + furColor.getDisplayName());
        System.out.println("Gato de interior: " + isIndoor);
        System.out.println("Comida favorita: " + favoriteFood);
        System.out.println("Frequência de ronronar: " + purringFrequency + " Hz");
        System.out.println("Castrado: " + isNeutered);
    }

    public int getLives() {
        return lives;
    }

    public FurColor getFurColor() {
        return furColor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getPurringFrequency() {
        return purringFrequency;
    }

    public boolean isNeutered() {
        return isNeutered;
    }
}