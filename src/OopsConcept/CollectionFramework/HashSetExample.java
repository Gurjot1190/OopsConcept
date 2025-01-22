package OopsConcept.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {

    // Set Class only Store Unqiue Values, no duplicate. However, in Array List we
    // can store Duplicate Values
    // Set is an Interface, Hastset is a Class
    // To sort the list in proper order we can use LinkedHastset class
    // We can use SET list where we want to remove duplicate values from the list
    // Real time use of Set in Window Handling
    public static void main(String[] args) throws Exception {
        iteratorListMethod();
        setList();
        LinkedHashSetList();

    }

    // Using Set List in this method
    public static void setList() {
        Set<String> setList = new HashSet<String>(); // using Interface as Set and Class as Hashset
       //HashSet<String> setList = new HashSet<String>(); // Can also write as this only class is using
        setList.add("john");
        setList.add("Rahul");
        setList.add("Guri");
        setList.add("Guri"); // Adding duplicate value in SET list and it will not print
        setList.add("Shergill");
        for (String set : setList) {
            System.out.println(set);
        }
    }

    // Using LinkedHashSet Class to print the list in Sorted Order as declared
    public static void LinkedHashSetList() {
        Set<String> setList = new LinkedHashSet<String>();
        setList.add("john");
        setList.add("Rahul");
        setList.add("Guri");
        setList.add("Guri"); // Adding duplicate value in SET list and it will not print
        setList.add("Shergill");
        for (String set : setList) {
            System.out.println(set);
        }
    }

    // Using Iterator Method
    public static void iteratorListMethod() {
        Set<String> setList = new HashSet<String>();
        setList.add("john");
        setList.add("Rahul");
        setList.add("Guri");
        setList.add("Guri"); // Adding duplicate value in SET list and it will not print
        setList.add("Shergill");

        System.out.println(setList);

        Iterator<String> iter = setList.iterator(); // Only use data one time and display next data
        // System.out.println(iter.next());
        while (iter.hasNext()) {
            String value = iter.next();
            if (value.equals("Shergill")) {
                iter.remove();
                System.out.println("Removed " + value + " value from the List");
            }
        }
        System.out.println(setList);

        //Example in Selenium
        //Set<String> set = driver.getWindowHandles(); // Get all the unique windows handles

    }

}
