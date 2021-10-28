public class Lab2 {
    public static void main(String[] args) {

// Tema 1
        printMyName();

// Tema 2

        int result = sum();
        System.out.println(result);

        int result1 = substract();
        System.out.println(result1);

        int result2 = multiply();
        System.out.println(result2);

        int result3 = divide();
        System.out.println(result3);

        Print print = new Print();
        print.printStars();


// Tema 3

        Print print1 = new Print();
        print.printJava();

// Tema 4

        int result4 = average();
        System.out.println(result4);

// Tema 5

        Print print2 = new Print();
        print.printMinion();

// Tema 6

        double result5 = remainder();
        System.out.println(result5);


    }
// Tema 1

    public static void printMyName() {
        System.out.println("Hello \nRamona");
    }

// Tema 2

    public static int sum() {
        int result = 2 + 3;
        return result;
    }

    public static int substract() {
        int result1 = 5 - 4;
        return result1;
    }

    public static int multiply() {
        int result2 = 3 * 5;
        return result2;
    }

    public static int divide() {
        int result3 = 10 / 2;
        return result3;
    }

// Tema 4

    public static int average() {
        int result4 = ((2 + 3 + 4) / 3);
        return result4;
    }

// Tema 6

    public static double remainder() {
        double result5 = (10 % 3);
        return result5;
    }



}









