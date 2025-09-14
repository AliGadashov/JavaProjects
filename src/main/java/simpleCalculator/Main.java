package simpleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz: ");
        int a = input.nextInt();

        System.out.print("2. sayiyi giriniz: ");
        int b = input.nextInt();

        System.out.print("Islem seciniz: ");
        System.out.print("\n1 - Toplama\n2 - Cikarma\n3 - Carpma\n4 - Bolme\n");
        int choice = input.nextInt();
        double result;

//        if (choice == 1){
//            result = a + b;
//            System.out.println("Sonuc: " + result);
//        }else if (choice == 2){
//            result = a - b;
//            System.out.println("Sonuc: " + result);
//        }else if (choice == 3){
//            result = a * b;
//            System.out.println("Sonuc: " + result);
//        } else if (choice == 4) {
//            if (b == 0){
//                System.out.println("Bolen sayisi sifir olamaz.");
//            }
//            result = (double) a / b;
//            System.out.println("Sonuc: " + result);
//        }else {
//            System.out.print("Hatali secim yaptiniz.");
//        }

//        Bonus:

        switch (choice){
            case 1:
                result = a + b;
                System.out.println("Sonuc: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Sonuc: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Sonuc: " + result);
                break;
            case 4:
                if (b == 0){
                    System.out.println("Bolen sayisi sifir olamaz.");
                }
                result = (double) a / b;
                System.out.println("Sonuc: " + result);
                break;
            default:
                System.out.print("Hatali secim yaptiniz.");
                break;



        }

    }
}
