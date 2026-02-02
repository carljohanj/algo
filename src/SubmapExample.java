import java.util.Map;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Ett snabbt exempel på hur en submap fungerar i en TreeMap.
 * Poängen här är att förstå att vi hämtar ut en submap på konstant
 * tid (eftersom allt metoden returnerar är en vy) samt att när vi
 * iterarar genom submapen så får vi tidskomplexiteten O(k) i stället
 * för O(n), där k är ett subset (dvs en delmängd) av n (som är den
 * totala datamängden).
 */
public class SubmapExample
{
    private static final TreeMap<Integer, String> tree = new TreeMap<>();
    private static final Random random = new Random();
    private static final String[] fruits = { "Apple", "Banana", "Cherry", "Strawberry", "Grapes", "Orange"};

    public static void main(String[] args)
    {
        fillMapRandomly(1000000);

        SortedMap<Integer, String> subTree = tree.subMap(500000, 500100); //O(1) tid, dvs konstant, eftersom vi bara hämtar ut en vy

        for (Map.Entry<Integer, String> entry : subTree.entrySet()) //O(k), eftersom vi bara itererar genom submap-spannet
        {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());  //allt på den här raden är O(1)
        }

        int searchKey = 500700;
        boolean submapContainsKey =  subTree.containsKey(searchKey); //O(log k), eftersom vi bara söker i submapen
        System.out.println("Searching... key " + searchKey + " exists: " + submapContainsKey);
    }

    /**
     * Hjälpmetod som fyller vår TreeMap med lite randomiserade värden
     * så att vi kan testa att hämta ut en submap från den.
     * @param n Antal randomiserade nyckel-värde-par som ska stoppas in i vår TreeMap.
     */
    public static void fillMapRandomly(int n)
    {
        for(int i = 0; i < n; i++)
        {
            int randomIndex = random.nextInt(fruits.length);
            String randomWord = fruits[randomIndex];
            tree.put(i, randomWord);
        }
    }

}
