package OOPS.Inheritance;

class base {
    int x;

    void printl() {
        System.out.println("hello how r yu");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("HELLO THERE ");
        this.x = x;

    }
}


class derived extends base {
    int y;

    public int getY() {
        return x;
    }

    public void setY(int x) {
        System.out.println("hii yu derived");

    }

}


public class inc1 {

    public static void main(String[] args) {

        derived d = new derived();
        // System.out.println(d.getX());
        base b = new base();
        d.setX(90);
        System.out.println(d.getX());

    }
}
