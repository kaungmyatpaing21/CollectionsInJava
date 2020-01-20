package com.main.collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> strawHat = new HashMap<>();
        if(strawHat.containsKey("luffy")){
            System.out.println("Luffy already on crew.");
        }else{
            strawHat.put("luffy", "The future pirate King.");
            System.out.println("luffy added successfully.");
        }

        System.out.println(strawHat.put("zoro", "the best swordman in the world."));
        System.out.println(strawHat.put("sanji", "black foot sanji"));

        for(String key : strawHat.keySet()){
            System.out.println(key + " " + strawHat.get(key));
        }
    }
}
