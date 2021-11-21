import com.sun.source.tree.BreakTree;

import java.util.ArrayList;

public class LogicalOperation {



    public int checkBiggerNumber(int first, int second) {

        if (first < second) {
            return first;
        } else {
            return second;
        }

    }

    public String checkName(String first, String second) {

        if (first.equals("FastTrackIT")) {
            return "Learning test comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String verifyProvidedText(String text, int numar) {
        if (text.equals("FastTrackIT") && numar <= 3) {
            return text + numar;
        } else if (!text.equals("FastTrackIT") && numar >= 4) {
            return numar + text;
        } else {
            return "Not found!";
        }
    }


    public String checkSnow(int numar) {
        if (numar > 8 || numar == 6) {
            return ("The ammount of snow this winter was" + numar + "cm");
        } else {
            return ("The forecast snow is" + numar);
        }

    }


    public String checkTheNumber(int numar) {
        if (numar > 3 && numar != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (numar == 4) {
            return "The number is equal to 4";
        } else if (numar < 3) {
            return "The number is lower than 3";
        } else {
            return "No number found";
        }
    }


    public String isNumberEven(int numar) {
        if (numar % 2 == 0) {
            return "True";
        } else {
            return "False";
        }
    }


    public String isEligibleToVote(int varsta) {
        if (varsta >= 18) {
            return "True";
        } else {
            return "False";
        }
    }


    public String getTheHigherNumber(int a, int b, int c) {
        if (a > b && a > c) {
            return "Largest number is a";
        } else if (b > c) {
            return "Largest number is b";
        } else {
            return "Largest number is c";
        }
    }


    public void countAscending(int small) {
        for (int z = small; z <= 100; z++) {
            System.out.println(z);
        }
    }


    public void countBackwords(int big1) {
        for (int i = big1; i >= -100; i--) {
            System.out.println(i);
        }
    }


    public void countCount(int small2, int big2) {
        for (int a = small2; a <= 10; a++) {
            System.out.println(a);
        }
    }


    public void checkBigNumber(int maxim, int maxx) {
        if (maxim < maxx) {
            for (int xx = maxim; xx <= maxx; xx++) {
                System.out.println(xx);
            }
        } else if (maxx > maxim) {
            for (int xx = maxx; xx <= maxim; xx++) {
                System.out.println(xx);
            }
        } else {
            System.out.println("Numbers are equal");
        }
    }


    public void showNumerePare(int mic, int mare) {
        for (int b = mic; b <= 100; b += 2) {
            System.out.println(b);
        }

    }


    public void showNumereImpare(int e, int f) {
        for (int c = e; c <= 100; c += 2) {
            System.out.println(c);
        }

    }


    public int showSum(int sum) {
        for (int o = 1; o <= 100; o++) {
            sum = sum + o;
        }
        return sum;
    }


    public float getAverageFromInterval(int start) {
        float sum = 0;
        for (int i = start; i <= 100; i++) {
            sum = i + sum;
        }
        return sum / (100 - start + 1);

    }


    public void showStars() {

        for (int r = 7; r >= 1; r--) {
            String text = "";
            for (int p = r; p >= 1; p--) {
                text = text + "*";
            }
            System.out.println(text);
        }
    }


    public void countAscendingSecond(int xxy) {

        while (xxy <= 100) {
            System.out.println(xxy);
            xxy++;
        }
    }


    public void countBackwordsSecond(int xyz) {

        while (xyz >= -100) {
            System.out.println(xyz);
            xyz--;
        }
    }

    public void countCountSecond(int small5, int big5) {

        while (small5 <= big5) {
            System.out.println(small5);
            small5++;
        }
    }


    public void countBetweenWhile(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            while (firstNumber <= secondNumber) {
                System.out.println(firstNumber);
                firstNumber++;
            }
        } else if (secondNumber < firstNumber) {
            while (secondNumber <= firstNumber) {
                System.out.println(firstNumber);
                firstNumber++;
            }
        } else {
            System.out.println("The numbers are equal");
        }
    }


    public void showNumerePareSecond(int mic7, int mare7) {
        mic7 = 2;
        while (mic7 <= mare7) {
            if (mic7 % 2 == 0)
                System.out.println(mic7);
            mic7 = mic7 + 1;
            mic7++;
        }

    }


    public void showNumereImpareSecond(int mic5, int mare5) {

        while (mic5 <= 99) {
            System.out.println(mic5 += 1);
            mic5++;
        }
    }


    public void countNumere(int staaart, int maaaaxim) {
        int yyy = staaart;
        double sum = 0;
        int count = 0;
        while (staaart <= maaaaxim) {
            sum += staaart;
            staaart++;
            count++;
        }
        System.out.println(sum);
        double medie = sum / count;
        System.out.println("The average of the numbers is:" + medie);
    }


    public float getAverageDivisiblebySeven(int startstart, int maxmax) {
        float sum = 0F;
        float count = 0F;
        while (startstart <= maxmax) {
            if (startstart % 7 == 0) {
                sum += startstart;   // sum = sum +x;
                count++;
            }
            startstart++;
        }
        float mediaaa = sum / count;
        return mediaaa;
    }


    public void getFibonacci() {
        int maxNumber = 20;
        int previousNumber = 0;
        int nextNumber = 1;
        int f = 1;
        while (f <= maxNumber) {
            System.out.println(previousNumber);
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            f++;
        }

    }


    public void printCozaLozaWoza() {

        int iii = 1;

        while (iii <= 110) {

            if (iii % 3 == 0 && iii % 5 == 0 && iii % 7 == 0) {
                System.out.print("CozaLozaWoza");
            } else if (iii % 3 == 0 && iii % 5 == 0) {
                System.out.print("CozaLoza");
            } else if (iii % 7 == 0) {
                System.out.print("Woza");
            } else if (iii % 5 == 0) {
                System.out.println("Loza");
            } else if (iii % 3 == 0) {
                System.out.println("Coza");
            } else {
                System.out.println(iii + "");
            }
            if (iii % 11 == 0) {
                System.out.println();
            }
            iii++;
        }
    }


    public int[] populateArray(int max) {
        int[] myArr = new int[max];
        for (int i = 0; i < max; i++) {
            myArr[i] = i + 1;
        }
        return myArr;
    }


    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public void numerepareArray(int[] array) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.println(array[i]);
        }
    }


    public float getAverageValueFromArray ( int[] array3){
        float sum = 0;
        for (int i = 0; i < array3.length; i++) {
            sum = sum + array3[i];
        }
        return (sum / array3.length);
    }



//    public boolean isValueInArray(int[] array, int value) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == value) {
//            }
//            return true;
//        }
//        return false;
//    }



    public boolean searchValueInArray (String[] array, String value) {
      for (int i= 0; i < array.length; i++){
          if (array[i] == value) {
              return true;
          }
      } return false;

    }


        public String showNumber (int [] arrayyy, int nrNou) {
            for (int i = 0; i < arrayyy.length; i++) {
                if (arrayyy[i] == nrNou) {
                    String strI = String.valueOf(i);
                    return strI;
                }

            }
            return "No number found";
        }



        public ArrayList<Integer> getWithoutNumber (ArrayList<Integer> numere, int targetValue) {
           ArrayList<Integer> sir = numere;
            for (int i = 0; i < sir.size(); i++) {
                if (sir.get(i) == targetValue) {
                    sir.remove(i);
                }
            }
            return sir;
        }







            public int getSecondSmallest ( int[] a, int total){
                int temp;
                for (int i = 0; i < total; i++) {
                    for (int j = i + 1; j < total; j++) {
                        if (a[i] > a[j]) {
                            temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                }
                return a[1];
            }


            public ArrayList<Integer> valoareaValoarea (ArrayList<Integer> sirCuValoriNoi, ArrayList<Integer> sirFaraValori){
            for (int i = 0; i < sirCuValoriNoi.size(); i++){
                sirFaraValori.add(sirCuValoriNoi.get(i));
            } return sirCuValoriNoi;
            }


        }





