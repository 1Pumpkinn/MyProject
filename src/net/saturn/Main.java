package net.saturn;

import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] array = new String[]{"Test1", "Test2", "Test3"};
        System.out.println(array[0]);

        array[0] = "New Value!";
        System.out.println(array[0]);

        List<String> list = new ArrayList<>();
        list.add("Test1");
        list.add("Test2");
        System.out.println(list.get(1));

        HashMap<String, String> map = new HashMap<>();
        map.put("Banana", "Test");
        System.out.println(map.get("Banana"));



    }
}