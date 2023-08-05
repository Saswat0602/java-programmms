package Zpratice;

import method.method;
abstract class Ab{
    void th(){
        System.out.println("normal method inside abstract class");
    }
    abstract void df();
}
class Ba extends Ab{

    @Override
    void df() {
        System.out.println("implementation of abstract method in child class");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'df'");
    }
    
}


class Method{
    public void name() {
        System.out.println("hello wrol");
    }
    public void name(int a) {
        System.out.println("hello w");
    }

}

class Meth extends method{
    public void name() {
        System.out.println("hello wro,bhgfiyl");
    }
    public void name(int a) {
        System.out.println("hello wrjfuftfutkol");
    }
}

public class Overload1 {
    
    public static void main(String[] args) {
        Meth m  = new Meth();
        Method m1  = new Method();
        Ba b = new Ba();
        b.df();
        b.th();
        m.name();
        m.name(656);
        m1.name();
        m1.name(6);
    }
}
