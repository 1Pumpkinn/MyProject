package net.saturn;

public enum CoffeeSize {

    SMALL("Small", 2),
    MEDIUM("Medium", 4),
    LARGE("Large", 7),;

    private String name;
    private int price;

    // Constructor is feeding into the Enum values ^^^

    CoffeeSize(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public String getName() { return name; }
    public int getPrice() { return price; }

}
