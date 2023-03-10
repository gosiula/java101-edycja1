/*
 Napisz program, który pobierze od użytkownika 3 całkowite boki trójkąta i sprawdzi,
 czy da się z nich zbudować trójkąt. Jeśli da się, to program powinien sprawdzić,
 równoramienny czy różnoboczny. W przypadku, gdy trójkąt nie da się zbudować, 
 program powinien wyświetlić odpowiedni komunikat.
*/ 

import java.util.Scanner;
public class Zadanie3 
{
   public static void main(String[] args) 
   {
        Scanner obj = new Scanner(System.in);
        System.out.println("Wczytaj a:");
        int a = obj.nextInt();
        System.out.println("Wczytaj b:");
        int b = obj.nextInt();
        System.out.println("Wczytaj c:");
        int c = obj.nextInt();
        int licznik = 0;
        if(a >= b && a >= c) 
        {
            if(a<b+c) 
            {
                System.out.println("mozna utworzyc trojkat");
                licznik++;            
            }
            else System.out.println("nie mozna utworzyc trojkata");
        }
        else if(b >= a && b >= c) 
        {
            if(a<b+c) 
            {
                System.out.println("mozna utworzyc trojkat");
                licznik++;
            }
            else System.out.println("nie mozna utworzyc trojkata");
        }
        else if(c >= a && c >= b) 
        {
            if(a<b+c) 
            {
                System.out.println("mozna utworzyc trojkat");
                licznik++;
            }
            else System.out.println("nie mozna utworzyc trojkata");
        }
        if(licznik != 0)
        {
            if(a == b && b == c && a == c) System.out.println("trojkat jest rownoboczny");
            else if(a == b || b == c || c ==a) System.out.println("trojkat jest rownoramienny");
            else System.out.println("trojkat jest roznoboczny");
        }
   }
}