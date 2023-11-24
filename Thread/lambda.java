public class lambda{
    public static void main(String[] args) {
        // Thread 1
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello");
            }
        });
        thread1.start();

        // Thread 8
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
            }
        });
        thread2.start();
    }
}
