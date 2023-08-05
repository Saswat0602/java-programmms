package THREAD;


class Thr extends Thread{
    public Thr(String name){
        super(name);
    }
     public Thr(Runnable r){
        super(r);
    } 
    public void run(){
        int i = 50;
        System.out.println("you there ");
        // while(true){
        //     System.out.println("i am a thrd");
        // }
    }
}


public class ThreadCon {
    
    public static void main(String[] args) {
        Thr t =  new Thr("hello");
        Thr t1 =  new Thr("saswat");
        t.start();
        System.out.println("the id of the thread   "+t.getId());
        System.out.println("the id of the thread  "+t.getName());
        System.out.println("the id of the thread   "+t1.getId());
        System.out.println("the id of the thread  "+t1.getName());
        
    }
}
