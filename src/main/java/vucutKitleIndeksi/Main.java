package vucutKitleIndeksi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double weight, height, index;

        System.out.print("Boyunuzu giriniz: ");
        height = scan.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        weight = scan.nextDouble();

        index = weight/(height*height);

        System.out.println("Vucut kitle indeksiniz: " + index);

//        Bonus:
//        Eger 18.5 den kucukse "Zayif"
//        Eger 18.5 ve 24.9 arasinda ise "Ideal"
//        Eger 25 ve 29.9 arasinda ise "Sisman"
//        Eger 30 ve 34.9 arasinda ise "Obez"
//        Eger 35 den buyukse "Asiri obez"

        if (index < 18.5){
            System.out.println("Zayif");
        }else if (index >= 18.5 && index <= 24.9){
            System.out.println("Ideal");
        }else if (index >= 25 && index <= 29.9){
            System.out.println("Sisman");
        }else if (index >= 30 && index <= 34.9){
            System.out.println("Obez");
        }else if (index >= 35){
            System.out.println("Asiri obez");
        }else {
            System.out.println("Hata");
        }
    }
}
