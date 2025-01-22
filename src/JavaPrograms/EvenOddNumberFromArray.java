package JavaPrograms;

import java.util.Scanner;

public class EvenOddNumberFromArray

{
    public static void main(String[] args) throws Exception {

        int a[] = {1,2,3,4,5,6,7,8};
        System.out.println("Even Number in Array");
        for(int i = 0; i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]+" is even Number");
            }
        }

        System.out.println("Odd Number in Array");
        for(int i = 0; i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]+" is odd Number");
            }
        }

        //Logic 2 : Using Enchanced for loop
        // for(int num:a){
        //     if(num%2==0){
        //         System.out.println(num+" is even Number");
        //     }
        // }


    }
}
