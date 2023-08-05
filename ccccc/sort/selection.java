import java.util.Scanner;

public class selection {
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
        for(int i = 0 ;i<arr.length-1;i++){
            int smallest= i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]= temp;
        }
        printarr(arr);
    }
}
