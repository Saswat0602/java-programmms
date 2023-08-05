package OOPS.qsn1;

class employee {
    int salary;
    String name;

    public int getsal() {

        return salary;
    }

    public String getName() {
        return name;

    }

    public void setName(String n) {
        name = n;

    }
}

class cellphone{

    public void ringing() {
        System.out.println("ringing");
    }

    public void vibrate() {
        System.out.println("ringing");
    }

    public void callfrnd() {
        System.out.println("ringing");
    }
}

public class first {
    public static void main(String[] args) {

        employee saswat = new employee();
        saswat.setName("saswat ra");
        saswat.salary = 45555;
        System.out.println(saswat.getName());
        System.out.println(saswat.getsal());



        cellphone vivo= new cellphone();
        vivo.callfrnd();
        vivo.ringing();
        vivo.callfrnd();










        
    }
}
