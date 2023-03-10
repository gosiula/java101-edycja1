/*
 Używając pętli for:
 Napisz program, który pobierze od użytkownika dodatnią liczbę całkowitą n 
 i wyświetli na ekranie wszystkie liczby od 1 do n.
 - Następnie program powinien wyświetlić wszystkie liczby od n do 1.
 - Następnie program powinien wyświetlić wszystkie liczby od 1 do n, 
 ale tylko te, które są podzielne przez 3 lub 5.
 - Następnie program powinien wyświetlić wszystkie liczby od 1 do n, 
 ale tylko te, które są podzielne przez 3 lub 5, ale nie jednocześnie przez oba.
*/

import java.util.Scanner;
public class Zadanie5 
{
   public static void main(String[] args) 
   {
    Scanner obj = new Scanner(System.in);
    System.out.println("Wczytaj liczbe n:");
    int n = obj.nextInt();
    System.out.println("wszystkie liczby od 1 do n:");
    for(int i = 1; i <= n; i++)
    {
      System.out.println(i);
    }
    System.out.println("liczby od 1 do n podzielne przez 3 lub 5:");
    for(int i = 1; i <= n; i++)
    {
      if(i%3 == 0 || i%5 == 0) System.out.println(i);
    }
    System.out.println("liczby od 1 do n podzielne przez 3 lub 5 (ale nie 3 i 5 naraz):");
    for(int i = 1; i <= n; i++)
    {
      if(i%3 == 0 && i%5 == 0);
      else if(i%3 == 0 || i%5 == 0) System.out.println(i);
    }
   }
}