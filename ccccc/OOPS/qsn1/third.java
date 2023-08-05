package OOPS.qsn1;

class cyn {
    private int rad=67;
    private int dad=56;

    public cyn(int rad,int dad){
        this.rad=rad;
        this.dad=dad;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public int getDad() {
        return dad;
    }

    public void setDad(int dad) {
        this.dad = dad;
    }
    public int sum(){
        int sum = rad*dad;
        return sum;
    }

}

public class third {
    public static void main(String[] args) {
    cyn mycyn  = new cyn(12,56);
    mycyn.setDad(464);
    System.out.println(mycyn.getDad());
    mycyn.setRad(755);

    System.out.println(mycyn.getDad());
    System.out.println(mycyn.sum());

    }

}
