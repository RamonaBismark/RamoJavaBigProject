import java.util.ArrayList;
import java.util.List;

public class Lab6 {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        LogicalOperation op = new LogicalOperation();
        List<Integer> mySecondList = op.getPopulatedList(80);
        List<Integer> myThirdList = op.getPopulatedList(20);


        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
//
//        System.out.println(myList);
//        Integer x = 3;
//        myList.remove(x);      // SAU     myList.remove(Integer.valueOf(3));
//        System.out.println(myList);
//        myList.clear();
//        System.out.println(myList);
//        myList.set(2,3);
//        myList.add(2,3);
//
//


        op.printTheList(myThirdList);

        System.out.println(op.numarPrimitLaFinal(myList,6));

        op.printListFromNumber (mySecondList, 50);


        List<String> listaMeaDeString = new ArrayList<>();
        listaMeaDeString.add("Buna");
        listaMeaDeString.add("Salut");
        listaMeaDeString.add("Hello");
        listaMeaDeString.add("Pa");

        System.out.println(op.printMyStringList(listaMeaDeString, 3, "Bye"));

        System.out.println(op.doiParametri(listaMeaDeString, "Ciao"));

        op.valoriSiPozitii(myList);

        System.out.println(op.celMaiMareNumar(myList));



















    }
}
