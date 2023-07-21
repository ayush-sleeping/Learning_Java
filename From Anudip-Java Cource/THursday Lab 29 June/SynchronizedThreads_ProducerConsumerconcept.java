import java.util.LinkedList;

public class SynchronizedThreads_ProducerConsumerconcept {
	/* buffer is the shared data structure between the producer and consumer threads.
	 * It is accessed and modified by both threads, so proper synchronization 
	 * is necessary to avoid data inconsistencies and race conditions.*/
    private LinkedList<Integer> buffer = new LinkedList<>();
    private final int CAPACITY = 5;

	// It is marked with the throws InterruptedException declaration to handle thread interruption.
    public void produce() throws InterruptedException { 
        int value = 1;
        int itemsProduced = 0; // Track the number of items produced
        while (itemsProduced < 30) { // Produce only 30 items
        	// the synchronization of threads is achieved using the synchronized keyword
            synchronized (this) {
                while (buffer.size() == CAPACITY) {
                    /* while loop that checks if the buffer is full (buffer.size() == CAPACITY). 
                     * If it is full, the producer thread waits using the wait() method. */ 
                    wait();
                }

                // Produce an item and add it to the buffer
                System.out.println("Producer produced: " + value);
                buffer.add(value++);
                itemsProduced++;

                // Notify the consumer that an item is available
                notify();

                Thread.sleep(1000);
            }
        }
        
        // After producing 30 items, inform the consumer that the shift is over
        synchronized (this) {
            System.out.println("Shift is over for today. No more products. Please come tomorrow.");
            notify();
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.size() == 0) {
                    // Buffer is empty, wait for the producer to produce
                    wait();
                }

                // Consume an item from the buffer
                int consumedValue = buffer.removeFirst();
                System.out.println("Consumer consumed: " + consumedValue);

                // Notify the producer that a slot is available
                notify();

                Thread.sleep(1000);
            }
        }
    }

    public static void main(String[] args) {
        final SynchronizedThreads_ProducerConsumerconcept example = new SynchronizedThreads_ProducerConsumerconcept();

        // Two separate threads, producerThread and consumerThread, are created and started using lambda expressions.
        Thread producerThread = new Thread(() -> {
            try {
                example.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        /* The producerThread calls the produce() method of the example instance, 
         *  and the consumerThread calls the consume() method of the example instance. */
        Thread consumerThread = new Thread(() -> {
            try {
                example.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}


/* The synchronization ensures that the producer produces items only when the buffer has space, 
 * and the consumer consumes items only when the buffer has items available.
 
  
 * By using the synchronized keyword and the wait() and notify() methods, 
 * the program ensures that the producer and consumer threads take turns accessing the shared buffer data structure.
 */
