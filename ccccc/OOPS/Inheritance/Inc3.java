package OOPS.Inheritance;

class Myclass{

    public int getA(){
        return a;
    }



    Myclass(int v){
        a=v;
    }
    int a;
    public int retone(){
        return 1;
    }
}


public class Inc3 {
    
    public static void main(String[] args) {
        Myclass m = new Myclass(65);
        System.out.println(m.getA()  );
    }
}
