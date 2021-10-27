import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        float fh;
        double cel;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        fh = scanner.nextFloat();

        cel = (fh - 32) / 1.8;

        System.out.println("Equivalent temperature in Celsius : " + cel );

    }


}
