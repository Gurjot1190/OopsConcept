package JavaPrograms;

public class SwapTwoNumbers
 {

    //3 Ways to do this
    public static void main(String[] args) throws Exception{

        int a = 10;
        int b = 20;
        System.out.println("Before Swaping the values are "+a+" "+b);

        //Login 1 - Use Third Variable
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swaping the values are "+a+" "+b);

        //Login 2 - Not use third variable 
        a=a+b; //10+20 = 30 
        b=a-b; //30-20 = 10
        a=a-b;  //30-10 = 20
        System.out.println("After Swaping the values are "+a+" "+b);

        //Login 3 - Not use third variable , here a&b should not zero
        a=a*b; // 10*20 = 200 
        b=a/b; // 200/20 = 10
        a=a/b;  // 200/10 = 20
        System.out.println("After Swaping the values are "+a+" "+b);





        


        

    }

}
