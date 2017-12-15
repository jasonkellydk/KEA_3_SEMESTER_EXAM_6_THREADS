package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.Thread.PrintCount;
import dk.kea.examples.Thread.SynchronizeThread;

public class ThreadSynchronizationExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will show how Synchronize in action";
    }

    @Override
    public String getName()
    {
        return "Thread Synchronization";
    }

    @Override
    public void runExample()
    {
        PrintCount printCount = new PrintCount();

        SynchronizeThread thread = new SynchronizeThread("Thread - 1", printCount);
        SynchronizeThread thread2 = new SynchronizeThread("Thread - 2", printCount);

        thread.start();
        thread2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // wait for threads to end
        try {
            thread.join();
            thread2.join();
        } catch ( Exception e) {
            System.out.println("Interrupted");
        }
    }
}
