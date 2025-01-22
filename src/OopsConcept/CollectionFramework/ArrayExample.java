package OopsConcept.CollectionFramework;

public class ArrayExample {

    // Array is variable which is used to store multiple values
    // Array is fixed and cannot be resized or removed
    // Array is a Datatype
    // Not able to use many functions with Array
    // In Array we can use only similar Datatype for example , string only or numeric only
    public static void main(String[] args) throws Exception {

        // First Way to Implement
        int[] a = new int[3];
        a[0] = 123;
        a[1] = 1234;
        a[2] = 12345;
        System.out.println(a[1]);

        //Second way to implement
        int[] ar = {20, 30, 40, 50};
        System.out.println(ar[3]);

        //Print all array values using for Loop 
        for(int i = 0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
        
        //Another way of for loop to print all array values
        for(int i:ar){
            System.out.println(i);
        }
        
        //String Array
        String[] str = {"abc", "ghj","yui"};
        for(String value:str){
            System.out.println(value);
        }
     
    }

 
   

}

