package OopsConcept.Inheritance;
//Implemented Inheritance and Overiding

//ChildClass extends Parent Class 
             //Derived Class extends Base Class
             //Subclass extends SuperClass      
             
             //This is Single Level Inheritance
public class Derivedclass extends Baseclass{

     public Derivedclass(){
        System.out.println("Derived Class Constructor");
    }
    
    //Created constrcutor as Baseclass as it.
    //Created Super Constructor
    // public Derivedclass(int a, int b){
    //     super(a, b);
    //     System.out.println("Derived Class Constructor"+(a+b));
    //  }

    // Implemented Overiding method or Runtime Polymorphism or late binding or dynamic binding
    public void regression(){
        System.out.println("Regression Automation Testing");
    }
    
}
