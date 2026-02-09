# Algoritmer & Datastrukturer VT26
![Mandelbrotfraktalen](assets/top-image2.jpg)

## Innehåll
- [Kodexempel](#kodexempel)
- [Föreläsningsslides](#presentationer)
- [Övriga filer](#andra-filer)
- [IntelliJ-plugins](#verktyg)
- [Resurser](#resurser)
  - [Länkar](#links)
  - [Videoklipp](#videor)

# <a id="kodexempel"></a>Kodexempel
Ni hittar dessa i mappen src:

| Filer / Paket                  | Beskrivning                                                                                                                                                                                                                                                                                     |
|--------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **BinarySearch**               | En binär sökalgoritm med rekursiv implementation. Binär sökning är ett exempel på en divide-and-conquer-algoritm som halverar problemet för varje steg.                                                                                                                                         |
| **ComparableExample**          | Exempel på hur vi kan implementera och använda Comparable i Java för att sortera objekt.                                                                                                                                                                                                        |
| **ComparatorPassedAsArgument** | Ett exempel på hur en Comparator kan sparas i en variabel och sen skickas till en metod. På det här viset kan man t.ex. låta en anropare av ett API berätta hur de vill att data ska sorteras.                                                                                                  |
| **ComparatorExample**          | Exempel på hur vi kan använda Comparator i Java för att sortera objekt på flera olika vis utan att behöva skriva egna sorteringsimplementationer. Paketet innehåller också ett exempel på hur man använder metodreferensoperatorn i Java.                                                       |
| **LinkedList**                 | En väldigt enkel implementation av en enkellänkad lista som använder sig av en rekursiv Node för att lägga in integers i en kedjeliknande struktur.                                                                                                                                             |
| **LinkedListGeneric**          | Samma lista, fast där både listan och Noden använder sig av generiska typer i stället för integers.                                                                                                                                                                                             |
| **FibonacciStackCounter**      | Ett program som genererar en enkel webbsida som visar hur en rekursiv fibonaccialgoritm pushar metodanrop på callstacken och i vilken ordning de sedan poppas igen. Kör det här programmet med några olika värden för att se hur trädet och callstacken växer.                                  |
| **GarbageCollection**          | Ett exempel som loggar hur garbage collection fungerar i Java när stora minnesresurser deallokeras.                                                                                                                                                                                             |
| **IntQueue**                   | En implementation av en kö som använder sig av samma Noder som den enkellänkade listan.                                                                                                                                                                                                         |
| **IntStack**                   | En stack som använder sig av en underliggande array för att spara värden.                                                                                                                                                                                                                       |
| **IterativeFibonacci**         | Exempel på dynamisk optimering av en iterativ fibonaccialgoritm.                                                                                                                                                                                                                                |
| **MyArrayList**                | Ett exempel på en (väldigt enkel) egenskapad ArrayList som kan lagra integers.                                                                                                                                                                                                                  |
| **RecursiveDynamicFibonacci**  | Effektivisering av en rekursiv fibonaccialgoritm (så kallad memoisering).                                                                                                                                                                                                                       |
| **RecursiveFibonacci**         | En rekursiv fibonaccialgoritm: varje anrop genererar två nya anrop till sig själv tills de når basfallet.                                                                                                                                                                                       |
| **SierpinskiTriangle**         | Ett program som ritar upp en rekursiv Sierpinskitriangel (där varje nytt anrop delar in varje triangel i tre mindre trianglar). Poängen med programmet är inte att ni ska förstå koden i den här klassen, utan att få en visuell bild av hur rekursion fungerar. Ctrl+C för att slå på/av färg. |
| **StackOverflow**              | Vad som händer när vi fortsätter lägga activation frames på callstacken utan något basfall.                                                                                                                                                                                                     |
| **SubmapExample**              | Ett exempel på hur subMap fungerar i en TreeMap och varför vi bryr oss om tidskomplexiteten O(k).                                                                                                                                                                                               |
| **ValueVsReference**           | Ett kort exempel som illustrerar skillnaden mellan att skicka variabler som värde och att skicka dem som referenser (detta sköts automatiskt i Java men det är bra att förstå vad som händer).                                                                                                  |


# <a id="presentationer"></a>Föreläsningsslides

Ni hittar dessa i mappen files:

| Filer                                    | Beskrivning                                                                                                                                                                                          |
|------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **0: Introduktion**                      | Presentationen från kursintroduktionen den 19/1.                                                                                                                                                     |
| **1: Tidskomplexitet**                   | Föreläsning från 19/1 där vi pratade om tidskomplexitet, Big O-notation, och algoritmer.                                                                                                             |
| **2: Listor och arrayer**                | Föreläsning från 22/1 där vi pratade om arrayer, ArrayList och LinkedList samt deras tidskomplexitet.                                                                                                |
| **3: Rekursion, callstack och minne**    | Föreläsning från 26/1 där vi gick genom rekursiva metoder, minneslagring, stack och heap, samt dynamisk programmering.                                                                               |
| **4: Abstrakta datatyper och generics**  | Föreläsning från 29/1 där vi gick genom abstrakta datatyper och generics. Vi byggde även små exempel på stackar, köer och länkade listor.                                                            |
| **5: Maps och sortering**                | Föreläsning från 2/2 där vi kikade på Map-interfacet i Java och de två implementationerna HashMap och TreeMap, samt olika sorteringsalgoritmer.                                                      |
| **6: Comparator och garbage collection** | Föreläsning från 5/2 där vi pratade om hur man kan sortera objekt med Comparator och Comparable. Vi tog även upp garbage collection och vad det har för implikationer i Java.                        |
| **7: Binära träd och grafer**            | Föreläsning från 9/2 där vi lärde oss om binära träd, grafstrukturer, hur stackar och köer kan användas för att besöka noder, och giriga algoritmer som alltid väljer det lokalt bästa alternativet. |



# <a id="andra-filer"></a>Övriga filer

Ni hittar dessa i mappen files:

| Filer                                 | Beskrivning                                                                                                           |
|---------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| **Fragor_och_svar_forelasning_3.pdf** | Lite övningsfrågor om rekursion, callstack och minne. Svar är inkluderade.                                            |
| **Lathund_Git.pdf**                   | Lite instruktioner och allmänna tips för hur man använder Git och versionshantering.                                  |
| **Recursive_fibonacci_tree.pdf**      | En detaljerad illustration av hur ett rekursivt fibonacciträd växer, hur det returnerar värden, och i vilken ordning. |

# <a id="verktyg"></a>IntelliJ-plugins
- **PDF Viewer.** https://plugins.jetbrains.com/plugin/14494-pdf-viewer
- **CSV Editor.** https://plugins.jetbrains.com/plugin/10037-csv-editor
- **CPU Usage Indicator.** https://plugins.jetbrains.com/plugin/8580-cpu-usage-indicator
- **Show System Memory.** https://plugins.jetbrains.com/plugin/28371-show-system-memory
- **One Dark Theme.** https://plugins.jetbrains.com/plugin/11938-one-dark-theme
- **Classic UI.** https://plugins.jetbrains.com/plugin/24468-classic-ui

# <a id="resurser"></a>Resurser

## <a id="links"></a>Länkar
- **Bra sammanfattning av binära sökträd**: https://hackajob.com/talent/blog/implementing-binary-search-trees-in-java
- **Om skillnaden (och likheterna) mellan träd och grafer**: https://www.jobaajlearnings.com/blog/binary-trees-vs-graphs-understanding-the-key-differences
- **Comparable och Comparator - hur vi jämför objekt**: https://medium.com/@bolot.89/comparator-vs-comparable-in-java-understanding-the-key-differences-ee2c8f8f45d9 
- **Grokking Algorithms (bra alternativ till kursboken)**: https://learning.oreilly.com/library/view/grokking-algorithms-second/9781633438538/
- **En bra breakdown av TreeMap**: https://ioflood.com/blog/java-treemap/
- **Bra sammanfattning av Generics**: https://docs.oracle.com/javase/tutorial/java/generics/index.html
- **Abstrakta datatyper**: https://www.geeksforgeeks.org/abstract-data-types/
- **Gif-animering av binär sökning**: https://www.mathwarehouse.com/programming/images/binary-vs-linear-search/linear-vs-binary-search-best-case.gif
- **Varför enhanced for-loopar är bra att använda**: https://www.geeksforgeeks.org/difference-between-for-loop-and-enhanced-for-loop-in-java/
- **The importance of Naive Solutions**: https://softwaredoug.com/blog/2022/11/14/importance-of-naive-solutions
- **Uppslagsverk för svenska it-ord**: https://it-ord.computersweden.se/

## <a id="videor"></a>Videoklipp

### Vecka 7:
- **Data Structures: Trees** (10 min)<br>
  [<img src="/assets/binary_search.png" alt="Binary Search Trees" width="500"/>](https://www.youtube.com/watch?v=oSWTXtMglKE)
- **Dijkstras algoritm: Computerphile** (10 min)<br>
  [<img src="https://img.youtube.com/vi/GazC3A4OQTE/hqdefault.jpg" alt="Dijkstra's Algorithm" width="500"/>](https://www.youtube.com/watch?v=GazC3A4OQTE)
- **Bredden först-sökning i en graf** (4 min)<br>
  [<img src="https://img.youtube.com/vi/HZ5YTanv5QE/hqdefault.jpg" alt="Dijkstra's Algorithm" width="500"/>](https://www.youtube.com/watch?v=HZ5YTanv5QE)

### Vecka 6: Maps och sortering
- **Hur man implementerar Comparable i en egen klass** (5 min)<br>
  [<img src="https://img.youtube.com/vi/wboqZ2dPDtQ/hqdefault.jpg" alt="Comparable interface" width="500"/>](https://www.youtube.com/watch?v=wboqZ2dPDtQ)
- **Merge Sort** (3 min)<br>
  [<img src="https://img.youtube.com/vi/4VqmGXwpLqc/hqdefault.jpg" alt="Merge Sort" width="500"/>](https://www.youtube.com/watch?v=4VqmGXwpLqc)
- **Quick Sort** (4 min)<br>
  [<img src="https://img.youtube.com/vi/Hoixgm4-P4M/hqdefault.jpg" alt="Quick Sort" width="500"/>](https://www.youtube.com/watch?v=Hoixgm4-P4M)
- **Selection sort** (3 min)<br>
  [<img src="https://img.youtube.com/vi/g-PGLbMth_g/hqdefault.jpg" alt="Selection Sort" width="500"/>](https://www.youtube.com/watch?v=g-PGLbMth_g)
- **Insertion sort** (2 min)<br>
  [<img src="https://img.youtube.com/vi/JU767SDMDvA/hqdefault.jpg" alt="Insertion Sort" width="500"/>](https://www.youtube.com/watch?v=JU767SDMDvA)
- **Bubble sort** (2 min)<br>
    [<img src="https://img.youtube.com/vi/xli_FI7CuzA/hqdefault.jpg" alt="Bubble Sort" width="500"/>](https://www.youtube.com/watch?v=xli_FI7CuzA)

### Vecka 5: Rekursion och minne
- **Generics in Java** (17 min)<br>
  [<img src="https://img.youtube.com/vi/K1iu1kXkVoA/hqdefault.jpg" alt="Generics in Java" width="500"/>](https://www.youtube.com/watch?v=K1iu1kXkVoA)
- **Stepping through Recursive Fibonacci** (8 min)<br>
[<img src="https://img.youtube.com/vi/zg-ddPbzcKM/hqdefault.jpg" alt="Stepping through recursive fibonacci" width="500"/>](https://www.youtube.com/watch?v=zg-ddPbzcKM)
- **David Brailsford om loopar och rekursion** (12 min)<br>
[<img src="https://img.youtube.com/vi/HXNhEYqFo0o/hqdefault.jpg" alt="Loops and Recursion" width="500"/>](https://www.youtube.com/watch?v=HXNhEYqFo0o)
- **Kort film om MC Escher** (4 min)<br>
[<img src="https://img.youtube.com/vi/Kcc56fRtrKU/hqdefault.jpg" alt="Kort film om MC Escher" width="500"/>](https://www.youtube.com/watch?v=Kcc56fRtrKU)
- **The magic of fibonacci numbers** (6 min)<br>
[<img src="https://img.youtube.com/vi/SjSHVDfXHQ4/hqdefault.jpg" alt="The magic of fibonacci numbers" width="500"/>](https://www.youtube.com/watch?v=SjSHVDfXHQ4)
- **Fractal Antennas** (3 min)<br>
[<img src="https://img.youtube.com/vi/1mPefLpoz50/hqdefault.jpg" alt="Fractal Antennas" width="500"/>](https://www.youtube.com/watch?v=1mPefLpoz50)


- **Fördjupning: Mandelbrotfraktalen** (16 min)<br>
[<img src="https://img.youtube.com/vi/FFftmWSzgmk/hqdefault.jpg" alt="Mandelbrotfraktalen" width="500"/>](https://www.youtube.com/watch?v=FFftmWSzgmk)
- **Fördjupning: Ackermann** (14 min)<br>
[<img src="https://img.youtube.com/vi/i7sm9dzFtEI/maxresdefault.jpg" alt="Fördjupning: Ackermannfunktionen" width="500"/>](https://www.youtube.com/watch?v=i7sm9dzFtEI)

### Vecka 4: Tidskomplexitet och Big O
- **The Secret Rules of Modern Living Algorithms** (58 min)<br>
[<img src="/assets/thumbnail_1.png" alt="The Secret Rules of Modern Algorithms" width="500"/>](https://www.youtube.com/watch?v=pxRlo1z2TIQ)
- **Program som sys in i minnet för Apollodatorn** (2 min)<br>
[<img src="https://img.youtube.com/vi/P12r8DKHsak/hqdefault.jpg" alt="Core rope memory" width="500"/>](https://www.youtube.com/watch?v=P12r8DKHsak)
- **Introduktion till Big O-notation och tidskomplexitet** (36 min)<br>
[<img src="https://img.youtube.com/vi/D6xkbGLQesk/hqdefault.jpg" alt="Tidskomplexitet och Big O" width="500"/>](https://www.youtube.com/watch?v=D6xkbGLQesk)