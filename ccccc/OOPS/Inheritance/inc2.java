package OOPS.Inheritance;



class base1 {

    base1() {
        System.out.println("i am a constructor");
    }

    base1(int x) {
        System.out.println("i am a constructor with valuw of a " + x);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}



class derive1 extends base1 {
    derive1() {
        super(56);
        System.out.println("i am derive class consturctor");
    }

    derive1(int x, int y) {
        super(x);
        System.out.println("i am derive class consturctor with vlaue of y " + y);
    }

    int y;

    public int getY() {
        return x;
    }

    public void setY(int x) {
        System.out.println("hii yu derived");

    }
}

class ChildOfDerived extends  derive1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}


public class inc2 {

    public static void main(String[] args) {

        base1 b = new base1();
        // derive1 d = new derive1();
        derive1 d = new derive1(45, 65);
        
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);

    }
}
