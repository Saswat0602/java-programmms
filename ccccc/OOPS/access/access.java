package OOPS.access;

class mine{
    private int id;
    private String name;

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

public class access {
    
    public static void main(String[] args) {
        mine m = new mine();
        // m.id=45;
        // m.name="sasd";
        m.setName("saswat ranjan mohanty");
        System.out.println(m.getName());
    }
}
