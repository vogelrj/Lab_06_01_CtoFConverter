import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_06_01_CtoFConverter {
    public static void main(String[] args) {
        String trash = "";
        double celTemp = 0;
        double fahTemp = 0;
        int boilPoint = 212;
        int freezPoint = 32;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner in = new Scanner(System.in);
        System.out.print("What is the temperature in Celsius? ");
        if (in.hasNextDouble()) {
            celTemp = in.nextDouble();
            fahTemp = (celTemp * 1.8) + 32;
            if (fahTemp >= boilPoint) {
                System.out.println("The temperature in Fahrenheit is " + df.format(fahTemp) + ". That is boiling.");
            } else if (fahTemp <= freezPoint) {
                System.out.println("The temperature in Fahrenheit is " + df.format(fahTemp) + ". That is freezing.");
            } else {
                System.out.println("The temperature in Fahrenheit is " + df.format(fahTemp) + ".");
            }
        }
        else {
            System.out.println("Invalid Entry. Please try again");
        }
    }
}
