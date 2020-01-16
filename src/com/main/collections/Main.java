package com.main.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("SanPya", 8, 12);

        // Copying like below is called shallow copy meaning separate references but same objects
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.getSeats());
//        printList(seatCopy);

        if(theatre.reserveSeat("A02")){
            System.out.println("Please Pay.");
        }else{
            System.out.println("Seat already reserved.");
        }

        if(theatre.reserveSeat("A02")){
            System.out.println("Please Pay.");
        }else{
            System.out.println("Seat already reserved.");
        }

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 2));
        priceSeats.add(theatre.new Seat("A00", 2));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("====================================================");
    }
}
