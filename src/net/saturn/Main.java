package net.saturn;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] array = new String[]{"Test1", "Test2", "Test3"};

        List<String> list = new ArrayList<>();

        list.add("Test1");
        list.add("Test2");
        System.out.println(list.get(1));

        HashMap<Integer, String> map = new HashMap<>();
        // A hash map or any type of map is key and value
        // you hold a key to a locked door and when you get
        // something from the map it unlocks and
        // it returns what is behind the door
        map.put(5, "Test");
        System.out.println(map.get(5));
        // Unlocks the door and gets "Test"

        // with a hashmap you can use any instance
        // <String, String> <Integer, Double> <Polygon, Polygon> ??

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Banana", "Strawberry");
        System.out.println(map1.get("Banana"));


        // When can you use a hashmap in Minecraft

        // Let's say you're keeping track of points in a minigame
        // you have hashmap of the players UUID
        // and then the Integer for the points




    }
}