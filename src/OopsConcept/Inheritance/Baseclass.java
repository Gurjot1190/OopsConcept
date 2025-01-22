package OopsConcept.Inheritance;

//Implemented Inheritance

/* Types of Inheritance
 * 1. Single Level
 * 2. Multi-level
 * 3. Hierarchial
 * 4. Multiple Level
 * 5. Hybird Level
 */
public class Baseclass {

    public Baseclass(){
        System.out.println("Baseclass Constructor");
    }

    // if we are initializing Parameter Constructor in Base Class then we need create constructor in 
    // Derived class by adding Super();
    // public Baseclass(int a, int b){
    //     System.out.println("Baseclass Constructor "+(a+b));
    // }

    public void sanity(){
        System.out.println("Sanity Testing");
    }

    public void regression(){
        System.out.println("Regression Manual Testing");
    }

    public void smoke(){
        System.out.println("Smoke Testing");
    }
    
}
