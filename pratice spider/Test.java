// abstract class T {
//     abstract void m1();
//     abstract void m2();
//     abstract void m3();
//     abstract void m4();
// }

//  class Test extends T{

//     @Override
//    public  void m1() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'm1'");
//     }

//     @Override
//    protected  void m2() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'm2'");
//     }

//     @Override
//     void m3() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'm3'");
//     }

//     @Override
//   void m4() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'm4'");
//     }
    
// }


//  class M{
//    public static void m1(){
//         System.out.println("hello");
//     }
// } 
// class BP extends M{
//     public static void m1 (){
//         System.out.println("how r yu");
//     }
//     public static void main(String[] args) {
//         BP b = new BP();
//         M n = new M();
//         M bm = new BP();
    
//         b.m1();
//         n.m1();
//         bm.m1();
//     } 
// }

class A{
    A(){
        this(10);
        System.out.println("cons 2");
    }A(int a){
        System.out.println("cons 1");
    }
    public static void main(String[] args) {
        A a = new A();
        // A a = new A();
    }
}









