package BinarySearch;

public class BinarySearch
{
    public static int binarySearch(int[] collection, int targetValue, int left, int right)
    {
        // 1. Basfall: när ska den stoppa om den inte hittar värdet i den här samlingen?
        if (left > right)
        {
            return -1;
        }

        // 2. Koden för algoritmen:
        int mid = (left + right) / 2;
        if (collection[mid] == targetValue)
        {
            return mid;
        }

        //Söker i vänstra halvan av samlingen om målvärdet är mindre än mittenvärdet:
        if (targetValue < collection[mid])
        {
            return binarySearch(collection, targetValue, left, mid - 1);
        }

        //Söker i den högra delen av samlingen om målvärdet inte är mindre än mitten
        // (Dvs: det måste vara större än mittenvärdet)
        return binarySearch(collection, targetValue, mid + 1, right);
    }
}
