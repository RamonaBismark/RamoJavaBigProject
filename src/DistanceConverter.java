import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {

        float inch;
        double metri;
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter distance in inch");
        inch = scanner1.nextFloat();

        metri = (inch * 0.0254);

        System.out.println("Equivalent distance in metri: " + metri) ;

    }



}
