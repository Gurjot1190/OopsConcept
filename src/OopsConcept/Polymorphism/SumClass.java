package OopsConcept.Polymorphism;


//Implemented Operator Overloading and Static method
public class SumClass {

    int num1 = 10;
    int num2 = 5;

    //Non Paramterized Method 
    public void sum() {
        System.out.println("Sum:" + (num1 + num2));
    }

    // Paramterized Method 
    public void sum(int x, int y) {
        System.out.println("Sum:" + (x + y));
    }

    // Return Paramterized Method 
    public int sum(int x, int y, int z) {
        int s;
        s = x+y+z;
        return s;
    }
    //Static Method
    //Can access only static variable from outside
    //No Need to create object of class, Utilize memory only once
    public static void sumStatic(int x, int y) {
        System.out.println("Sum:" + (x + y));
    }
}