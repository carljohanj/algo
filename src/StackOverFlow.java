public class StackOverFlow
{
    static int counter = 0;

    public static void main(String[] args)
    {
        callingMyself();
    }

    //Rekursiv metod utan något basfall som gör att den stoppar:
    //Den kommer att fortsätta lägga activation frames på stacken tills
    //den flödar over och vi får ett Stack Overflow.
    public static void callingMyself()
    {
        counter++;
        System.out.println(counter);
        callingMyself();
    }
}
