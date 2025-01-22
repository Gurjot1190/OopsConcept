package JavaPrograms;

public class MissingNumberInArray {

    //Sum of Array
    //Array Should not have duplicates
    public static void main(String[] args) throws Exception{

        int[] array = {7,5,6,1,4,2,3,9,10};   //8 Missing Number

        int sum1=0;
        int sum2=0;

        for(int i = 0; i<array.length;i++){
            sum1 = sum1 + array[i];
        }

        for(int i = 1; i<=10;i++){
            sum2 = sum2 + i;
        }
        System.out.println("Sum of Array is = "+sum1);
        System.out.println("Sum of range is = "+sum2);
        System.out.println("Missing Number in Array is = "+(sum2-sum1));


        

    }

}
