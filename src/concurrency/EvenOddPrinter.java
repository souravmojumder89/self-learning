package concurrency;

public class EvenOddPrinter {
    private final int input = 20;
    volatile int counter = 1;


    public void printOdd() {

        synchronized (this) {
            while (counter < input) {
                if (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                System.out.println(Thread.currentThread().getName() + " : " + counter++);
                notify();
            }
        }
    }

    public synchronized void printEven() {
        synchronized (this) {
            while (counter < input) {
                if (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                System.out.println(Thread.currentThread().getName() + " : " + counter++);
                notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        EvenOddPrinter evenOddPrinter = new EvenOddPrinter();

        Thread t1 = new Thread(() -> evenOddPrinter.printOdd());
        t1.setName("Odd ");

        Thread t2 = new Thread(() -> evenOddPrinter.printEven());
        t2.setName("Even");

        /*Thread t3 = new Thread(() -> evenOddPrinter.printOdd());
        t3.setName("Odd2 ");

        Thread t4 = new Thread(() -> evenOddPrinter.printEven());
        t4.setName("Even2");*/

        t1.start();
        t2.start();

        t1.join();
        t2.join();
//        t3.start();
//        t4.start();

    }
}
