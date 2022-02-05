package Day13;

public class ThreadImplements implements Runnable {
    public static void main(String[] args) {
        ThreadImplements thread = new ThreadImplements();
        Thread thread1 = new Thread(thread);
        thread1.start();
        System.out.println("Code outside the thread class");
    }

    @Override
    public void run() {
        System.out.println("Code inside the thread class.");
    }
}
