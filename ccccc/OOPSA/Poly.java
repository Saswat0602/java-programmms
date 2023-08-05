package OOPSA;

// import java.util.jar.Attributes.Name;

class Students{
    String name;
    int age;
    public void printf(String name){
        System.out.println(name);
    }public void printf(int age){
        System.out.println(age);
    }

    public void printf(String name,int age){
        System.out.println(name+" "+age);
    }
}




public class Poly{
    
    public static void main(String[] args) {
        
        Students s =  new Students();
        s.name = "Saswat";
        s.age = 65; 
        s.printf(45);
        s.printf(s.name);

    }
}
