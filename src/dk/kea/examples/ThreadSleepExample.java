package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.Thread.DummyThread;

public class ThreadSleepExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "In this example we will demonstrate the thread sleep method";
    }

    @Override
    public String getName()
    {
        return "Thread Sleep";
    }

    @Override
    public void runExample()
    {
        DummyThread dummyThread = new DummyThread();

        dummyThread.start();

        try {
            Thread.sleep(18000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
