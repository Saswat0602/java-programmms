package OOPSA;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);

    }
}

class Student {
    String name;
    int age;

    public void printN() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
        // System.out.println("hi  i am constructor");
    }
    Student(){

    }

}

public class Oops {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.color = "blue";
        p.printColor();

        Pen pe = new Pen();
        pe.color = "red";
        pe.printColor();



        Student s = new Student();
        s.name = "Saswat";
        s.age = 65; 
        Student s2 = new Student(s);

        s.printN();
        s2.printN();
    }
}
