package OopsConcept.Interface;

public interface Interface2 {

    int a2 =5; //By default variable is final, public, static

    public void intf2();

    public void intf22();

    //From Java 8 onwards we can define static method in interface
    public static void methodint2(){
     System.out.println("Static method in interface2");
    }
}
