import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OopsConcept.AccessModifiers;
import OopsConcept.ConstructorExample;
import OopsConcept.Abstraction.UseAbtraction;
import OopsConcept.Encapsulation.EncapsulationExample;
import OopsConcept.Inheritance.Derivedclass;
import OopsConcept.Inheritance.Hierarchical;
import OopsConcept.Inheritance.Multilevel;
import OopsConcept.Interface.Interface1;
import OopsConcept.Interface.Interface2;
import OopsConcept.Interface.UseInterface;
import OopsConcept.Polymorphism.Polymorphism;
import OopsConcept.Polymorphism.SumClass;

public class mainClass {
    static WebDriver driver; 
    public static void main(String[] args) throws Exception {
        
        // SumClass obj = new SumClass();
        
        // //Operator Overloading
        // obj.sum();
        // obj.sum(6, 7);
        // int add = obj.sum(6, 8, 10);
        // System.out.println("Total Sum: "+add);

        // //Calling Static Method
        // SumClass.sumStatic(9, 9);

        // //Polymosphism class mehtods
        // Polymorphism poly = new Polymorphism();
        // driver = new ChromeDriver();
        // WebElement element = poly.ClickElement("//*[@aria-label='Search']", driver);
        // element.sendKeys("Automtion Testing");
        // driver.close();

        //ConstructorExample class method
        // ConstructorExample con = new ConstructorExample();
        // ConstructorExample con1 = new ConstructorExample(4);
        // ConstructorExample con2 = new ConstructorExample(50, 5);

        // Inheritance Implementation

        // Derivedclass dd = new Derivedclass();
        // dd.sanity();
        // dd.regression();
        // dd.smoke();

        // Multilevel mm = new Multilevel();
        // mm.sanity();
        // mm.regression();
        // mm.smoke();

        // Hierarchical hie = new Hierarchical();
        // hie.sanity();
        // hie.regression();
        // hie.smoke();

        //Encapsulation
        // EncapsulationExample encap = new EncapsulationExample();
        // System.out.println(encap.getEmpSalary("HR"));

        //Abstraction
        // UseAbtraction abs = new UseAbtraction();
        // abs.abs1();
        // abs.nonabs1();

        //Interface calling
        UseInterface inter = new UseInterface();
        inter.intf1();
        inter.intf11();
        inter.intf2();
        inter.intf22();

        Interface1 inter1 = new UseInterface();
        inter1.intf1();
        inter1.intf11();

        Interface2 inter2 = new UseInterface();
        inter2.intf2();
        inter2.intf22();



    



        
        

        // driver.get("https://www.google.com.au/");
        // System.out.println("Application launched successfully");
        // driver.findElement(By.xpath("//*[@aria-label='Search']")).sendKeys("testing");;
        
      

                        
    }
}
