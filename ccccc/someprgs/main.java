package someprgs;

import java.util.*;

public class main{
    public static void main(String[] args){
        int []arr ;
        int  n;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the range of the array");
        n = sc.nextInt();
        arr  = new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("elements of original array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
            
        }
        System.out.println();

        System.out.println("print the above element in reverse");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }
    }
}