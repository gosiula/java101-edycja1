
/*
 - Utwórz 2 zmienne całkowite (typu int) o nazwach: a, b i przypisz im wartości: 5, 10.
 - Utwórz 2 zmienne zmiennoprzecinkowe (typu double) o nazwach: c, d.
 - Zmiennej c przypisz wartość a podniesioną do potęgi b 
 (stosując odpowiednią metodę z klasy java.lang.Math).
 - Zmiennej d przypisz wartość pierwiastka kwadratowego c
 (stosując odpowiednią metodę z klasy java.lang.Math).
 - Wyświetl w konsoli wartość wszystkich zmiennych.
 - Utwórz zmienną całkowitą (typu int) o nazwie: e i przypisz jej wartość: -5.
 - Utwórz 2 zmienne zmiennoprzecinkowe (typu double) o nazwach: g, h.
 - Zmiennej g przypisz wartość bezwględną e (stosując odpowiednią metodę z klasy java.lang.Math).
 - Zmiennej h przypisz wartość 10.5001.
 - Teraz, zaokrąglij wartość zmiennej h do najbliższej liczby całkowitej 
 (stosując odpowiednią metodę z klasy java.lang.Math).
 - Wyświetl w konsoli wartość wszystkich zmiennych.
*/

import java.lang.Math;
public class Zadanie2 
{
   public static void main(String[] args) 
   {
    int a = 5, b = 10;
    double c = Math.pow(a, b);
    double d = c * c;
    System.out.println("a^b = " + c);
    System.out.println("c^2 = " + d + "\n");
    int e = -5;
    double g = Math.abs(e);
    System.out.println("g = " + g);
    double h = 10.5001;
    h = Math.round(h);
    System. out.println("h = " + h);
   }
}