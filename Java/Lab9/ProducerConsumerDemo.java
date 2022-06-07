class Processor {

    int stock = 5;

    public synchronized void producer() throws Exception {
        stock++;
        while (stock > 5)
            wait();
        notifyAll();
        System.out.println("Current stock = " + stock);
    }

    public synchronized void consumer() throws Exception {
        stock--;
        while (stock < 1)
            wait();
            notifyAll();
        System.out.println("Current stock = " + stock);
    }
}

class Producer extends Thread {

    Processor obj;

    public Producer(Processor obj) {
        this.obj = obj;
    }

    public void run() {

        while (true) {
            try {
                sleep((int)( Math.random() * 200));
                obj.producer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

class Consumer extends Thread {

    Processor obj;

    public Consumer(Processor obj) {
        this.obj = obj;
    }

    public void run() {
        while (true) {

            try {
                sleep((int)( Math.random() * 200));
                obj.consumer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

public class ProducerConsumerDemo{

    public static void main(String[] args) {

        Processor obj = new Processor();
        Producer t1 = new Producer(obj);
        Consumer t2 = new Consumer(obj);
        t1.start();
        t2.start();
    }
}