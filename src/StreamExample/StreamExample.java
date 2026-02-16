package StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample
{
    public static void main(String[] args)
    {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Birger", 36),
                new Person("Johan", 44),
                new Person("Hanna", 24)
        ));

        //Vi vill sortera ut namnen, behålla de som är exakt fem tecken,
        //förvandla dem till uppercase, samt skriva ut dem

        //Imperativt sätt att programmera det här programmet:
        List<String> names = new ArrayList<>();

        for (Person person : persons)
        {
            names.add(person.getName());
        }

        for (String name : names)
        {
            if (name.length() == 5)
            {
                String upper = name.toUpperCase();
                System.out.println(upper);
            }
        }

        //Streams som gör exakt samma sak:
        persons.stream().map(Person::getName).filter((s) -> s.length() == 5)
                .map(String::toUpperCase).forEach(System.out::println);

    }
}