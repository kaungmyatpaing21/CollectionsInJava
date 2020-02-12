package com.setAndHashSet;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");
        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2)); // this will be false if you override equals() method in Labrador class
        // If so, the fact is that it violates symmetric rule of overriding equals: " Labrador is the instance of Dog but Dog is not the instance of Labrador "
    }
}
