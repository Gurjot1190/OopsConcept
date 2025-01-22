package JavaPrograms;

import java.util.Scanner;

public class FindLargestThreeNumbers

{

    // Largest Number
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Enter Third Number");
        int c = sc.nextInt();

        // Logic 1 using else-if
        // if(a>b && a>c){
        // System.out.println(a+" is largest Number");
        // }
        // else if(b>a && b>c){
        // System.out.println(b+" is largest Number");
        // }
        // else{
        // System.out.println(c+" is largest Number");

        // Logic 2 using Ternary Operator a>b?a:b
        int largest = a > b ? a : b; // largest of a and b
        largest = c > largest ? c : largest; // largest of c and largest
        System.out.println(largest+" is largest Number");
        // Single Line code
        //largest = c > (a > b ? a : b) ? c:(a > b ? a : b);

    }
}
