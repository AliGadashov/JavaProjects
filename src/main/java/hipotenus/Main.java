package hipotenus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double a, b, hipotenus;
        Scanner input = new Scanner(System.in);

        System.out.print("Dik kenarli ucgenin bir tarafini giriniz: ");
        a = input.nextInt();
        System.out.print("Dik kenarli ucgenin diger tarafini giriniz: ");
        b = input.nextInt();

        hipotenus = Math.sqrt(((a * a) + (b * b)));

        System.out.println("Hipotenus uzunlugu: " + hipotenus);

//        Bonus:

//        Ucgenin cevresini ve sahesini hesablayin

        double u, perimetr, area;

        u = (a + b + hipotenus)/2;

        perimetr = 2*u;

        System.out.println("Ucgenin cevresi: " + perimetr);

        area = Math.sqrt(u*(u - a)*(u - b)*(u - hipotenus));
        System.out.println("Ucgenin alani: " + area);
    }
}
