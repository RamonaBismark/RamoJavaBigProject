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


    public String checkTheNumber ( int numar) {
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

}


