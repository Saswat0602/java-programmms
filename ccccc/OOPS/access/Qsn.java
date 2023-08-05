package OOPS.access;

class Calculator{
    public void calculate(int a,int b){
        System.out.println("result is " + a+b);
    }
}
class ScCalculator{
    public void calculate(int a,int b){
        System.out.println("result is " + Math.sin(a+b));
    }
}
class HyCalculator{ 
    public void calculate(int a,int b){
        System.out.println("result is " + a+b);
        System.out.println("result is " + Math.sin(a+b));

    }
}


public class Qsn {
    public static void main(String[] args) {
        System.out.println("hii there");
        
    }
}
