package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.Thread.DummyThread;

public class ThreadJoinExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will demonstrate thread join";
    }

    @Override
    public String getName()
    {
        return "Thread Join";
    }

    @Override
    public void runExample()
    {
        DummyThread dummyThread = new DummyThread();
        DummyThread dummyThread1 = new DummyThread();
        DummyThread dummyThread2 = new DummyThread();

        dummyThread.start();
        dummyThread1.start();
        dummyThread2.start();

        try {
            dummyThread.join();
            dummyThread1.join();
            dummyThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("We have now waited for all threads to stop");
    }
}
