package OopsConcept.CollectionFramework;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ArrayListExample {
    // Due to Limitation of Array Data type we use Array List
    // In Array List we can store multiple Data Type For example: Int, String
    // Array List Size vary and can be resize and remove
    // Array List can access multiple build in functions(Add(), Get(), Clear(),
    // clone(),Contains(), Replace(), size(), Sort() )
    // Array List is a Class and List is an Interface
    // In Array List we can store Duplicate value but in Hastset we cannot

    public static void main(String[] args) throws Exception {
        RawListMethod();
        StringListTypeMethod();
    }

    // In this list we can store any Data type values(Int, String) as specific data type is not defined
    public static void RawListMethod() {
        @SuppressWarnings("rawtypes")
        ArrayList rawList = new ArrayList();
        rawList.add("john");
        rawList.add("Rahul");
        rawList.add("Guri");
        rawList.add("Shergill");
        rawList.add(123456);
        rawList.add(9988);
        System.out.println(rawList);

    }

    // In this list we can store any string Data type values as we define specific Data type
    public static void StringListTypeMethod() {
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("john");
        strArrayList.add("Rahul");
        strArrayList.add("Guri");
        strArrayList.add("Shergill");
        for (String s : strArrayList) {
            System.out.println(s);
        }

        //we can also write above code as Showing List as Interface and Array List as Class:
        List<String> strList = new ArrayList<String>();
        strList.add("john");
        strList.add("Rahul");
        strList.add("Guri");
        strList.add("Shergill");
        for (String s : strList) {
            System.out.println(s);
        }

        //Live Example in Selenium is use in Select() Drop Down Values
        WebElement ele=null;
        Select dd = new Select(ele);
        //dd.getOptions(); // This we can use Store in List as Below
        List<WebElement> list = new ArrayList<WebElement>();
        //List<WebElement> list = dd.getOptions(); //Can also declare List in this way
        list = dd.getOptions();
        for (WebElement el : list) {
            System.out.println(el.getText());
        }

    }

}
