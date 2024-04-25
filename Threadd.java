
class Threads1 extends Thread {
    public void run() {
        System.out.println("Start the thread");
    }
}

class Threads2 extends Thread {
    public void run() {
        System.out.println("Run the thread");
    }
}

public class Threadd {
    public static void main(String[] args) {
        Threads1 t1 = new Threads1();
        t1.start();
        Threads2 t2 = new Threads2();
        t2.start();
    }
}