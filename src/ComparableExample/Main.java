package ComparableExample;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //Comparable med en lista:
        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 25));
        list.add(new Person("Buster", 19));
        list.add(new Person("Andreas", 50));
        list.add(new Person("Anna", 23));
        list.add(new Person("Bob", 25));

        //Vi behöver ingen Comparator här: Collections använder automatiskt vår compareTo()-metod internt nu
        Collections.sort(list);

        for (Person p : list)
        {
            System.out.println(p.getName() + ", " + p.getAge());
        }
    }
}
