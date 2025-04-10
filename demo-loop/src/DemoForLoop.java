public class DemoForLoop {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int x = 2;
        x = x * 2;
        x = x * 2;
        x = x * 2;
        System.out.println(x);

        int base = 2;
        int value = 2;
        for (int i = 0; i < 3; i++){
            value = value * base;
        }
        System.out.println(value);

        //FF...for (int i = 2; i < 17; i = i * 2){
            //FF...System.out.println("i=" + i);

            int num1 = 9;
            int num2 = 17;
            int max = 0;
            if (num1 > num2){
                max = num1;
            } else {
                max = num2;
            }
            System.out.println(max);

            // 0-100. find the largest odd number, which is < 90
            // for

            int largestOddNum = -1;
            for ( int i = 0; i < 101; i++){
             if (i % 2 == 1 && i < 90 ){
                largestOddNum = i;
             }
            } 
            System.out.println("The largest odd number is" + largestOddNum);

            // 0 - 20, sum up all even numbers
            // 0 + 2 + 4...+ 20
            int sumEven = 0;
            for (int i = 0; i <= 20; i++){
                if (i % 2 == 0){
                    sumEven = sumEven + i;
                }
            }
            System.out.println(sumEven);

            // 0-30, if < 20, sum up odd numbers, if >= 20, sum up even numbers
            // result

//FF            int sumOdd20 = 0;
//FF            int sumEven20 = 0;
 //FF           for (int i = 0; i < 31; i++){
//FF                if (i % 2 ==1 && i < 20){
//FF                    sumOdd20 += i;
//FF                } else if (i % 2 == 0 && i >= 20){
//FF                    sumEven20 += i;
//FF                }
//FF            }
//FF                System.out.println("Sum of even numbers less than 5: " + sumOdd20);
//FF                System.out.println("Sum of odd numbers greater than 5: " + sumEven20);

            int box = 0;
            for (int i = 0; i < 31; i++){

            }

            // Searching
            String s1 = "welcome to bootcamp.";
            // 1. Find the number of 'o' charAt()
            int numO = 0;
            for (int i = 0; i < s1.length(); i++){
                if (s1.charAt(i) == 'o'){
                    numO += 1; // numO++
                }
            }
            System.out.println(numO);

            // continue
            for (int i = 0; i < 3; i++) {
                if (i % 2 ==1){}
                System.out.println(i);
            }

            //! for + break
            // Aooroach 1: simple if
            for (int i = 0; i < 3; i++){
                if ( i < 2){
                    System.out.println(i); // 0,1
                }
            }
            // Approach 2: break
            for (int i = 0; i < 3; i++){
                if (i >=2){
                    break; // skip the rest of code, goes to i++
                }
                System.out.println(i); // 0,1
            }

            
            }
        }  
    

