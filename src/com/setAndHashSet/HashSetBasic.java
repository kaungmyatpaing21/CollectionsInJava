package com.setAndHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasic {
    public static void main(String[] args) {
        HashSet<String> strawHatCrew = new HashSet<String>();
        strawHatCrew.add("luffy");
        strawHatCrew.add("zoro");
        strawHatCrew.add("sanji");
        strawHatCrew.add("usopp");
        strawHatCrew.add("luffy");
        Iterator<String> itr = strawHatCrew.iterator();

        // Traversing elements
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        strawHatCrew.remove("luffy");
        System.out.println("Set after removing specific element: " + strawHatCrew);

        HashSet<String> strawHatCrew2 = new HashSet<>();
        strawHatCrew2.add("nami");
        strawHatCrew2.add("robin");
        strawHatCrew2.add("brook");
        strawHatCrew2.add("franky");
        strawHatCrew2.addAll(strawHatCrew);
        System.out.println("Updated list: " + strawHatCrew2);

        strawHatCrew2.removeAll(strawHatCrew);
        System.out.println("Removing all elements from strawHatCrew: " + strawHatCrew2);

        strawHatCrew2.removeIf(str->str.contains("brook"));
        System.out.println("crew after removing brook: " + strawHatCrew2);

        //removing all elements from the set
        strawHatCrew2.clear();
        System.out.println("crew after all elements removed: " + strawHatCrew2);
    }
}
