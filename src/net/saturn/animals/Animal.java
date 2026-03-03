package net.saturn.animals;

public abstract class Animal {

    private String name;
    private int age;
    private int legs;

    public Animal(String name, int age, int legs) {
        this.name = name;
        this.age = age;
        this.legs = legs;

    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getLegs() { return legs; }

    public abstract void makeSound();

}
