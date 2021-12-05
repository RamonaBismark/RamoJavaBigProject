public class Calculator {

    public double sum(int first, double second) {
        double result = first + second;
        return result;

    }

    public double sum(float first, double second) {
        double result = first + second;
        return result;

    }

    public double sum(int first, double second, int third) {
        double result = first + second + third;
        return result;

    }


    public double sum(int first, int second) {
        double result = first + second;
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

    public static int average(int first, int second, int third) {
        int result4 = ((first + second + third)/3);
        return result4;
    }


    public static double remainder(int first, int second) {
        double result5 = (first % second);
        return result5;
    }


}





