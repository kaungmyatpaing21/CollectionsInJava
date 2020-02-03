package com.setAndHashSet;
// reference: https://dzone.com/articles/working-with-hashcode-and-equals-in-java

import java.sql.Struct;
import java.util.ArrayList;
import java.util.HashSet;

public class equalsAndHashCodeTest {
    public static void main(String[] args) {
        Student alex1 = new Student("Alex", 1);
        Student alex2 = new Student("Alex", 1);
        System.out.println("alex1 hashcode: " + alex1.hashCode());
        System.out.println("alex2 hashcode: " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2: " + alex1.equals(alex2));
        System.out.println("------------------------------------------------------");

        // equals() with ArrayList
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(alex1);
        System.out.println("ArrayList size: " + students.size());
        System.out.println("ArrayList contains alex2: " + students.contains(alex2));
        System.out.println("------------------------------------------------------");

        // Overriding HashCode
        // equals() with HashSet
        // overriding only equals() doesn't work like above
        HashSet<Student> stdent = new HashSet<Student>();
        stdent.add(alex1);
        System.out.println("HashSet contains alex3: " + stdent.contains(new Student("Alex3", 1)));
    }
}
