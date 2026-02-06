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
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Buster", 19));
        personList.add(new Person("Andreas", 50));
        personList.add(new Person("Anna", 32));
        personList.add(new Person("Anna", 23));
        personList.add(new Person("Bob", 25));

        personList.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        for (Person p : personList)
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
