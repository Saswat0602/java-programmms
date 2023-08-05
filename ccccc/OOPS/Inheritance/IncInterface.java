package OOPS.Inheritance;

// import someprgs.main;

interface samle{
    void meth1();
    void meth2();
}
interface child extends samle {
    void meth3();
    void meth4();

}
class  Mysample implements child{
   public void meth3()
    {
        System.out.println("meth3");
    } 
    public  void meth4()
    {
        System.out.println("meth4");
    }


    @Override
    public void meth1() {
        System.out.println("meth1");

        
    }
    @Override
    public void meth2() {
        System.out.println("meth2");

        
    }

}


public class IncInterface {
    
    public static void main(String[] args) {
        Mysample obj = new Mysample();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
        


    }
}
