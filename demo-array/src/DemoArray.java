public class DemoArray {
    public static void main(String[] args)  {
        // assign int value 3 into int variable
        int x1 = 3;
        int x2 = 4;
        int x3 = -7;

        // array []
        // right hand side -> creating an array with size 3.
        // left hand side -> assign int array object to int array type (variable)
        int[] arr = new int[3]; // now we got 3 boxes able to store 3 int values.

        // write 
        // First box (index)
        arr[0] = 3;
        //Second box
        arr[1] = 4;
        // third box
        arr[2] = -7;

        // Question: int array with size 5.
        // 10, 7, 4, -100, 6
        int[] size5 = new int[5];
        size5[0] = 10;
        size5[2] = 4;
        size5[3] = 6;
        size5[1] = 7;
        size5[4] = -100;

        //assign 4 double calues into the array
        double[] arr3 = new double[4];
        arr3[0] = 10.3;

        System.out.println(size5[0]);
        System.out.println(arr3[3]);


        // string array
        // size 3, with 3 string value
        String[] str3 = new String[3];
        str3[0] = "hello";
        str3[1] = "world";
        str3[2] = "everyone!";

        System.out.println(str3[0]+" "+str3[1]+" "+str3[2]);

        // read
    }
}
