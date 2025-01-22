package OopsConcept.CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {

    // Map has 2 values (Key, Value), only takes data in Pair Format
    // List is collection of Similar type of items, however, Map is collection of different type of items
    // In HashMap we can store Null value, whereas in HashTable we cannot store null value
    // Implemented in Latest Java 1.5 and above
    // Relaible in Multi Treading and is fast
    public static void main(String[] args) throws Exception {
        mapList();
        LinkedHashMapList();
        mapNullList();

    }

    // Using Set List in this method
    public static void mapList() {
        Map<String,String> mapList = new HashMap<String,String>(); // using Interface as Map and Class as HashMap
       //HashMap<String,String> setList = new HashMap<String.String>(); // Can also write as this only class is using
       mapList.put("Name","Gurjot");
       mapList.put("City","Melbourne");
       mapList.put("Address","Donvale");
       mapList.put("Company","FIS");
       mapList.put("Phone","9988690123");

       System.out.println(mapList.get("Name"));  //Reteriving value using Key Name

        for (Map.Entry entry : mapList.entrySet()) {
            System.out.println(entry);  //Fetch both Key and Value
            System.out.println(entry.getValue()); // Fetch only value
        }
    }
     // Comparison with HashTable
    public static void mapNullList() {
        Map<String,String> mapList = new HashMap<String,String>(); // using Interface as Map and Class as HashMap
       //HashMap<String,String> setList = new HashMap<String.String>(); // Can also write as this only class is using
       mapList.put("Name","Gurjot");
       mapList.put("City","Melbourne");
       mapList.put("Address","Donvale");
       mapList.put("Company","FIS");
       mapList.put("Phone","9988690123");
       mapList.put(null,"9988690123"); // In HashMap we can store null value

    
        for (Map.Entry entry : mapList.entrySet()) {
            System.out.println(entry);  //Fetch both Key and Value
            System.out.println(entry.getValue()); // Fetch only value
        }
    }

    // Using LinkedHashSet Class to print the list in Sorted Order as declared
    public static void LinkedHashMapList() {
        Map<String,String> mapList = new LinkedHashMap<String,String>(); // using Interface as Map and  Class as LinkedHashMap
        mapList.put("Name","Gurjot");
        mapList.put("City","Melbourne");
        mapList.put("Address","Donvale");
        mapList.put("Company","FIS");
        mapList.put("Phone","9988690123");

        for (Map.Entry entry : mapList.entrySet()) {
            System.out.println(entry);  //Fetch both Key and Value
            System.out.println(entry.getKey()); // Fetch only Key
        }
    }
}
