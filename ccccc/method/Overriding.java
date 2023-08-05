package method;

class A {
    public int a;
    public int sas() {
        return 4;
    }

    public void meth() {
        System.out.println("second method of class A");
    }
}
class B extends A {
    // @Override
    public void meth() {
        System.out.println("second method of class B");
    }
    public void meth2() {
        System.out.println(" method of class B");
    }
}
public class Overriding {

    public static void main(String[] args) {

        A a = new A();
        a.meth();
        B b = new B();
        b.meth();



    }
}
