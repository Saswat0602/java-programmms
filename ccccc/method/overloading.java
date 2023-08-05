package method;

public class overloading {
    static void foo(){
        System.out.println("HKKO");
    }
    static void foo(int a){
        System.out.println("morning "+a+" saswat");
    } 
    static void foo(int a,int b){
        System.out.println("morning "+a+" saswat");
        System.out.println("morning "+b+" saswat");


    }
    public static void main(String[] args) {
        foo();
        foo(54);
        foo(54,89);
    }
}
