package OopsConcept.Interface;

public interface Interface1 {
     
    //Interface can extends another interface class

    //final , class cannot be extended, variable value cannot be changed, method cannot be overide

    int a1 =5; //By default variable is final, public, static

    public void intf1();

    public void intf11();

    //From Java 8 onwards we can define static method in interface
    public static void methodint(){
     System.out.println("Static method in interface1");
    }

}
