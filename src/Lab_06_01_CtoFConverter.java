import java.util.Scanner;

public class Lab_06_01_CtoFConverter {
    public static void main(String[] args) {
        double celTemp = 0;
        double fahTemp = 0;
        int boilPoint = 212;
        int freezPoint = 32;

        Scanner in = new Scanner(System.in);
        System.out.print("What is the temperature in Celsius? ");
        celTemp = in.nextDouble();
        fahTemp = (celTemp * 1.8) + 32;
        if (fahTemp >= boilPoint)
        {
            System.out.println("The temperature in Fahrenheit is " + fahTemp + ". That is boiling.");
        }

    }
}
