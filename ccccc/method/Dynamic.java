package method;

class One{
    public void name()
    {
        System.out.println("my name is  saswat");
    }
    public void great()
    {
        System.out.println("Good morning");
    }
    
    
}


class Two extends One{
    public void name()
    {
        System.out.println("my name is  saswat printing from class two");
    }
    public void swag()
    {
        System.out.println("You r welcome");
    }
    
    

}




public class Dynamic {
    
    public static void main(String[] args) {
        // One ob = new One();
        // Two obj = new Two();
        // ob.name();

        One o = new Two();
        o.great();
        o.name();
        // obj.swag();



        
    }
}
