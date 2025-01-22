package OopsConcept.Abstraction;

abstract class AbstractionExample {

    //We can create the constructor of the abstract class
    public AbstractionExample(){
        System.out.println("Abstract Contructor");
    }

    //Abstraction is used to show relevant information to relevant user and to hide the implementation.
    //abstract method declared without body
    //Abstaction can be achieved from 0 to 100%
    //We cannot create object of Abstract Class
    //In Case to stop creating object of class use abstract class

    abstract void abs1();

   // abstract void linkAadhaarCard();  //RBL Scenarios of Abstraction

    abstract void abs2();

    abstract void abs3();

    //Non Abstract Method
    public void nonabs1(){
        System.out.println("Non Abstract Method");
    }
    public void nonabs2(){
        System.out.println("Non Abstract Method");
    }

}
