abstract class Phone{  
    abstract void on();  
  }  
  class SmartPhone extends Phone{  
  void on(){
  System.out.println("Turning on...");
  }

 }




abstract class Base{
    Base(){
        System.out.println("im constructor of base");
    }
    public void Hello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class derive extends Base{
    public void greet(){
        System.out.println("good night");
    } public void greet2(){
        System.out.println("good boy");
    }
}

abstract class Derive2 extends Base{
    public void gr(){
        System.out.println("morning");
    }
}


public class Abstract{
    public static void main(String[] args) {
        derive d = new derive();
        // Base b =new Base();


        Phone obj = new SmartPhone();  
         obj.on();

    }
}








