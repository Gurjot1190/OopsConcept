package OopsConcept.CollectionFramework;

public class StringExample {
    // String has 3 classes

    public static void main(String[] args) throws Exception {

        stringClass();
        stringBufferClass();
        stringBuilderClass();
    }

    //String class is immutable class
    public static void stringClass(){
        String str = "Automation";
        str.toUpperCase(); // Will not convert into Uppercase as string is immutable class
        System.out.println(str);
        // This will convert string into uppercase in a runtime as we are directly printing but not converting physically
        System.out.println(str.toUpperCase());
    }

    // StringBuffer class is a mutable class
    // Having functions like Append, Insert, Delete
    // Legacy concept introduce in Java 1.0
    // Synchronized(Thread safe), It means two threads can't call the methods simultaneously
    public static void stringBufferClass(){
        StringBuffer sb = new StringBuffer("Automation");
        sb.append(" Test Hub"); // Append letter in string
        // sb.insert();
        // sb.delete(0, 0); These function included in String Buffer class
        System.out.println(sb);
    }

    // StringBuilder class is a mutable class
    // Having functions like Append, Insert, Delete
    // Latest concept introduce in Java 1.5
    // Non-Synchronized(not Thread safe), It means two threads can call the methods simultaneously
    public static void stringBuilderClass(){
        StringBuilder sb = new StringBuilder("Automation");
        sb.append(" Test Hub"); // Append letter in string
        // sb.insert();
        // sb.delete(0, 0); These function included in String Buffer class
        System.out.println(sb);
    }

    // Important
    String s1 = "Hello"; // This will goes under Heap memory and share common Pool Area
    String s2 = new String("Hello"); // This goes under Heap memory but always occupy new space in memory
    //Main difference is memory only

}
