
public class RecursiveFibonacci
{
    static long counter = 0;

    public static void main(String[] args)
    {
        int n = 40; //Påminnelse: Högre nummer än 50 kommer ta väääldigt lång tid att beräkna!
        long result = fib(n);
        System.out.println("Det krävdes " + counter + " metodanrop för att beräkna" + "det " + n + ":e fibonaccinumret, som är " + result);
    }

    /**
     * Fibonaccisekvensen: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....
     * Varje tal är summan av de två föregående. Vi kan formulera den så här: Fib(n) = Fib(n-1) + Fib(n-2).
     * Den här algoritmen beräknar det n:e talet i fibonaccisekvensen. Exempel:
     * Om vi vill beräkna tal 6 (som är 8) anropar vi metoden med fib(6).
     * För att kunna beräkna fib(6) kommer den göra nya anrop för att beräkna fib(5) och fib(4).
     * Dessa kommer i gengäld göra nya anrop för att beräkna talen under sig, osv.
     * De rekursiva anropen slutar inte förrän en anropskedja har nått basfallet och
     * börjar returnera värden.
     * @param n Vilket tal i fibonaccisekvensen vi vill beräkna
     * @return Vilket värde det talet har
     */
    public static long fib(int n)
    {
        counter++;

        //Basfall: om n är 1 eller mindre returnerar vi det direkt:
        if (n <= 1) { return n; }

        //Annars gör vi två nya anrop för att beräkna n: ett för att beräkna n-1 och ett för att beräkna n-2
        return fib(n-1) + fib(n-2);
    }
}
