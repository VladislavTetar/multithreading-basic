package threads;

public class Counter {
    private int count;

    public synchronized int increment() {
        count = count + 1;
        return count;
    }

    public int getCount() {
        return count;
    }
}
