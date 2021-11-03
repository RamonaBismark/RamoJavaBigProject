public class Lab2 {
    public static void main(String[] args) {

// Tema 1
        printMyName();

// Tema 2

        int result = sum(4, 5);
        System.out.println(result);

        int result1 = substract(5, 4);
        System.out.println(result1);

        int result2 = multiply(3, 5);
        System.out.println(result2);

        int result3 = divide(10, 2);
        System.out.println(result3);

        Print print = new Print();
        print.printStars();


// Tema 3

        Print print1 = new Print();
        print.printJava();

// Tema 4

        int result4 = average(2, 3, 4);
        System.out.println(result4);

// Tema 5

        Print print2 = new Print();
        print.printMinion();

// Tema 6

        double result5 = remainder(10, 3);
        System.out.println(result5);


    }
// Tema 1

    public static void printMyName() {
        System.out.println("Hello \nRamona");
    }

// Tema 2

    public static int sum(int first, int second) {
        int result = first + second;
        return result;
    }

    public static int substract(int first, int second) {
        int result1 = first - second;
        return result1;
    }

    public static int multiply(int first, int second) {
        int result2 = first * second ;
        return result2;
    }

    public static int divide(int first, int second) {
        int result3 = first / second;
        return result3;
    }

// Tema 4

    public static int average(int first, int second, int third) {
        int result4 = ((first + second + third)/3);
        return result4;
    }

// Tema 6

    public static double remainder(int first, int second) {
        double result5 = (first % second);
        return result5;
    }



}









