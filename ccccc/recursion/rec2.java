package recursion;

public class rec2 {
 public static void printsum(int i ,int n,int sum){
if(i==n){
    System.out.println(sum);
    return;
}
    sum+=i;

printsum(i+1, n, sum);
 }
    public static void main(String[] args) {
        printsum(1,10,0);
    }
   
    
}
