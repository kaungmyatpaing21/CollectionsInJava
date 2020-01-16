package com.main.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("SanPya", 8, 12);

        // Copying like below is called shallow copy meaning separate references but same objects
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);
//
//        //Testing shallow Copy
//        seatCopy.get(1).reserve();
//        if(theatre.reserveSeat("A02")){
//            System.out.println("Please pay for A02");
//        }else{
//            System.out.println("A02 is already reserved.");
//        }
//        System.out.println();

//        Collections.reverse(seatCopy);
//        System.out.println("Printing seatCopy: ");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seats: ");
//        printList(theatre.seats);

        Collections.shuffle(seatCopy);
        System.out.println("shuffle seatCopy: ");
        printList(seatCopy);

//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("minimum seat: " + minSeat.getSeatNumber());
//        System.out.println("maximum seat: " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Sorted seatCopy: ");
        printList(seatCopy);
    }

    public static void sortList(List<? extends Theatre.Seat> list){
         // Bubble sort
         // Bubble sort is more memory efficient than build-in merge sort but slower than in speed
        for(int i = 0; i < list.size()-1; i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i, j);
                }
            }
        }
    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("====================================================");
    }
}
