package notOrtalamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double physics;
        double chemistry;
        double nativeLanguage;
        double history;
        double maths;

        double average;

        System.out.println("Enter Your Physics Score: ");
        physics = input.nextInt();

        System.out.println("Enter Your Chemistry Score: ");
        chemistry = input.nextInt();

        System.out.println("Enter Your Native Language Score: ");
        nativeLanguage = input.nextInt();

        System.out.println("Enter Your History Score: ");
        history = input.nextInt();

        System.out.println("Enter Your Maths Score: ");
        maths = input.nextInt();

        average = (physics + chemistry + nativeLanguage + history + maths) / 5;

        System.out.println("Your average score: " + average);

//      if else kullanmadan
//      Eger kullanicinin ortalamasi 60dan buyuk ise ekrana "Sinifi gecti",
//      kucuk ise "Sinifda kaldi" yazsin

        String result = average >=60 ? "You passed exam" : "You failed exam";

        System.out.println(result);
    }
}
