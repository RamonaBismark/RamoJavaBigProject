public class Lab2 {
    public static void main(String[] args) {
        printMyName();

        int result = sum();
        System.out.println(result);

        int result1 = substract();
        System.out.println(result1);

        int result2 = multiply();
        System.out.println(result2);

        int result3 = divide();
        System.out.println(result3);

    }
// Tema 1

    public static void printMyName() {
        System.out.println("Hello \nRamona");
    }

// Tema 2

    public static int sum (){
        int result = 2 + 3;
        return result;
    }

    public static int substract (){
        int result1 = 5 - 4;
        return result1;
    }

    public static int multiply (){
        int result2 = 3 * 5;
        return result2;
    }

    public static int divide (){
        int result3 = 10 / 2;
        return result3;
    }


}








