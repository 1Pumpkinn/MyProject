package net.saturn;



public class Main {

    public static void main(String[] args) {

        // Enums are a builtin way to define constants
        // a constant in java is something that doesn't change
        // it can not be changed when the "plugin / code is running"

        CoffeeSize ordered = CoffeeSize.LARGE;
        System.out.println("A customer has just ordered a " + ordered.getName() + " coffee for $" + ordered.getPrice() + ".");

        DinnerMenu dinnerOrder = DinnerMenu.CHICKS;
        System.out.println("A customer has just ordered " + dinnerOrder.getName() + " for $" + dinnerOrder.getPrice() + ".");


    }
}