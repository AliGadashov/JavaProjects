package DaireAlanVeCevre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double perimeterFormula, areaFormula, pi = Math.PI;

        System.out.println("Radiusu giriniz: ");
        int r = input.nextInt();

        areaFormula = pi * r * r;
        perimeterFormula = 2 * pi * r;

        System.out.println("Cevre: " + perimeterFormula);
        System.out.println("Alan: " + areaFormula);

//        Bonus:

        System.out.println("Merkez acisi olcusunu giriniz: ");
        double centralAngle = input.nextDouble();

        double formula = (pi *(r*r) * centralAngle) / 360;

        System.out.println("Merkez acisi olcusu ile alinan daire cevresi: " + formula);

    }
}
