package net.saturn.animals;

public class Dog extends Animal {

    public Dog() {
        super("Milo", 8, 4);

    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
