import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_06_01_CtoFConverter {
    public static void main(String[] args) {
        boolean blockVal = true;
        boolean newGame = false;
        String GameResp = "";
        String TrashBag= "";
        double celTemp = 0;
        double fahTemp = 0;
        int boilPoint = 212;
        int freezPoint = 32;
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner in = new Scanner(System.in);
        do {
            do {
                System.out.print("What is the temperature in Celsius? ");
                if (in.hasNextDouble()) {
                    celTemp = in.nextDouble();
                    in.nextLine();
                    blockVal = true;
                }
                else {
                    System.out.println("Invalid input. Please try again.");
                    TrashBag = in.nextLine();
                    blockVal = false;
                }
            }
            while (!blockVal);
            fahTemp = (celTemp * 1.8) + 32;
            if (fahTemp >= boilPoint) {
                System.out.println("The temperature in Fahrenheit is " + df.format(fahTemp) + ". That is boiling.");
            }
            else if (fahTemp <= freezPoint) {
                System.out.println("The temperature in Fahrenheit is " + df.format(fahTemp) + ". That is freezing.");
            }
            else {
                System.out.println("The temperature in Fahrenheit is " + df.format(fahTemp) + ".");
            }
            System.out.println("Do you want to convert another number? [Y/N]");
            do {
                GameResp = in.nextLine();
                if (GameResp.equalsIgnoreCase("y")) {
                    newGame = true;
                    blockVal = true;
                }
                else if (GameResp.equalsIgnoreCase("n")) {
                    System.out.println("Thanks for your time!");
                    System.exit(0);
                }
                else {
                    System.out.println("Invalid Entry. Please Select [Y/N]");
                    blockVal = false;
                }
            }
            while (!blockVal);
        }
        while (newGame =  true);
    }
}