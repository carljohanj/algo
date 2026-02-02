/**
 * Ett exempel på en iterativ fibonaccialgoritm. Tekniken kallas för tabulering
 * och är ett exempel på dynamisk programmering. I stället för att spara be-
 * räkningarna i en array (som i fallet med RecursiveDynamicFibonacci) använder
 * vi tre variabler som vi ställer om för att kunna beräkna nästa tal.
 *
 * Den här algoritmen har tidskomplexiteten O(n) i stället för O(2^n).
 */
public class IterativeFibonacci
{
    static int counter = 1;

    public static void main(String[] args)
    {
         int n = 890;

        System.out.println("Det " + n + " fibonaccitalet är " + fib(n));
        System.out.println("Antal loopvarv för att beräkna talet: " + counter);
    }

    public static long fib(int n)
    {
        if (n <= 1) { return n; }

        //Fibonaccisekvensen: 0, 1, 1, 2, 3, 5, 8, 13, 21... osv

        //Vi ställer upp starvariablerna för de två första talen i fibonaccisekvensen, som är 0 och 1,
        //för att ha någonting att bygga resten av sekvensen med:
        long n1 = 0;
        long n2 = 1;

        //Variabel att ackumulera summan i:
        long sum = 0;

        for (int i = 2; i <= n; i++)
        {
            counter++;

            //Varje fibonaccital är summan av de två föregående: Fib(n) = Fib(n-1) + Fib(n-2)
            sum = n2 + n1;

            //Nu när vi röknat ut det aktuella fibonaccinumret och sparat det i sum måste vi ställa om
            //n1 och n2 så att de innehåller rätt värden för nästa loopvarv. Det här innebär att n1
            //får värdet av n2, och n2 får samma värde som sum just nu innehåller.
            n1 = n2;
            n2 = sum;
        }

        return sum;
    }

}
