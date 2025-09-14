package KDVTutari;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double rate, price, kdvPrice, totalPrice;

        System.out.print("Bir tutar giriniz:");
        price =  input.nextDouble();

//        kdvPrice = price * (rate / 100);

//        totalPrice = price + kdvPrice;
//
//        System.out.print("KDV Orani: " + (int)rate + "%");
//        System.out.print("KDV Tutari: " + kdvPrice + " TL");
//        System.out.print("Sizin tutara gore KDVli tutar: " + totalPrice + " TL");

//        Extra eger girilen tutar 0 ve 500 arasinda ise KDV orani 18%
//        500 den yuxari ise KDV orani 8%

        if(price > 0 && price <=500){
            rate = 18;
        }else if(price > 500){
            rate = 8;
        }else {
            rate = 0;
        }

        kdvPrice = price * (rate / 100);
        totalPrice = price + kdvPrice;

        System.out.println("KDV Orani: " + (int)rate + "%");
        System.out.println("KDV Tutari: " + kdvPrice + " TL");
        System.out.println("Sizin tutara gore KDVli tutar: " + totalPrice + " TL");

    }

}
