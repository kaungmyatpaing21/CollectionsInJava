package com.main.collections;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("SanPya", 8, 12);
//        theatre.getSeats();
        if (theatre.reserveSeat("A01")){
            System.out.println("Please Pay!");
        }else{
            System.out.println("Seat is already reserved.");
        }
        if (theatre.reserveSeat("A01")){
            System.out.println("Please Pay!");
        }else{
            System.out.println("Seat is already reserved.");
        }
    }
}
