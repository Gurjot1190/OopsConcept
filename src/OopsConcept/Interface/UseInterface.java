package OopsConcept.Interface;

public class UseInterface implements Interface1, Interface2{

    @Override
    public void intf1() {
        System.out.println("Interface 1");
       
    }

    @Override
    public void intf11() {
        System.out.println("Interface 11");

    }

    @Override
    public void intf2() {
        System.out.println("Interface 2");
       
    }

    @Override
    public void intf22() {
        System.out.println("Interface 22");
     
    }

}
