public class Lab4 {

    public static void main(String[] args) {

        LogicalOperation op = new LogicalOperation();

        // Creati o metoda care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
        // pornind de la numarul primit ca si parametru.

        int small = 1;
        op.countAscending(1);


        // Creati o metoda care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la -100,
        // pornind de la numarul primit ca si parametru.

        int big1 = 100;
        op.countBackwords(100);


        // Creati o metoda care sa primeasca doi parametri de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
        // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

        int small2 = 2;
        int big2 = 10;
        op.countCount (2, 10);

        // Creati o metoda care sa primeasca doi parametri de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
        // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
        // daca x  este mai mare decat y, atunci numaratoarea sa fie de la y la x).

//        int max =27;
//        int maxx =59;
//        System.out.println(op.checkBigNumber(27, 59));


        // Creati o metoda care sa afiseze toate numerele pare de la 1 la 100.

        int mic = 2;
        int mare = 100;
        op.showNumerePare (2, 100);



        // Creati o metoda care sa afiseze toate numerele impare de la 1 la 100.

        int e = 1;
        int f = 100;
        op.showNumereImpare (1, 100);


        // Creati o metoda care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
        // iar la final sa returneze rezultatul.


        int sum = 0;
        op.showSum (0);



        // Creati o metoda care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
        // si sa calculeze media numerelor. La final, metoda sa returneze media.


        int start = 1;
        System.out.println(op.getAverageFromInterval(1));


   //     System.out.println(op.showStars);



        // Creati o metoda care sa primeasca un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.


        int xxy = 1;
        op.countAscendingSecond(1);


        // Creati o metoda care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.


        int xyz = 100;
        op.countBackwordsSecond(100);


     //    Creati o metoda care sa primeasca doi parametri de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
        //    (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

        int small5 = 2;
        int big5 = 10;
        op.countCountSecond(2, 10);


     // Creati o metoda care sa primeasca doi parametri de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
        // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).




        //    Creati o metoda care sa afiseze toate numerele pare de la 1 la 100.

        int mic7 = 0;
        int mare7 = 100;
        op.showNumerePareSecond (0, 100);


        // Creati o metoda care sa afiseze toate numerele impare de la 1 la 100.

        int mic5 = 0;
        int mare5 = 100;
        op.showNumereImpareSecond(0, 100);



      //  Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.


        System.out.println(op.countNumere (111, 8899));


        // Creati o metoda care sa primeasca doi parametri de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval.


       System.out.println(op.getAverageDivisiblebySeven(1, 100));


        // Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

        op.getFibonacci();

        op.printCozaLozaWoza(1,110);



        }





    }


