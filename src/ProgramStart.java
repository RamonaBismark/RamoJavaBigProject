public class ProgramStart {

    public void printMenu(){
        System.out.println("Hello!\n" +
                "Please select an option:\n" +
                "1. Sum\n" +
                "2. Substraction\n" +
                "3. Multiply\n" +
                "4. Division\n" +
                "5. Average\n" +
                "6. Remainder\n" +
                "7. Count Ascending\n" +
                "8. Count Backwords\n" +
                "9. Show numere pare\n" +
                "10. Show numere impare\n" +
                "11. Exit"
        );
    }

    public boolean runMenuOptions () {
        printMenu();
        ReadFromKeyboard read = new ReadFromKeyboard();
        Calculator calc = new Calculator();
        LogicalOperation op = new LogicalOperation();
        int option = read.getInt();
        switch (option) {
            case 1:
                doSum();
                return true;
            case 2:
                doSubstraction();
                return true;
            case  3:
                doMultiply();
                return true;
            case 4:
                doDivision();
                return true;
            case 5:
                doAverage();
                return true;
            case 6:
                doRemainder();
                return true;
//            case 7:
//                countAscending();
//                return true;
//            case 8:
//                countBackwords();
//                return true;
//            case 9:
//                showNumerePare();
//                return true;
//            case 10:
//                showNumereImpare();
//                return true;
            case 0:
                return false;
            default:
                System.out.println("Optiune incorecta, incearca din nou");
                return true;

        }
    }

    public void runProgram() {
        boolean repeatProgram;
        do {
            repeatProgram = runMenuOptions();
        } while (repeatProgram);
    }
    ReadFromKeyboard read= new ReadFromKeyboard();
    Calculator calc = new Calculator();
    LogicalOperation op = new LogicalOperation();


    private void doSum(){

            int first = read.getInt();
            int second = read.getInt();
            System.out.println("Rezultatul adunarii este: " +
                    calc.sum(first, second));
        }


    private void doSubstraction(){

        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Rezultatul scaderii este: " +
                calc.substract(first, second));
    }

    private void doMultiply(){

        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Rezultatul inmultirii este: " +
                calc.multiply(first, second));
    }

    private void doDivision(){

        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Rezultatul impartirii este: " +
                calc.divide(first, second));
    }

    private void doAverage(){

        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        System.out.println("Media este: " +
                calc.average(first, second, third));
    }

    private void doRemainder(){

        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Procentul este: " +
                calc.remainder(first, second));
    }

//    private void countAscending(){
//
//        int first = read.getInt();
//        int second = read.getInt();
//        System.out.println("Numaratoarea crescatoare este: ");
//                op.countAscending(first));
//    }
//
//    private void countBackwords(){
//
//        int first = read.getInt();
//        int second = read.getInt();
//        System.out.println("Numaratoarea descrescatoare este: ");
//                op.countBackwords(first));
//    }

//    private void showNumerePare(){
//
//        int first = read.getInt();
//        int second = read.getInt();
//        System.out.println("Numerele pare sunt: " +
//                op.showNumerePare(first,second));
//    }
//
//    private void showNumereImpare(){
//
//        int first = read.getInt();
//        int second = read.getInt();
//        System.out.println("Numerele impare sunt: " +
//                op.showNumereImpare(first,second));
//
//    }

}
