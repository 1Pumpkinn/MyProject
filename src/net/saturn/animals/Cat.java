package net.saturn.animals;

public class Cat extends Animal {

    public Cat() {
        super("Saturn", 2, 4);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
