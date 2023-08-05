


interface camera{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("recording in 4k");
    }
}

interface wifi{
    String[] getNetwork();
    void connect(String network);
}


class cellphone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
     void pickCall(){
        System.out.println("connecting......");
    }
   
}

class SmartPhone extends cellphone implements wifi , camera{

    
public void takeSnap(){
    System.out.println("taking snap");
}

@Override
public void recordVideo() {
    System.out.println("taking video");
    // TODO Auto-generated method stub
    
}

@Override
public String[] getNetwork() {
    System.out.println("getting lit of network");
    String[] networklist = {"sasassas","sas","sam"};
    // TODO Auto-generated method stub
    return null;
}

@Override
public void connect(String network) {
    System.out.println("connecting to "+network);
    // TODO Auto-generated method stub
    
}
}


public class Interface2 {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        String[] ar = sm.getNetwork();
        for (String item   : ar) {
            System.out.println(item);
            
        }
    }
}













