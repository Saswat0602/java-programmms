package THREAD;

class MyThread  extends Thread{

    public void run(){

        int i=0;
        while(i<40000){     
        System.out.println("hello there ");
        System.out.println("hello there  how r yu");
        i++;
        }
    }
}
 
class MyThread2  extends Thread{

    public void run(){
        int i=0;
        while(i<40000){
        System.out.println("i am saswat ");
        System.out.println("hi  i am thread 2 ");
        i++;
        }
    }
}
public class Thread1 {
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

        
    }
}
