package ComparatorExample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        //Comparator med en lista:
        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 25));
        list.add(new Person("Buster", 19));
        list.add(new Person("Andreas", 50));
        list.add(new Person("Anna", 23));
        list.add(new Person("Bob", 25));

        list.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));

        for (Person p : list)
        {
            System.out.println(p.getName() + ", " + p.getAge());
        }

        //Comparator fungerar även med arrayer:
        Person[] persons =
                {
                        new Person("Alice", 25),
                        new Person("Buster", 19),
                        new Person("Andreas", 50),
                        new Person("Anna", 23),
                        new Person("Bob", 25)
                };

        Arrays.sort(persons, Comparator.comparing(Person::getAge).thenComparing(Person::getName));

        System.out.println("\n\n");

        for (Person p : persons)
        {
            System.out.println(p.getName() + ", " + p.getAge());
        }

    }
}
