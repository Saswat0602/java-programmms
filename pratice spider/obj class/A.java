// HASHCODE()

// class A{
//     public static void main(String[] args) {
//         A a = new A();
//         A a1 = new A();
//         A a2 = new A();

//         System.out.println(a.hashCode());
//         System.out.println(a1.hashCode());
//         System.out.println(a2.hashCode());
//     }
// }

// class A {
//     int x;

//     A(int a) {
//         this.x = a;
//     }

//     public int hashCode() {
//         return x;
//     }

//     public static void main(String[] args) {

//         A a1 = new A(35);
//         A a = new A(10);

//         System.out.println(a.hashCode());
//         System.out.println(a1.hashCode());

//     }
// }

//STRING METHOD*******

// class B{
//     public static void main(String[] args) {

//         B b = new B();

//         System.out.println(b);
//         System.out.println(b.toString());
//     }
// }

// class A {
//     String x ;
//     A(String x){
//         this.x = x;
//     }
//     public String toString(){
//         return x;
//     }
//     public static void main(String[] args) {
//         A a1 = new A("hello");
//         A a = new A("ghgh");

//         System.out.println(a.toString());
//         System.out.println(a1.toString());

//     }
// }

//  class happy{
//     public static void main(String[] args) {

//         happy p = new happy();
//         happy p2 = new happy();

//         String s1 = new String("hello");
//         String s2 = new String("hello");
//         System.out.println(s1.equals(s2));
//         System.out.println(p.equals(p2));
//     }
//  }

// class A{
//     public static void main(String[] args) {
//         A a = new A();
//         System.out.println(a.hashCode());
//         a.finalize();
//         a = null;
//         System.gc();
//         a.finalize();
//         System.out.println(a.hashCode());
//         System.out.println("main");
//     }
//     public void finalize(){
//         System.out.println("finalize");
//     }
// }

// class A {
//     static A a;

//     public static void main(String[] args) {
//         A a = new A();
//         System.out.println(a.hashCode());
//         a = null;
//         System.gc();
//         System.out.println(a);
//         a = null;
//         System.gc();
//         System.out.println("main");

//     }
// }


// class A {
//     String name;
//     A(String name){
//         this.name= name;

//     }
//     public boolean equals(Object o){
//         String x = this.name;
//         A s = (A)o;
//         String y = s.name;

//         if (x.equals(y)) {
//             return true;
            
//         }
//      else{
//         return false;
//      }
//     }
//     public static void main(String[] args) {
//         A a1 = new A("abc");
//         A a2 = new A("abc");
//         System.out.println(a1.equals(a2));
//     }

// }


// class Me {
//     Me m;
//     public static void main(String[] args) {
//         Me m1 = new Me();
//         Me m2 = new Me();
//         Me m3 = new Me();

//         m1.m = m2;
//         m2.m=m3;
//         m3.m= m1;
//     }

// }

// class Me{
//     Me m;
//     int i;
//     public static void main(String[] args) {
//         Me m1 = new Me();
//         Me m2 = new Me();
//         Me m3 = new Me();

//         m1.i=10;
//         m2.i=20;
//         m3.i=30;

        
//         m1.m = m2;
//         m2.m=m3;
//         m3.m= m1;

//         m1 = null;
//         m2 = null;

//         System.out.println(m3.m.m.i);
//         System.out.println(m3.m.i);
//         System.out.println(m3.i);
//     }
// }


// class Tom{
//     public static void main(String[] args) {
//         Tom t = new Tom();
//         System.gc();
//         System.out.println("main");
//     }
//     public void finalize(){
//         System.out.println("finazile is called");
//     }
// }








