package OopsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Implemented Constructor, Constructor Operator Overloading 

public class ConstructorExample {

    public int a = 20;
    public int b = 20;
   
    // Constructor is a special type of method having same name as the class name
    // with no return type
    // and automatically called once the object of this class is created
    // 3 Types
    // Default Construtor - If constructor of the class is not created, it is known
    // as Default Constructor

    // No Argument Construtor
    public ConstructorExample() {
        System.out.println("No Argument Constructor");

    }

    // Parameterized Constructor
    public ConstructorExample(int a) {
        System.out.println("Paramterized Constructor having 1 Param " + a);
    }

    public ConstructorExample(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Paramterized Constructor having 2 Param " + (a + b));
    }

}