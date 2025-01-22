package OopsConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
    // Errors occurs at run time is know as Exception Handling
    /*
     * 2 types
     * checked - compiliation time exceptions
     * unchecked - runtime exceptions
     * 
     */

    // Main types of exceptions
    /*
     * Runtime ---> Arithmetic exception----Index Out of Bound------Null Pointer
     * Exception
     * I/) Exception ----- File Not found exception
     */
    public static void main(String[] args) {

        //Run Time Exceptions
        System.out.println("Execution started");
        int num1 = 4;
        int num2 = 0;
        int num3 = 0;
        try {
            num3 = num1 / num2;
            int arr[] = new int[2];
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
        } catch (Exception e) { // Exception is a super class of all exceptions
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        // catch(ArrayIndexOutOfBoundsException e){
        // System.out.println(e.getMessage());
        // e.printStackTrace();
        // }
        // catch(ArithmeticException e){
        // System.out.println(e.getMessage());
        // e.printStackTrace();
        // }
        finally { // This block Execute everytime even if test case fails
            System.out.println("This is finally executed");
        }
        System.out.println("output " + num3);
        System.out.println("Execution completed");

    }
    public static void main1(String[] args) throws InterruptedException, FileNotFoundException {  //Handling exception method level
        //Compilation Time Exceptions
      FileInputStream fis = new FileInputStream("null");
        Thread.sleep(3);
    }
    //OR
    public static void main2(String[] args) throws Exception {  //Handling exception method level
        //Compilation Time Exceptions
      FileInputStream fis = new FileInputStream("null");
        Thread.sleep(3);
    }
    //OR
    public static void main3(String[] args) throws Throwable {  //Handling exception method level
        //Compilation Time Exceptions
      FileInputStream fis = new FileInputStream("null");
        Thread.sleep(3);

        // difference between throw and throws
        //throws handle exception at method level compilation time
        // throw exception byself
        throw new Exception("URL is not working");
    }



}
