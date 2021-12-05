import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReadFromKeyboard {
    private Object Integer;


    // Creati o metoda care sa returneze un numar de la tastatura.

    public int getInt() {
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print(" Introdu un numar: ");
                return scan.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Valoare incorecta");
            }
        } while (true);
    }


    // Duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode, care sa citeasca si sa returneze si alte tipuri de numere;

    public String getString() {
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print(" Introdu un cuvant: ");
                return scan.next();
            } catch (InputMismatchException error) {
                System.out.println("Valoare incorecta");
            }
        } while (true);
    }


    public float getFloat() {
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print(" Introdu un numar: ");
                return scan.nextFloat();
            } catch (InputMismatchException error) {
                System.out.println("Valoare incorecta");
            }
        } while (true);
    }


    public byte getByte() {
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print(" Introdu un numar: ");
                return scan.nextByte();
            } catch (InputMismatchException error) {
                System.out.println("Valoare incorecta");
            }
        } while (true);
    }


    public double getDouble() {
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print(" Introdu un numar: ");
                return scan.nextDouble();
            } catch (InputMismatchException error) {
                System.out.println("Valoare incorecta");
            }
        } while (true);
    }


    // creati o metoda care sa returneze un array de numere populat de la tastatura. Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

        public int[] getArray (int size) {
        Scanner scan = new Scanner(System.in);
        int [] myArr = new int[size];
            System.out.println("Introdu valorile din array.");
            for (int i = 0; i < myArr.length; i++) {
                myArr[i] = getInt();
            }
            return myArr;
        }

    public void printArray(int[] array) {}


  //   creati o metoda care sa returneze o lista de numere populate de la tastatura. Metoda nu va primi parametru lungimea.

    public List<Integer> getMyList (List<Integer> lista) {
        Scanner scan = new Scanner(System.in);
        int myList<Integer> = new int[];
        System.out.println("Introdu valorile din lista.");
        for (int i = 0; i < myList.size; i++) {

        }
        return myArr;
    }



 //     creati o metoda  'wait()'. Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int. In interiorul ei, tratati metoda Thread.sleep(),
    //     astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte. Ex: wait(5) -> asteapta 5 secunde.


    public int getSecunde(int i) throws InterruptedException {
        int count = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print(" Introdu un numar: ");
                return scan.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Valoare incorecta");
                count++;
            }
            if (count == 5) {
            sleep(5);
                count = 0;
            }
        } while (true);
    }


    private void sleep (int seconds) {
        System.out.print("Sleeping for ");
        do {
            System.out.println(seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seconds --;
        } while (seconds > 0);
    }








}




