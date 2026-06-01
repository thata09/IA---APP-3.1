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
    System.out.println("Cor do Pelo: " + furColor.getDisplayName());
    System.out.println("Gato de Interior: " + isIndoor);
    System.out.println("Comida Favorita: " + favoriteFood);
    System.out.println("Frequência de Ronronar: " + purringFrequency + " Hz");
    System.out.println("Castrado: " + isNeutered);
}