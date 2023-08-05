package OOPS;

class emp {
    int x;
    int salary =4564;
    String name;

    public void printd() {
        System.out.println("my name is " + name);
        System.out.println("my salary is " + salary);
        System.out.println("my name is " + x);
    }
    public int getsal(){
        return salary;
    }
}

public class customclass {

    public static void main(String[] args) {

        emp sas = new emp();
        emp sam = new emp();
        sas.x = 13;
        sas.name = "saswat";
sas.getClass();
        sam.x=56;
        sam.name="dkgrei5teheriae";
sam.getClass();
        sas.printd();
        sam.printd();

        // System.out.println(sas.x);
        // System.out.println(sas.name);
    }
}
