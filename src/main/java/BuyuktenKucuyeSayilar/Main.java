package BuyuktenKucuyeSayilar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kac tane sayi girmek istediyinizi giriniz: ");
        int numberCount = input.nextInt();

        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < numberCount; i++){
            System.out.print("Lutfen " + (i + 1)  + ". sayiyi giriniz: ");
            int number = input.nextInt();
            numbers.add(number);
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size() - 1 - i; j++) {
                if (numbers.get(j) < numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }

        System.out.println(numbers);

    }
}
