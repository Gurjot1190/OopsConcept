package JavaPrograms;

import java.util.Scanner;

public class FibonacciSeries

// 0 1 1 2 3 5 8 13 21
{
    //Git
    public static void main(String[] args) throws Exception {

        int n1 = 0, n2 = 1, sum = 0;

        System.out.print(n1+" "+n2);

        for (int i = 2; i < 10; i++) {
            sum = n1 + n2; //2
            System.out.print(" " +sum);
            n1 = n2; //2
            n2 = sum; // 2
        }

    }
}
