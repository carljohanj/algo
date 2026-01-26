public class StackOverFlow
{
    static int counter = 0;

    public static void main(String[] args)
    {
        callingMyself();
    }

    public static void callingMyself()
    {
        counter++;
        System.out.println(counter);
        callingMyself();
    }
}
