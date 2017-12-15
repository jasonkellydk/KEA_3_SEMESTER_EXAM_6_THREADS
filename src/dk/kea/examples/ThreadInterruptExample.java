package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.Thread.DummyThread;

public class ThreadInterruptExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "In this example i will demonstrate thread interrupt";
    }

    @Override
    public String getName()
    {
        return "Thread Interrupt";
    }

    @Override
    public void runExample() {
        DummyThread dummyThread = new DummyThread();

        dummyThread.start();

        dummyThread.interrupt();

        if (dummyThread.isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Ej vi skal da ikke hører den igen..");
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
