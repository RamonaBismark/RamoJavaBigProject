import java.util.Arrays;

public class Lab5 {

    public static void main(String[] args) {

            LogicalOperation op = new LogicalOperation();

 //     Creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.

        int[] myArr = op.populateArray(100);
        op.printArray(myArr);




 //      Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100.

        int [] myNewArray= op.populateArray(100);
        op.numerepareArray(myNewArray);




//     Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori. Metoda sa calculeze si sa returneze media numerelor din array.
        int[] array3 = op.populateArray(50);
        System.out.println(op.getAverageValueFromArray(array3));


//      Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.
//      Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.

        int[] array4 = op.populateArray(50);
        System.out.println(op.isValueInArray(array4, 60));

//
//        String [] array = {"A", "B", "C", "D"};
//        op.searchValueInArray();




 //    Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
 //    Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.

        int[] abc = {57, 11, 21, 32, 44, 45};
        System.out.println(Arrays.toString(abc));
        op.showNumber(abc,11);






 //   Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.

        int [] myArrrrr = {5, 7, 9, 20, 25, 39, 43};
        System.out.println("Second smallest is: " + op.getSecondSmallest(myArrrrr, 7));


    }



}
