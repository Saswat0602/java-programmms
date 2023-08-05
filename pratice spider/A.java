
// class A{
//     public void m1(){
//      System.out.println("hello");   
//     }
//     A(){
//         System.out.println("print me i am a constructor");
//     }
// }

// class B extends A{

//     public static void main(String[] args) {
//         A a = new A();
//         A b = new B();


//         a.m1();
//         b.m1();
//     }
// }


interface A{
    int x = 10;
     int m1();
}
interface Z{
    int x = 10;
     void m1(int a);
}
interface X{
    int x = 10;
     int m1();
}

class B implements A,Z,X{

    @Override
    public int m1() {
        System.out.println("interfac 1");
        return 10;
    }
public static void main(String[] args) {
    B b  = new B();
    b.m1(10);
    b.m1();
}
@Override
public void m1(int a) {
    System.out.println("interface with arg");
}
}