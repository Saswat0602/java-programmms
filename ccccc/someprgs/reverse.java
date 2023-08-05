package someprgs;

import java.util.*;

class reverse{
    public static void main(String[] args){
        int arr[] = new int[]{1,2,3,4,5,6};
        System.out.println("original array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");

        }
        System.out.println("arrray in reverse ");
        for(int i=arr.length-1;i>=0;i--)
        System.out.println(arr[i]+" ");

    }
}