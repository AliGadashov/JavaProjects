package Taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pricePerKm = 2.20, distance, totalPrice = 10 ;

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        distance = input.nextDouble();

        totalPrice += (distance * pricePerKm);

        if(totalPrice < 20){
            totalPrice = 20;
        }

        System.out.println("Tutar: " + totalPrice + " TL");
    }
}
