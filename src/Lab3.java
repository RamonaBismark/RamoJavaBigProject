import javax.sound.midi.Soundbank;

 public class Lab3 {

     public static void main(String[] args) {



        LogicalOperation op = new LogicalOperation();
         int x = 10;
         int y = 13;
         System.out.println(op.checkBiggerNumber(x, y));


         String first = "FastTrackIT";
         String second = "ITisGoogle";
         System.out.println(op.checkName(first, second));

         String text = "FastTrackIT";
         int numar = 1;
         System.out.println(op.verifyProvidedText(text, numar));


         int z = 4;
         System.out.println(op.checkSnow(z));


         int p = 4;
         System.out.println(op.checkTheNumber(p));


     }

 }








