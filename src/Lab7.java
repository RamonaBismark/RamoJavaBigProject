import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        ReadFromKeyboard read = new ReadFromKeyboard();

        int x = read.getInt();
        System.out.println(" Numarul este: " + x);


        String z = read.getString();
        System.out.println("Stringul citit este " + z);


        float a = read.getFloat();
        System.out.println("Floatul citit este " + a);


        byte b = read.getByte();
        System.out.println("Byteul citit este " + b);


        double d = read.getDouble();
        System.out.println("Doubleul este " + d);



        int[] array = read.getArray(3);
        read.printArray(array);

        int o = read.getSecunde(5);
        System.out.println("Asteapta");









    }




    }




