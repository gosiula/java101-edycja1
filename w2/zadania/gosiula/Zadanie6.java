/*
 Zadeklaruj zmienną boolean i ustaw ją na wartość true. 
 Następnie używając pętli while:
 Napisz program, który będzie pobierał od użytkownika liczby całkowite tak długo,
 aż użytkownik poda liczbę 0. Program powinien wyświetlić na ekranie sumę podanych liczb.
 */

import java.util.Scanner;
public class Zadanie6 
{
   public static void main(String[] args) 
   {
    boolean x = true;
    Scanner obj = new Scanner(System.in);
    System.out.println("Liczby beda wczytywane az do wpisania 0:");
    int n = 1, licznik = 0;
    while(n != 0)
        {
        n = obj.nextInt();
        licznik++;
        }
    System.out.println("ilosc wczytanych liczb: " + licznik);
    }
}