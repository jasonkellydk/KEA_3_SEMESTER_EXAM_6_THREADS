package dk.kea.examples.Thread;

public class DummyThread extends Thread
{
    String importantInfo[] = {
            "Guitar spiller..",
            "Da jeg gik ud over Langebro",
            "En tidlig mandag morgen",
            "Hvis du tør - så kom med mig"
    };

    public void run()
    {
        for (String anImportantInfo : importantInfo) {
            //Print a message
            System.out.println(anImportantInfo);

            //Pause for 4 seconds
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
