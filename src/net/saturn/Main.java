package net.saturn;

import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] array = new String[]{"Test1", "Test2", "Test3"};

        array[0] = "New Value!";

        ArrayList<String> list = new ArrayList<>();
        list.add("Test1");
        list.add("Test2");

        HashMap<String, String> map = new HashMap<>();
        map.put("banana", "Test");
        map.put("meow", "Kitten");


        for(String string : list) {
            System.out.println(string);
        }

        int number = 0;
        while(number < 11) {
            System.out.println(number);
            number++;

        }
    }
}