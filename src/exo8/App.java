package exo8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Écrire un programme en Java qui  permet de saisir 10 entiers dans un tableau. 
        // - compter combien y a-t-il  d'éléments pairs et  impairs.
        // - mettre les éléments pairs dans  un tableau T1 et les éléments impaires dans un tableau T2. 

        Scanner scanner = new Scanner(System.in);

    
    
        // Déclaration des tableaux
        int[] tableauOriginal = new int[10];
        int[] tableauPairs;
        int[] tableauImpairs;

        // Saisie des entiers dans le tableau
        System.out.println("Veuillez saisir 10 entiers :");
        for (int i = 0; i < tableauOriginal.length; i++) {
            System.out.print("Entier " + (i + 1) + ": ");
            tableauOriginal[i] = scanner.nextInt();
        }

        // Compter le nombre d'éléments pairs et impairs
        int countPairs = 0;
        int countImpairs = 0;

        for (int nombre : tableauOriginal) {
            if (nombre % 2 == 0) {
                countPairs++;
            } else {
                countImpairs++;
            }
        }

        // Créer les tableaux T1 et T2
        tableauPairs = new int[countPairs];
        tableauImpairs = new int[countImpairs];

        int indexPairs = 0;
        int indexImpairs = 0;

        for (int nombre : tableauOriginal) {
            if (nombre % 2 == 0) {
                tableauPairs[indexPairs++] = nombre;
            } else {
                tableauImpairs[indexImpairs++] = nombre;
            }
        }

        // Afficher les résultats
        System.out.println("Nombre d'éléments pairs : " + countPairs);
        System.out.print("Tableau des éléments pairs : ");
        afficherTableau(tableauPairs);

        System.out.println("\nNombre d'éléments impairs : " + countImpairs);
        System.out.print("Tableau des éléments impairs : ");
        afficherTableau(tableauImpairs);



    // Fermeture du scanner
    scanner.close();
        }
     // Méthode pour afficher un tableau
     private static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i < tableau.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
           
}
