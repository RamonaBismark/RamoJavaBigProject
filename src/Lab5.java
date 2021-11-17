public class Lab5 {

    public static void main(String[] args) {

            LogicalOperation op = new LogicalOperation();

        int[] myArr = op.populateArray(68);
        op.printArray(myArr);

        int[] array3 = op.populateArray(50);
        System.out.println(op.getAverageValueFromArray(array3));


        System.out.println(op.isValueInArray(array3, 60));

     //   String [] myStrings = {"a", "b", "c", "d"};



    }



}
