/*
 - Utwórz 4 zmienne całkowite (typu int) o nazwach: a, b, c, d i przypisz im wartości: 1, 2, 3, 4.
 - Utwórz 2 nowe zmienne całkowite (typu int) o nazwach: ab, cd. 
 Wartością ab ma być suma wartości zmiennych a i b, a wartością cd różnica wartości zmiennych c i d.
 - Utwórz 4 zmienne zmiennoprzecinkowe (typu double) o nazwach: e, f, g, h 
 i przypisz im wartości: 1.1, 2.2, 3.3, 4.4.
 - Utwórz 2 nowe zmienne zmiennoprzecinkowe (typu double) o nazwach: ef, gh. 
 Wartością ef ma być wynik mnożenia wartości zmiennych e i f, 
 a wartością gh wynik dzielenia wartości zmiennych g i h.
 - Jaka będzie reszta z dzielenia zmiennej ab przez zmienną b?
 - Utwórz 2 zmienne typu char o nazwach: i, j i przypisz im wartości: 'A', 'a'.
 - Sprawdź czy da się dodać do siebie zmienne i i j. Jeśli nie, to dlaczego? 
 Jeśli tak, to jaka będzie wartość?
 - Utwórz 2 zmienne typu String o nazwach: k, l i przypisz im wartości: "Ala", "ma".
 - Sprawdź czy da się dodać do siebie zmienne k i l. Jeśli nie, to dlaczego? 
 Jeśli tak, to jaka będzie wartość?
 - Utwórz 2 zmienne typu boolean o nazwach: m, n i przypisz im wartości: true, false.
 - Wyświetl w konsoli wartość wyrażenia m && n.
 - Wyświetl w konsoli wartość wszystkich zmiennych.
*/\
public class Zadanie1 {
   public static void main(String[] args) {
    int a = 1, b = 2, c = 3, d = 4;
    int ab = a + b;
    int cd = c - d;
    System.out.println("ab:  "  + a + "+" + b + "=" + ab);   
    System.out.println("cd:  " + c + "-" + d + "=" + cd);
    double e = 1.1, f = 2.2, g = 3.3, h = 4.4;
    double ef = e * f;
    double gh = g / h;  
    System.out.println("ef:  " + e + "*" + f + "=" + ef);
    System.out.println("gh:  " + g + "/" + h + "=" + gh + "\n");
    System.out.println("reszta z dzielenia zmiennej ab przez b:  " + ab%b + "\n");
    char i = 'a', j = 'A';
    System.out.println("i = " + i + ", j = " + j + ", nie mozna dodac i do j\n");
    String k = "Ala", l = "ma";
    String kl = k + l;
    System.out.println("k = " + k + ", l = " + l + ", mozna dodac k do l\n" + "kl = " + kl + "\n");
    boolean m = true, n = false;
    System.out.println("m && n = " + (m && n) + "\n");
   }
} 