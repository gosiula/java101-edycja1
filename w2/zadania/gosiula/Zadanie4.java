/* 
 Używając instrukcji wyboru switch:
 Napisz program, który pobierze od użytkownika liczbę całkowitą i wyświetli 
 na ekranie nazwę kwartału odpowiadającego tej liczbie. Jeśli użytkownik poda 
 liczbę spoza zakresu 1-12, program powinien wyświetlić odpowiedni komunikat.

 Używając instrukcji wyboru switch expression:
 Napisz program, który pobierze od użytkownika liczbę całkowitą i wyświetli 
 na ekranie dzień tygodnia odpowiadający tej liczbie. Jeśli użytkownik poda liczbę 
 spoza zakresu 1-7, program powinien wyświetlić odpowiedni komunikat.
*/

import java.util.Scanner;
public class Zadanie4 
{
   public static void main(String[] args) 
   {
    Scanner obj = new Scanner(System.in);
    System.out.println("Wczytaj numer miesiaca:");
    int miesiac = obj.nextInt();
    switch(miesiac)
    {
        case 1, 2, 3:
        {
            System.out.println("miesiac miesci sie w pierwszym kwartale");
            break;
        }
        case 4, 5, 6:
        {
            System.out.println("miesiac miesci sie w drugim kwartale");
            break;
        }
        case 7, 8, 9:
        {
            System.out.println("miesiac miesci sie w trzecim kwartale");
            break;
        }
        case 10, 11, 12:
        {
            System.out.println("miesiac miesci sie w czwartym kwartale");
            break;
        }
        default:
        {
            System.out.println("nie ma takiego miesiaca");
            break;
        }
    }
    System.out.println("Wczytaj numer dnia tygodnia:");
    int tydzien = obj.nextInt();
    switch(tydzien)
    {
        case 1:
        {
            System.out.println("dzien to poniedzialek");
            break;
        }
        case 2:
        {
            System.out.println("dzien to wtorek");
            break;
        }
        case 3:
        {
            System.out.println("dzien to sroda");
            break;
        }
        case 4:
        {
            System.out.println("dzien to czwartek");
            break;
        }
        case 5:
        {
            System.out.println("dzien to piatek");
            break;
        }
        case 6:
        {
            System.out.println("dzien to sobota");
            break;
        }
        case 7:
        {
            System.out.println("dzien to niedziela");
            break;
        }
        default:
        {
            System.out.println("nie ma takiego dnia tygodnia");
            break;
        }
    }
   }
}