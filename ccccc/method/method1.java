package method;

public class method1 {
        static void chnage(int [] arr){
            arr[0]=26;
        }
        static void change2(int a){
            a=2658;
        }
    

    public static void main(String[] args) {
        int x=45;
        int [] arr= {12,665,4,8,36,75,65};
        change2(x);
        chnage(arr);
        System.out.println(arr[0]);
        System.out.println(x);
    }
}
