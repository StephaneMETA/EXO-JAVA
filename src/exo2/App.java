package exo2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


    // Écrire un programme en Java qui permet de calculer la somme S=1+2+3+...+ 10. Utilisant la boucle for.

    Scanner scanner = new Scanner(System.in);

              // Initialiser la variable pour stocker la somme
              int somme = 0;

              // Utiliser une boucle for pour additionner les nombres de 1 à 10
              for (int j = 1; j <= 10; j++) {
                  somme += j; // Ajouter la valeur de i à la somme actuelle
              }
      
              // Afficher le résultat
              System.out.println("La somme de 1 à 10 est : " + somme);

    // Fermeture du scanner
    scanner.close();
        }
           
}
