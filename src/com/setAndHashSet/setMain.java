package com.setAndHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Set Interface Bulk Operations
 */
public class setMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        squares.add(2);
        squares.add(4);
        squares.add(6);

        Set<Integer> cubes = new HashSet<>();
        cubes.add(1);
        cubes.add(4);
        cubes.add(5);

        for(int i: squares){
            System.out.println(i);
        }
        System.out.println(".............");
        squares.retainAll(cubes);

        for(int i: squares){
            System.out.println(i);
        }
        System.out.println(".........");
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");

        // asList - convert array to collection
        Set<String> words = new HashSet<>(Arrays.asList(arrayWords));
        for(String s: words){
            System.out.println(s);
        }
        System.out.println();

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        nature.addAll(Arrays.asList(natureWords));
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("Asymmetric Difference");
        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        System.out.println("Symmetric Difference");
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(divine);
        intersectionTest.retainAll(nature);

        unionTest.removeAll(intersectionTest);
        printSet(unionTest);
        System.out.println();

        if(nature.containsAll(divine)){
            System.out.println("divine is the subset of nature");
        }

        if(nature.containsAll(intersectionTest)){
            System.out.println("intesectionTest is the subset of nature");
        }

        if(divine.containsAll(intersectionTest)){
            System.out.println("intersectionTest is the subset of divine");
        }
    }

    private static void printSet(Set<String> diff){
        System.out.print("\t");
        for(String s: diff){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
