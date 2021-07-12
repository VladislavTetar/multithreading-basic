package threads;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread runnableThread = new Thread(new RunnableThread(counter), "Runnable Thread");
        Thread thread = new CustomThread(counter);
        thread.setName("Custom Thread");
        runnableThread.start();
        thread.start();
    }
}
