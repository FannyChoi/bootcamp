public class DemoArray {
    public static void main(String[] args) {
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
        // Second box
        arr[1] = 4;
        // third box
        arr[2] = -7;

        for (int i = 0; i < arr.length; i++) { // arr.length ->3
            System.out.println(arr[i]);
        }

        // Question: int array with size 5.
        // 10, 7, 4, -100, 6
        int[] size5 = new int[5];
        size5[0] = 10;
        size5[2] = 4;
        size5[3] = 6;
        size5[1] = 7;
        size5[4] = -100;

        // assign 4 double calues into the array
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

        System.out.println(str3[0] + " " + str3[1] + " " + str3[2]);

        // read

        // double array, for loop + sysoout print out valuess
        double[] amounts = new double[6];
        amounts[0] = 10.9;
        amounts[3] = 14.1;
        amounts[5] = 99.9;

        for (int i = 0; i < amounts.length; i++) {
            System.out.println(amounts[i]);
        }

        // add 1.5 to all array values
        for (int i = 0; i < amounts.length; i++) {
            amounts[i] += 1.5; // FF...i = i+1.5
            System.out.println(amounts[i]);
        }
        // for + if
        // print out those valyes > 100
        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] > 100) {
                System.out.println(amounts[i]);
            }
        }
        // int array
        // Find even number, print out "Age ="
        int[] age = new int[10];
        age[0] = 20;
        age[1] = 33;
        age[2] = 9;
        age[3] = 65;
        age[4] = 39;
        age[7] = 7;

        for (int i = 0; i < age.length; i++) {
            if (age[i] % 2 == 0) {
                System.out.println(age[i]);
            }
        }
        // array + for + if
        // find the max vlaue in the array
        int[] numbers = new int[6];
        numbers[0] = 99;
        numbers[1] = 3;
        numbers[2] = 74;
        numbers[3] = 47;
        numbers[4] = 28;
        numbers[5] = 83;

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);

        // find min. salary
        int[] salaries = new int[4];
        salaries[0] = 14000;
        salaries[1] = 19000;
        salaries[2] = 21000;
        salaries[3] = 34000;
        int minSalaries = Integer.MAX_VALUE;
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] < minSalaries) {
                minSalaries = salaries[i];
            }
        }
        System.out.println("Min.value=" + minSalaries);

        // John, Steven, Eric
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Steven";
        names[2] = "Eric";

        // find the longest name in the array
        String longestName = "";// empty Srting
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        System.out.println("The longest name=" + longestName);


        int[] nums = new int[4];
        nums[0] = 9;
        nums[1] = 8;
        nums[2] = 7;
        nums[3] = 10;
        // Print out the first even number -> (break)
        int firstEven = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                firstEven = nums[i];
                break;
            }
        }
        System.out.println("First even number is =" + firstEven);


        char[] directions = new char[5];
        // l -> left, score + 3
        // r -> right, score -2
        directions[0] = 'l';
        directions[1] = 'l';
        directions[2] = 'r';
        directions[3] = 'l';
        directions[4] = 'r';

        int score = 0;
        for (int i = 0; i < directions.length; i++) {
            if (directions[i] == 'l') {
                score = score + 3;
            } else {
                score = score - 2;
            }
        }
        System.out.println(score);

        // Swapping
        int w1 = 2;
        int w2 = 3;
        int backup = w1;
        w1 = w2;
        w2 = backup;
        System.out.println("w1=" + w1 + "w2=" + w2);

        int[] marksix = new int[6];
        marksix[0] = 5;
        marksix[1] = 20;
        marksix[2] = 2;
        marksix[3] = 43;
        marksix[4] = 39;
        marksix[5] = 47;
        for (int i = 0; i < marksix.length; i++) {
            System.out.println(marksix[i]);
        }
        // 5 20 2 43 39 47

        // counting
        char[] chs = new char[] {'o', 'p', 'a', 'p'};
        // count the number of 'p'
        int count = 0;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == 'p') {
                count++;
            }
        }
        System.out.println("The numbers of p=" + count);

        char[] chs2 = new char[] {'o', 'p', 'a', 'p', 'o'};
        // how many characters are repeated? qty > 1. //2
        int[] counts = new int[26]; // 0-25
        for (int i = 0; i < chs2.length; i++) {
            counts[chs2[i] - 'a']++;// int index = chs2[i] - 'a';
        }
        int result = 0;
        for (int i = 0; i < counts.length; i++){
            if (counts[i] > i){
                result++;
            }
        }
        System.out.println(result);

        // 0 9 1 9 2 0 9 9
        //is there any numbers appear more than 3 times? true.
        int[] abc = new int[] {0,9,1,9,2,0,9,9};
        for 

        String[] lastNames = new String[] {"Lau","Wong","Chan"};
        
    }
}

