package OOPSA;

abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("this is a new animal");
    }
}

class Dogs extends Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
        
    }
    Dogs() {
        System.out.println("Wow, you have created a Horse!");
    }
 
}

class Chicken extends Animal{
    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }
 
    public void walk(){
        System.out.println("walk on 2 legs");

    }
}
 






public class Abstract {
    
    public static void main(String[] args) {
Dogs h = new Dogs();
h.walk();




    }
}
