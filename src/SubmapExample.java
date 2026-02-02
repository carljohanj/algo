import java.util.Map;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class SubmapExample
{
    private static final TreeMap<Integer, String> tree = new TreeMap<>();
    private static final Random random = new Random();
    private static final String[] fruits = {"Apple", "Banana", "Cherry", "Strawberry", "Grapes", "Orange"};

    public static void main(String[] args)
    {
        fillMapRandomly(1000000);

        SortedMap<Integer, String> subMap = tree.subMap(500000, 500100); //O(1) tid, dvs konstant, eftersom vi bara
                                                                         //hämtar ut en vy

        for (Map.Entry<Integer, String> entry : subMap.entrySet()) //O(k), eftersom vi bara itererar genom submap-spannet
        {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        int searchKey = 500700;
        boolean submapContainsKey =  subMap.containsKey(searchKey); //O(log k)
        System.out.println("Searching... key " + searchKey + " exists: " + submapContainsKey);
    }

    public static void fillMapRandomly(int n)
    {
        for(int i = 0; i < n; i++)
        {
            String randomWord = fruits[random.nextInt(0, fruits.length)];
            tree.put(i, randomWord);
        }
    }

}
