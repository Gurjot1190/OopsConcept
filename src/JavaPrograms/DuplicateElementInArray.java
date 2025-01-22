package JavaPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElementInArray

{
    public static void main(String[] args) throws Exception {

        String str[] = { "Java", "C#", "C", "Java", "Phyton" };

        //Approch 1
        // boolean flag = false;
        // for (int i = 0; i <= str.length; i++) {
        //     for (int j = i + 1; j < str.length; j++) {
        //         if (str[i] == str[j]) {
        //             System.out.println("Found Duplicate Value " + str[i]);
        //             flag = true;
        //         }

        //     }
        // }
        // if(flag==false){
        //     System.out.println("Duplicate Value not found ");
        //}

        //Approch 2 using HastSet
        Set<String> set = new HashSet<String>();
        for(String readArray:str){
           // System.out.println(set.add(readArray));
            if(set.add(readArray)==false){
                 System.out.println("Found Duplicate Value "+ readArray);
            }
        }
    }
}
