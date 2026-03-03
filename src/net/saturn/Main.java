package net.saturn;

import net.saturn.animals.Animal;
import net.saturn.animals.Cat;
import net.saturn.animals.Dog;
import net.saturn.vehicles.Car;
import net.saturn.vehicles.Motorbike;
import net.saturn.vehicles.Vehicle;

import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Inheritance - Vehicles, Animals,
        // Extends from the implementation of Vehicle

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Motorbike());

        vehicleList.get(0).getWheels();
        vehicleList.get(0).getColor();

        vehicleList.get(1).getWheels();
        vehicleList.get(1).getColor();

        for  (Vehicle vehicle : vehicleList) {
            vehicle.activateBrakes();
        }

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat());
        animalList.add(new Dog());

        animalList.get(0).getName();

        System.out.println("--- Cat ---");

        System.out.println(animalList.get(0).getName());
        System.out.println(animalList.get(0).getAge());
        System.out.println(animalList.get(0).getLegs());

        System.out.println("--- Dog ---");

        System.out.println(animalList.get(1).getName());
        System.out.println(animalList.get(1).getAge());
        System.out.println(animalList.get(1).getLegs());




    }
}