package OOPS.Inheritance.qsn;

class Circle{
    public int rad;
    Circle(int r){
        this.rad=r;
    }
public double area(){
  return  this.rad*this.rad*Math.PI;
}
}

class cylinder extends Circle{
    public int height;
    cylinder( int r, int h){
        super(r);
        this.height=h;


    }
    public double vol(){
        return this.rad*this.rad*Math.PI*height;
     
    }
}


public class First {
    public static void main(String[] args) {
        Circle c =  new Circle(10);
        cylinder obj =  new cylinder(12,5);

    }
}
