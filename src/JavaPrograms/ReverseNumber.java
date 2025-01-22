package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber
 {

    //3 different ways Reverse Number
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();

        //1 Logic Using Algorithm
        int rev = 0;
        while(number!=0){ //Suppose we are taking 1234
            rev = rev*10 + number%10; // 0*10 + 1234%10 =  this will return 4
            number = number/10; // this will divide no 1234 and will return 123
        }
        System.out.println("Reverse Number is "+rev);


        //2 Logic Using String Buffer class reverse method
        StringBuffer sb = new StringBuffer(String.valueOf(number));
        StringBuffer rev1 = sb.reverse();
        System.out.println("Reverse Number is "+ rev1);

         //3 Logic Using String Builder class reverse method
         StringBuilder sb1 = new StringBuilder();
         sb1.append(number);  //append value 
         StringBuilder rev2 = sb1.reverse();
         System.out.println("Reverse Number is "+ rev2);


        





    }

}
