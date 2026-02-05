/**
 * Ett exempel på hur Garbage Collection fungerar i Java. När programmet körs
 * kommer det att logga all GC-aktivitet i Run-fönstret. Se slides från
 * föreläsning 6 för en mer detaljerad beskrivning av vad som händer.
 *
 * Om utskrifterna inte syns så testa att lägga till -Xms128m -Xmx128m -Xlog:gc+heap
 * under VM Options i Run configurations.
 */
public class GarbageCollection
{

    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Program started");

        System.out.println("Creating big object:\n");

        byte[] bigObject = new byte[100 * 1024 * 1024]; //Steg 1: vi skapar ett objekt på ca 100 mb i minnet

        Thread.sleep(2000);  //Vi programmerar in en paus så vi hinner se minnesanvändningen innan garbage collection sker

        bigObject = null;   //Steg 2: vi tar bort referensen till objektet. Det kommer nu märkas för borttagning!
        System.out.println("\nBig object reference removed");
        System.out.println("Requesting garbage collection:\n");
        System.gc();  //Här föreslår vi att Java ska komma och hämta skräpet (dock inte säkert att programmet alltid lyder!)

        Thread.sleep(5000); //Ytterligare en paus på 5 sekunder så att garbage collection hinner aktiveras

        System.out.println("\nProgram finished");
    }
}