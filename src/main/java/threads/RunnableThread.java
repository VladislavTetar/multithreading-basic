package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnableThread implements Runnable {
    private static final Logger logger = LogManager.getLogger(RunnableThread.class);
    private Counter counter;

    public RunnableThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCount() < 100) {
            counter.increment();
            logger.info(" value = " + counter.getCount());
        }
    }
}
