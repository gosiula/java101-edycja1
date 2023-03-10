/*
 Napisz program, który wypisze wszystkie liczby z zakresu 1-100, ale tylko te, 
 które są podzielne przez 3. 
 Wypisywanie liczb powinno się zakończyć, gdy program napotka liczbę 50.
 */

public class Zadanie8 
{
   public static void main(String[] args) 
   {
    System.out.println("Program wypisuje liczby od 1 do 50 podzielne przez 3: ");
    for(int i = 1; i < 100; i++)
    {
        if(i == 50) break;
        else if(i%3 == 0) System.out.println(i);
    }
   }
}