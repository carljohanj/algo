package LambdaExample;

public class Main
{
    public static void main(String[] args)
    {
        //Vi kan skapa variabler och spara lambdas i:
        //(Operation blir datatypen eftersom det är det funktionella interfacet vi vill använda)
        Operation add = (x, y) -> x + y;
        Operation multiply = (x, y) -> x * y;

        //Om vi anropar apply() på dessa variabler med samma värden kommer de nu skriva ut olika saker:
        System.out.println(add.apply(5, 5));        //Bör bli 10 (5+5)
        System.out.println(multiply.apply(5, 5));   //Bör bli 25 (5*5)


        //Vi kan även skapa en metod som tar två ints och en Operation som argument, och då skicka in
        // en lambda som bestämmer hur de två värdena ska hanteras:
        System.out.println(execute(5, 10, (x, y) -> x - y));    //Bör bli -5

    }

    /**
     * Metod som tar en Operation som argument, som bestämmer hur de två talen ska hanteras
     * @param a Det första heltalet
     * @param b Det andra heltalet
     * @param lambda Funktionellt interface som beskriver vad som ska göras med de två heltalen
     * @return  Resultatet av operationen beskriven av lambdan vi skickar som argument
     */
    public static int execute(int a, int b, Operation lambda)
    {
        return lambda.apply(a, b);
    }

}
