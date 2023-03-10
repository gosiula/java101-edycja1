/*
 Napisz program, który będzie pytał użytkownika o liczbę całkowitą tak długo, 
 aż podana liczba będzie większa od 100. 
 Program powinien wyświetlić na ekranie średnią arytmetyczną podanych liczb.
*/

import java.util.Scanner;
public class Zadanie7 
{
   public static void main(String[] args) 
   {
    Scanner obj = new Scanner(System.in);
    System.out.println("Liczby beda wczytywane az do wczytania liczby wiekszej niz 100:");
    int n = 1, licznik = 0, suma = 0;
    do
        {
           n = obj.nextInt(); 
           licznik++;
           suma += n;
        } while(n <= 100);
    System.out.println("srednia arytmetyczna podanych liczb: " + (suma/licznik));
   }
}