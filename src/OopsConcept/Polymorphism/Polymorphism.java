package OopsConcept.Polymorphism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Implemented Operator Overloading and Static method
public class Polymorphism {

    //Overloading 
    public void login(){
        //admin
        //admin
    }
    public void login(String username, String password){
        //Username
        //Password
    }
    public static void login(String username, String password, String Capcha){
        //Username
        //Password
        //Capcha
    }
    public void ClickElement(WebElement ele){
        ele.sendKeys("Testing Automation");;
    }
    public WebElement ClickElement(String ele, WebDriver driver){
        driver.get("https://www.google.com.au/");
        WebElement e = driver.findElement(By.xpath(ele));
        return e;
    }


}