package net.saturn;


public class Main {

    public static void main(String[] args) {
        // Switch statements are basically a way to easily format a load of if else's
        // break is going to jump out of the current code block and execute any other code below
        // you can add a break to a for loop, while loop, or wherever and that will jump out of the loop and continue the code.
        // return actually stops the code execution as a whole

        String word = "banana";

        switch (word) {
            case "banana": System.out.println("You found it!"); return;

            case "apple": System.out.println("This is not a banana"); break;
            case "pear": System.out.println("This is not a banana"); break;
            case "kiwi": System.out.println("This is not a banana"); break;
            default: System.out.println("No Match was found!"); break;
            // if user puts in something that we don't account for
        }

        System.out.println("Hello you broke out the code block");

    }
}