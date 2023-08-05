package method;

//method oveerriding cant be achieved with data members . its only can achieved form method

class Bike{  
    int speedlimit=90;  
   }  
   class Honda3 extends Bike{  
    int speedlimit=150;  
     
    public static void main(String args[]){  
     Bike obj=new Honda3();  
     System.out.println(obj.speedlimit);//90  
   }  
  }    