import java.util.Scanner;

public class insertion {
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
        for(int i=0 ;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=current;
        }
        printarr(arr);
        

    }
}
