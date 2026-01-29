public class RecursiveDynamicFibonacci
{
    static long[] memo;
    static int counter;

    public static void main(String[] args)
    {
        int n = 50;
        memo = new long[n + 1];
        System.out.println("Det " + n + " fibonaccitalet är " + fib(n));
        System.out.println("Antalet metodanrop för att beräkna " + n + " är " + counter);

    }

    public static long fib(int n)
    {
        counter++;

        //Vi börjar med att kolla om vi nått basfallet:
        if (n <= 1) { return n; }

        //Om inte, kolla om indexplatsen i memo redan innehåller ett beräknat värde
        // för fib(n). I så fall hämtar vi helt enkelt ut det värdet i stället för
        //att beräkna det igen:
        if (memo[n] != 0) { return memo[n]; }

        //Om värdet inte redan finns sparat beräknar vi det och stoppar in i arrayen:
        memo[n] = fib(n-1) + fib(n-2);


        return memo[n];
    }

}
