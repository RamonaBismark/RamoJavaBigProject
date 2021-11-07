import javax.sound.midi.Soundbank;

 public class Lab3 {

     public static void main(String[] args) {



        LogicalOperation op = new LogicalOperation();

  // Tema 3
         int x = 10;
         int y = 13;
         System.out.println(op.checkBiggerNumber(x, y));

 // Tema 4
         String first = "FastTrackIT";
         String second = "ITisGoogle";
         System.out.println(op.checkName(first, second));

 // Tema 5
         String text = "FastTrackIT";
         int numar = 1;
         System.out.println(op.verifyProvidedText(text, numar));

  // Tema 6
         int z = 4;
         System.out.println(op.checkSnow(z));

 // Tema 7
         int p = 2;
         System.out.println(op.checkTheNumber(p));




 // Tema 9
         int n = 5;
      System.out.println(op.isNumberEven(n));


 // Tema 10
         int varsta = 18;
      System.out.println(op.isEligibleToVote(varsta));

// Tema 11
         int a = 10;
         int b = 17;
         int c = 15;
         System.out.println(op.getTheHigherNumber(a, b, c));

     }

 }








