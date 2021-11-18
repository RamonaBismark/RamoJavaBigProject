public class Lab5 {

    public static void main(String[] args) {

            LogicalOperation op = new LogicalOperation();

 //     Creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.

        int[] myArr = op.populateArray(100);
        op.printArray(myArr);


//
//        int[] array3 = op.populateArray(50);
//        System.out.println(op.getAverageValueFromArray(array3));
//
//
//        System.out.println(op.isValueInArray(array3, 60));
//
//     //   String [] myStrings = {"a", "b", "c", "d"};



 //      Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100.

         op.numerepareArray(1, 100);



    }



}
