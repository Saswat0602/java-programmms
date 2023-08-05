package THREAD;

class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 400) {

            System.out.println("i am a thread");
        }
    }
}

class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {

        int i = 0;
        while (i < 400) {

            System.out.println("i am  danger");
        }
    }
}

public class Thread2 {

    public static void main(String[] args) {

        MyThreadRunnable t1 = new MyThreadRunnable();
        Thread g1 = new Thread(t1);
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread g2 = new Thread(t2);

        g1.start();
        g2.start();

    }
}
