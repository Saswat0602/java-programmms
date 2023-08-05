//bubble sort

import java.util.Scanner;

public class sort {
public static void printarr(int arr[]){
    System.out.println("the array  is ---");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] +" ");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the range of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        //bubble sort
        for(int i =0;i<arr.length-1;i++){
            for(int j = 0 ; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarr(arr);
    }
}

//SELECTION SORT






