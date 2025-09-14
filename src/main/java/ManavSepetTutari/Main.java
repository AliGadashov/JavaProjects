package ManavSepetTutari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double cucumber, apple, courgette, tomatoes, eggplant;

        cucumber = 2.14;
        apple = 3.67;
        courgette = 1.11;
        tomatoes = 1.29;
        eggplant = 5.00;

        System.out.println("How many kilos of cucumbers do you need?: ");
        double cucumberKq = scan.nextDouble();
        System.out.println("How many kilos of apples do you need?: ");
        double appleKq = scan.nextDouble();
        System.out.println("How many kilos of courgette do you need?: ");
        double courgetteKq = scan.nextDouble();
        System.out.println("How many kilos of tomatoes do you need?: ");
        double tomatoesKq = scan.nextDouble();
        System.out.println("How many kilos of eggplant do you need?: ");
        double eggplantKq = scan.nextDouble();

        double total = cucumber * cucumberKq +
                        apple * appleKq +
                        courgette * courgetteKq +
                        tomatoes * tomatoesKq +
                        eggplant * eggplantKq;

        System.out.println("Total cost: " + total + "$");

    }
}
