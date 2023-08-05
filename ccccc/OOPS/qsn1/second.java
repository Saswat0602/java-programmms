package OOPS.qsn1;


class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
}
class rect{
    int a,b;

    public int area(){
        return a*b;
    }
    public int perimeter(){
        return 2*(a+b);
    }

}
public class second {
    
    public static void main(String[] args) {
        square sq = new square();
        sq.side = 45;
       System.out.println( sq.area());
      System.out.println(  sq.perimeter());


      rect r= new rect();
      r.a=56;
      r.b=65;
      System.out.println( r.area());
      System.out.println(  r.perimeter());

    }
}
