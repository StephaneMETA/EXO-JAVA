package exo7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


// Écrivez un programme Java qui accepte trois nombres et affiche "Tous les nombres sont égaux" si les trois nombres sont égaux, "Tous les nombres sont différents" si les trois nombres sont différents et sinon "Ni tous ni égaux ni différents".
    Scanner scanner = new Scanner(System.in);

    
    // Saisie des trois nombres
    System.out.print("Entrez le premier nombre : ");
    int nombre1 = scanner.nextInt();

    System.out.print("Entrez le deuxième nombre : ");
    int nombre2 = scanner.nextInt();

    System.out.print("Entrez le troisième nombre : ");
    int nombre3 = scanner.nextInt();

    // Comparaison des nombres
    if (nombre1 == nombre2 && nombre2 == nombre3) {
        System.out.println("Tous les nombres sont égaux.");
    } else if (nombre1 != nombre2 && nombre2 != nombre3 && nombre1 != nombre3) {
        System.out.println("Tous les nombres sont différents.");
    } else {
        System.out.println("Ni tous ni égaux ni différents.");
    }



    // Fermeture du scanner
    scanner.close();
        }
           
}
