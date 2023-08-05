package OOPSA;





interface Animal {
    void walk();
    void eats();
 }
 
 
 class Horse implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }

    @Override
    public void eats() {
        // TODO Auto-generated method stub
        
    }
 }
 
 
 class Chicken implements Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }

    @Override
    public void eats() {
        // TODO Auto-generated method stub
        
    }
 }
 
 
 public class Inter {
    public static void main(String args[]) {
       Horse horse = new Horse();
       horse.walk();
    }
 }
 