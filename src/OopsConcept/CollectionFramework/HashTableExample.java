package OopsConcept.CollectionFramework;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashTableExample {

    // HashTable has 2 values (Key, Value), only takes data in Pair Format
    // List is collection of Similar type of items, however, Map is collection of different type of items
    // In Hashtable we cannot store Null value, whereas in HashMap we can store null value
    // Hashtable is legacy concept, Introduce in Java 1.2
    // Hashtable is a class not interface
    // Not Relaible in Multi Treading and is slow 
    public static void main(String[] args) throws Exception {
        //tableList();
        listIncludeNullValue(); 

       // LinkedHashTableList();

    }

    // Using Set List in this method
    public static void tableList() {
       Hashtable<String,String> tableList = new  Hashtable<String,String>(); // Can also write as this only class is using
       tableList.put("Name","Gurjot");
       tableList.put("City","Melbourne");
       tableList.put("Address","Donvale");
       tableList.put("Company","FIS");
       tableList.put("Phone","9988690123");

       System.out.println(tableList.get("Name"));  //Reteriving value using Key Name

        for (Map.Entry entry : tableList.entrySet()) {
            System.out.println(entry);  //Fetch both Key and Value
            System.out.println(entry.getValue()); // Fetch only value
        }
    }
    // Comparison with HashMap
    public static void listIncludeNullValue() {
        Hashtable<String,String> tableList = new  Hashtable<String,String>(); // Can also write as this only class is using
        tableList.put("Name","Gurjot");
        tableList.put("City","Melbourne");
        tableList.put("Address","Donvale");
        tableList.put("Company","FIS");
        tableList.put("Phone","9988690123");
        tableList.put(null,"9988690123"); // In HashTable we cannot store null value
 
         for (Map.Entry entry : tableList.entrySet()) {
             System.out.println(entry);  //Fetch both Key and Value
             System.out.println(entry.getValue()); // Fetch only value
         }
     }
}
