public class LogicalOperation {



    public int checkBiggerNumber (int first, int second) {

        if (first < second) {
            return first;
        } else {
            return second;
        }

    }

    public String checkName (String first, String second) {

        if (first.equals("FastTrackIT")) {
            return "Learning test comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String verifyProvidedText(String text, int numar){
        if (text.equals ("FastTrackIT") && numar <=3){
            return text + numar;
        }else if (!text.equals("FastTrackIT") && numar >= 4){
            return numar + text;
        }else {
            return "Not found!";
        }
    }


    public String checkSnow (int numar){
        if (numar > 8 || numar == 6) {
            return ("The ammount of snow this winter was" + numar + "cm");
        } else {
            return ("The forecast snow is" + numar);
        }

    }


    public String checkTheNumber (int numar) {
        if (numar > 3 && numar != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (numar == 4) {
            return "The number is equal to 4";
        } else if (numar <3) {
            return "The number is lower than 3";
        } else {
            return "No number found";
        }
    }


    public String isNumberEven (int numar) {
        if (numar % 2 == 0){
            return "True";
        } else {
            return "False";
        }
    }


    public String isEligibleToVote (int varsta) {
        if (varsta >= 18) {
            return "True";
        } else {
            return "False";
        }
    }


    public String getTheHigherNumber (int a, int b, int c) {
        if (a > b && a > c) {
            return "Largest number is a";
        } else if (b > c) {
            return "Largest number is b";
        } else {
            return "Largest number is c";
        }
    }





    public void countAscending (int small){
        for ( int z = small; z <= 100; z++){
            System.out.println(z);
        }
    }


        public void countBackwords (int big1){
            for (int i = big1; i>= 0; i--){
                System.out.println(i);
            }
        }


        public void countCount (int small2, int big2){
            for (int a = small2; a<=10; a++){
                System.out.println(a);
            }
        }


//        public int checkBigNumber  (int maxim, int maxx) {
//
//            for (int xx= maxim; xx < maxx; xx++ )
//            if (xx > maxx) {
//                maxim = xx;
//            } else {
//                maxim = maxx;
//            }
//                return maxim;
//
//        }

        public void showNumerePare (int mic, int mare) {
            for (int b = mic; b <= 100; b += 2) {
                System.out.println(b);
            }

        }




        public void showNumereImpare (int e, int f) {
            for (int c = e; c <= 100; c +=2) {
                System.out.println(c);
            }

        }


        public void showSum (int sum) {
            for (int o = 1; o <= 100; o++) {
                sum = sum + o;
            }
            System.out.println(sum);
        }




        public float getAverageFromInterval (int start) {
            float sum = 0;
            for (int i = start; i <= 100; i++) {
                sum = i + sum;
            }
            return sum / (100 - start + 1);

        }

//        public String showStars (int 1; int 10) {
//            for (int r = 1; r<= 10; r--) {
//                for (int p = 1; p <= r; p--) {
//                    System.out.println(*);
//                }
//            }





          public void countAscendingSecond ( int xxy){

                while (xxy<= 100){
                    System.out.println(xxy);
                    xxy ++;
                }
            }


          public void countBackwordsSecond ( int xyz){

                while ( xyz >= 0){
                    System.out.println(xyz);
                    xyz --;
                }
          }

            public void countCountSecond (int small5, int big5){

            while (small5 <= 10){
                System.out.println(small5);
                small5 ++;
                }
            }



            public void showNumerePareSecond (int mic7, int mare7){
                mic7 = 2;
                while (mic7 <= mare7){
                    if (mic7%2 ==0)
                    System.out.println(mic7);
                    mic7 = mic7 +1;
                    mic7++;
                }

            }


            public void showNumereImpareSecond (int mic5, int mare5){

                while (mic5<= 99){
                    System.out.println(mic5 +=1);
                    mic5 ++;
                }
            }


            public float countNumere (int staaart, int maaaaxim) {
            int yyy = staaart;
            float sum = 0;
            int count = 0;
            while (yyy <= maaaaxim){
                if (yyy >= staaart ){
                    sum +=yyy;
                    count ++;
                }
                yyy++;
            } return sum/ count;
            }






        public float getAverageDivisiblebySeven(int startstart, int maxmax){
            int x = startstart;
            float sum = 0;
            int count = 0;
            while (x <= maxmax) {
                if (x % 7 ==0){
                    sum +=x;   // sum = sum +x;
                    count ++;
                }
                x++;
            }
            return sum /count;
        }



        public void getFibonacci (){
            int maxNumber = 20;
            int previousNumber= 0;
            int nextNumber = 1;
            int f=1;
            while (f<=maxNumber){
                System.out.println(previousNumber);
                int sum = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = sum;
                f++;
            }

            }




        public void printCozaLozaWoza(int itemsCount, int itemsPerLine) {

        for (int i = 1; i <= itemsCount; i++) {

            if (i % 3 == 0) {
                System.out.print("Coza");
            }
            if (i % 5 == 0) {
                System.out.print("Losa");
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
            }
            }
        }

    }










