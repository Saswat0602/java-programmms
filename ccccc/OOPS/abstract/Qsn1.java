
abstract class Pen {
    abstract void write();

    abstract void refill();
}

class Fountain extends Pen {

    @Override
    void write() {
        System.out.println("write");
    }

    @Override
    void refill() {
        System.out.println("refill");

    }

    void changeNib() {
        System.out.println("Changeing the nib");
    }
}

class Monkey {
    void jump() {
        System.out.println("jumping");

    }

    void bite() {
        System.out.println("Biting");
    }
}

interface Basic {
    void sleep();
    void eat();

}

class Human extends Monkey implements Basic {
    void speak() {
        System.out.println("heelo sir");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }
}

class Qsn1 {
    public static void main(String[] args) {
        Fountain pen = new Fountain();
        pen.changeNib();


        //qsn 3
        Human saswat = new Human();
        saswat.sleep();


        //qsn5
        Monkey m1 = new Human();
        // m1.speak();   cant use speek bcz monkey doesnt hav speek
        Basic l = new Human();
        l.eat();
        l.sleep();

        // l.speek(); cant do this



    }
}