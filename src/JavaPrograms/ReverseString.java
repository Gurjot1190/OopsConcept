package JavaPrograms;

import java.util.Scanner;

public class ReverseString
 {

    //3 different ways Reverse String
    public static void main(String[] args) throws Exception{

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number");
        // int number = sc.nextInt();
        String str = "ABCD";
         String rev = "";

        //1 Logic Using + String Concatenation Operator
        // int len = str.length();  // total 4 character
        // for(int i=len-1;i>=0;i--){
        //     rev = rev + str.charAt(i);
        // }
        // System.out.println("Reverse String is "+ rev);

         //2 Logic Using Char Array
        //  char a[] = str.toCharArray();
        //  int len = a.length; //4

        //  for(int i=len-1;i>=0;i--){
        //     rev = rev+ a[i];
        // }
        // System.out.println("Reverse String is "+ rev);


        // //2 Logic Using String Buffer class reverse method
        // StringBuffer sb = new StringBuffer(str);
        // StringBuffer rev1 = sb.reverse();
        // System.out.println("Reverse String is "+ rev1);


        //Print Hello world in clockwise direction as DHELLO WORL
        String strHello = "HELLO WORLD";
        int len = strHello.length();
        char[] result = new char[len];
        result[0] =  strHello.charAt(len-1); // Setting D value
         for(int i=1;i<len;i++){
            result[i] = strHello.charAt(i-1);
         }
      
         System.out.println(new String(result));

    }

}
