import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab5 {

    public static void main(String[] args) {

            LogicalOperation op = new LogicalOperation();

 //     Creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.

        int[] myArr = op.populateArray(100);
//        op.printArray(myArr);




 //      Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100.

//        int [] myNewArray= op.populateArray(100);
//        op.numerepareArray(myNewArray);




//     Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori. Metoda sa calculeze si sa returneze media numerelor din array.
        int[] array3 = op.populateArray(50);
//        System.out.println(op.getAverageValueFromArray(array3));


//      Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.
//      Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.

//        int[] array4 = op.populateArray(50);
//        System.out.println(op.isValueInArray(array4, 60));


        String [] array = {"A", "B", "C", "D"};
 //       System.out.println(op.searchValueInArray(array, "E"));




 //    Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
 //    Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.

        int[] abc = {57, 11, 21, 32, 44, 45};
        System.out.println(op.showNumber(abc,11));




 //    Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
 //    Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
//


        ArrayList<Integer> alteNumere = new ArrayList();
        alteNumere.add(1);
        alteNumere.add(2);
        alteNumere.add(3);
        alteNumere.add(4);
        alteNumere.add(5);
        System.out.println("Inainte de remove" + alteNumere);
        op.getWithoutNumber(alteNumere, 5);
        System.out.println("Dupa remove" + alteNumere);


 //   Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.

        int [] myArrrrr = {5, 7, 9, 20, 25, 39, 43};
        System.out.println("Second smallest is: " + op.getSecondSmallest(myArrrrr, 7));




 // Creati o metoda care sa primeasca doi parametri: un array populat cu valori, si un array gol.
        // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.

        ArrayList<Integer> sirCuValoriNoi = new ArrayList<>();
        sirCuValoriNoi.add(1);
        sirCuValoriNoi.add(2);
        sirCuValoriNoi.add(3);
        sirCuValoriNoi.add(4);
        sirCuValoriNoi.add(5);
        sirCuValoriNoi.add(6);

        ArrayList<Integer> sirFaraValori = new ArrayList<>();
        System.out.println("Sir Fara Valori" + sirFaraValori);
        op.valoareaValoarea(sirCuValoriNoi, sirFaraValori);
        System.out.println("Sir dupa ce a primit valorile" + sirFaraValori);




    }



}
