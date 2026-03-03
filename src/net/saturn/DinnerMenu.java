package net.saturn;

public enum DinnerMenu {

    TACOS("Taco", 5),
    STEAK("Steak", 25),
    PORK("Pork", 15),
    CHICKEN("Chicken", 10),
    PASTA("Pasta", 8),
    DUCK("Duck", 11),
    CHICKS("Chicks", 1000000000);

    private String name;
    private int price;

    DinnerMenu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }

}
