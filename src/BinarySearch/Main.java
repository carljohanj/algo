public class Main
{
    public static void main(String[] args)
    {
        int[] array = { 2, 4, 6, 8, 19, 12, 33, 55, 66, 87, 102 };

        //På vilken indexplats finns värdet som vi letar efter??
        int result = BinarySearch.binarySearch(array, 8, 0, array.length - 1);
        System.out.println(result);
    }
}
