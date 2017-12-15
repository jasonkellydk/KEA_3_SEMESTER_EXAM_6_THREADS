package dk.kea.examples.Thread;

public class SynchronizeThread extends Thread
{
    private Thread thread;

    private String threadName;

    PrintCount printCount;

    public SynchronizeThread (String thread, PrintCount printCount)
    {
        this.printCount = printCount;
        this.threadName = thread;
    }

    public void run()
    {
        synchronized(printCount) {
            printCount.printCount();
        }
    }

    public void start ()
    {
        System.out.println("Starting " +  threadName );
        System.out.println();
        if (thread == null) {
            thread = new Thread (this, threadName);
            thread.start ();
        }
    }
}
