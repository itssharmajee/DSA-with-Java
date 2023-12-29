public class DeadLockExample {
    static Object resource1 = new Object();
    static Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());

        thread1.start();
        thread2.start();
    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for resource 2");
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1");
                }
            }
        }
    }
}
