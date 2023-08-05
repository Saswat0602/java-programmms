package OOPS.access;

class mains{
    private int id;
    private String name;

    public mains(){
        id=67;
        name="saswat";
    }
    public mains(String myname,int a){
        id=67;
        name="saswat";
    }
    public String getName(){ 
        return name;

    }
    public void setName(String x){
        name = x;

    }
    public int getId(){
        return id;

    }
    public void setId(String x){
        id = 5;

    }

}

public class constructor {
    
    public static void main(String[] args) {
        mains m = new mains();
        // m.id=45;
        // m.name="sasd";
        m.setName("saswat ranjan mohanty");
        System.out.println(m.getName());
        System.out.println(m.getId());
    }
}
