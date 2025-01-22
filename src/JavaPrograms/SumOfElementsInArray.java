package JavaPrograms;

public class SumOfElementsInArray {

    //Sum of Array
    public static void main(String[] args) throws Exception{

        int[] array = {30,40,50,60};

        int sum=0;

        for(int i = 0; i<array.length;i++){
            sum = sum + array[i];
        }

        System.out.println("Sum of Array = "+sum);

    }

}
