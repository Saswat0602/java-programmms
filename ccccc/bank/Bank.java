package bank;

 class acc{
   public String name;
   protected String mail;
   private String password;
    
   public String getpass(){
    return this.password;
   }
   private void setPass(String password){
    this.password = password;
   }
}

 public class Bank {
    public static void main(String[] args) {
        acc ac1 = new acc();
        ac1.name = "saswat";
        ac1.mail = "djfeo@oeokofko";
        // ac1.setPass("asdf");
        System.out.println(ac1.getpass());
    
    }
    
}
