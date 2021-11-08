public class Lab4 {

    public static void main(String[] args) {

        LogicalOperation op = new LogicalOperation();

        int small = 3;
        int big = 1200;
        op.countBackwords(3, 1200);


        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
        System.out.println(sum / 100f);


    }

}
