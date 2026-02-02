import java.util.Arrays;

/**
 * Ett exempel på hur skicka som värde och skicka som referens fungerar i Java.
 * Primitiva typer skickas alltid som värde (dvs deras värden kopieras). När vi
 * skickar en int till en metod är det inte samma int som vi ändrar värde för inuti
 * metoden utan en kopia.
 *
 * När vi däremot skickar en referens så pekar den mot samma datasamling som den
 * ursprungliga referensen. Det är därför vi inte behöver returnera en sorterad
 * array från passByReference(): sorteringen sker redan PÅ den ursprungliga arrayen
 * som finns någonstans på heapen.
 */
public class ValueVsReference
{
    public static void main(String[] args)
    {
        int myNumber = 10;
        passByValue(myNumber);
        System.out.println("Integern myNumber i main har värdet " + myNumber);

        int[] array = { 198, 2, 5, 205, 145, 34, 20, 10 };
        passByReference(array);

        for (int value : array)
        {
            System.out.println(value);
        }
    }

    public static void passByValue(int n)
    {
        n = n * 2;
        System.out.println("Den lokala kopian av myNumber har värdet " + n);
    }

    public static void passByReference(int[] array)
    {
        Arrays.sort(array);
    }
}
