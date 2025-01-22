package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber
// Natural number >1
// Which has only 2 factors 1 an itself
// 19 => 1 and 19 => Prime Number
// 28 => 1,2,4,14,28 => Not a Prime Number

// Divide by 1 or itself
{
    public static void main(String[] args) throws Exception {

        int num = 28;
        int count = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime Number");
            }
        }

    }
}
