package JavaPrograms;

public class PyramidPrograms {

    /* *
       **
       ***
       ****
       *****
       */

       public static void main(String[] args) throws Exception{
    /* Patern 
       *
       **
       ***
       ****
       *****
       */
        // for(int i =1; i<=5; i++){
        //     for(int j =1; j<=i; j++){
        //             System.out.print("*");
        //     }
        //     System.out.println("");
        //}

         /* Patern
         *****
         ****
         ***
         **
         *
       */
    //   for(int i =1; i<=5; i++){
    //     for(int j =5; j>=i; j--){
    //             System.out.print("*");
    //     }
    //     System.out.println("");
    //    }
     
    /*  *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
       */
          for(int i =1; i<=5; i++){
        for(int j =1; j<=i; j++){
                System.out.print("*");
        }
        System.out.println("");
       }
       for(int i =1; i<=5; i++){
        for(int j =4; j>=i; j--){
                System.out.print("*");
        }
        System.out.println("");
       }


    } 

}
