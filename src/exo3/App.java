package exo3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


    // Écrire  un programme en Java  qui  permet d'échanger le contenu de deux entiers  A et B  saisis par l'utilisateur. et afficher ces entiers  après l’échange.

    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrez la valeur de A : ");
    int A = scanner.nextInt();
    System.out.print("Entrez la valeur de B : ");
    int B = scanner.nextInt();

    // Afficher les entiers avant l'échange
    System.out.println("Avant l'échange :");
    System.out.println("A = " + A);
    System.out.println("B = " + B);

    // Échanger les valeurs de A et B
    int temp = A;
    A = B;
    B = temp;

    // Afficher les entiers après l'échange
    System.out.println("Après l'échange :");
    System.out.println("A = " + A);
    System.out.println("B = " + B);

    // Fermeture du scanner
    scanner.close();
        }
           
}
