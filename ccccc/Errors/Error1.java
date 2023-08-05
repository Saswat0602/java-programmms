package Errors;

import java.util.Scanner;


public class Error1 {
    public static void main(String[] args) {


        System.out.println(2);
         for(int i =1;i<5;i++){
            System.out.println(2*i+1);
         }

         int k;
         Scanner sc = new Scanner(System.in);
         k=sc.nextInt();
         System.out.println(1000/k);

         int a = 60000;
         int  b = 0;

         try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");





          



     
         



    }


}
