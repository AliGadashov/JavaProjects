package sicakligaGoreEtkinlikOnerme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temperature;
        String event;

        System.out.print("Derece: ");
        temperature = scan.nextInt();


        if(temperature <= 5 ){
            event = "Kayak yapa bilirsiniz.";
        } else if (temperature <= 15) {
            event = "Tiyatroya gidebilirsiniz.";
        } else if (temperature <= 25) {
            event = "Manqal yapa bilirsiniz.";
        }else {
            event = "Yuzme yapabilirsiniz.";
        }

        System.out.println(event);
    }
}
