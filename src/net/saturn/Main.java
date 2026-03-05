package net.saturn;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Meow");
        list.add("Bark");
        list.add("Rawr");
        list.add("Croak");
        list.add("Quack");

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(random.nextInt(10)); // 0 -> 9
        }

        for (int i = 0; i < 10; i++) {

            Random listRandom = new Random();
            System.out.println(list.get(listRandom.nextInt(list.size())));
        }
    }
}