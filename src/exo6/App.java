package exo6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


    // Écrivez un programme Java qui demande deux chiffres à un utilisateur, pour afficher la somme (addition), multiplier, soustraire, diviser et le reste.

    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrez le premier chiffre : ");
    double chiffre1 = scanner.nextDouble();

    System.out.print("Entrez le deuxième chiffre : ");
    double chiffre2 = scanner.nextDouble();

    // Calculs
    double somme = chiffre1 + chiffre2;
    double produit = chiffre1 * chiffre2;
    double difference = chiffre1 - chiffre2;
    double quotient = chiffre1 / chiffre2;
    double reste = chiffre1 % chiffre2;

    // Afficher les résultats
    System.out.println("Somme : " + somme);
    System.out.println("Produit : " + produit);
    System.out.println("Différence : " + difference);
    System.out.println("Quotient : " + quotient);
    System.out.println("Reste : " + reste);
    // Fermeture du scanner
    scanner.close();
        }
           
}
