package ComparatorPassedAsArgument;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

public class Main
{
    private static final String ANSI_PURPLE = "\u001b[38;2;219;160;219m";
    private static final String ANSI_BLUE = "\u001b[38;2;114;217;240m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws IOException
    {
        Path file = Path.of("src", "ComparatorPassedAsArgument", "employees.csv");
        Comparator<Person> byAge = Comparator.comparing(Person::getAge);
        Comparator<Person> byHighestSalary = Comparator.comparing(Person::getSalary).reversed();

        Person youngest = findPerson(file, byAge);
        Person highestPaid = findPerson(file, byHighestSalary);

        System.out.println("The youngest person is " + ANSI_PURPLE + youngest.getName() + ANSI_RESET +
                           " and the highest paid person is " + ANSI_BLUE + highestPaid.getName() + ANSI_RESET + ".");
        System.out.println(ANSI_PURPLE + youngest.getName() + ANSI_RESET + " is " + youngest.getAge() + " years old.");
        System.out.println(ANSI_BLUE + highestPaid.getName() + ANSI_RESET + " has a monthly salary of " + highestPaid.getSalary() + ".");
    }

    /**
     * Returns a Person from a list according to a custom sorting criteria. The sorting is made
     * in ascending order by default. To change this to descending order instead, chain a
     * .reversed() call to the Comparator that is being passed to the algorithm.
     * @param file The path of the file with the Person data
     * @param sortBy The sorting criteria for the algorithm
     * @return The Person that fits the sorting criteria
     * @throws IOException If the file can't be found or read, the method will throw an exception
     */
    public static Person findPerson(Path file, Comparator<Person> sortBy) throws IOException    //O(n) i tidskomplexitet
    {
        Person target = null;                           //O(1)

        for (String line : Files.readAllLines(file))    //O(n)
        {
            Person current = parsePerson(line);         //O(1)

            if (target == null || sortBy.compare(current, target) < 0)  //O(1)
            {
                target = current;                       //O(1)
            }
        }

        return target;                                  //O(1)
    }

    private static Person parsePerson(String employeeData)  //O(1) eftersom den gör samma mängd operationer oavsett vad strängen innehåller
    {
        String[] personInfo = employeeData.split(",");
        String name = personInfo[0];
        int age = Integer.parseInt(personInfo[1]);
        int salary = Integer.parseInt(personInfo[2]);

        return new Person(name, age, salary);
    }
}
