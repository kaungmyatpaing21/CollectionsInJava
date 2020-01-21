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
        System.out.println(strawHat.put("usopp", "the sniper king"));
        System.out.println(strawHat.put("nami", "the greatest navigator"));

        strawHat.remove("nami");
        if(strawHat.remove("luffy", "the sniper king")){
            System.out.println("luffy removed.");
        }else{
            System.out.println("the selected key / value pair not found.");
        }

        System.out.println(strawHat.replace("luffy", "the 5th yonko"));
        if(strawHat.replace("luffy", "The future pirate King.", "Son of Monkey D Dragon.")){
            System.out.println("luffy desc replaced.");
        }else{
            System.out.println("luffy desc was not replaced.");
        }


        for(String key : strawHat.keySet()){
            System.out.println(key + " " + strawHat.get(key));
        }
    }
}
