package JavaPrograms;

import java.util.Scanner;

public class MaxMinValueInArray

{
    public static void main(String[] args) throws Exception {

        int a[] = { 50, 30, 40, 20, 60 };
        int max = a[0];
        int min = a[0];

        //Maximum
        // for (int i = 1; i < a.length; i++) {
        //     if (a[i]>max) {
        //         max = a[i];
        //     }
        // }
        //System.out.println(max+" is a Maximum Number in array");

        //Another Aprroach
        int max1 = 0;
        for(int i = 0;i<=a.length;i++){ 
            for(int j = i+1; j<a.length;j++ ){
              if(a[i]<=a[j]){
                 max1 = a[j];
              }
            }
        }
        System.out.println("max value is "+max1);
        

        //Minimum
        // for (int i = 1; i < a.length; i++) {
        //     if (a[i]<min) { 
        //         min = a[i];
        //     }
        // }
        // System.out.println(min+" is a Maximum Number in array");

    }
}
