package exo11;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Écrivez une méthode qui renvoie le plus grand entier dans un tableau.
        // Exemple:
        // int[] tab = {1, 2, 9, 4};

        Scanner scanner = new Scanner(System.in);

        int[] tab = {1, 2, 9, 4};
        int resultat = trouverPlusGrand(tab);
        System.out.println("Le plus grand entier dans le tableau est : " + resultat);

        scanner.close();
    }

    // Méthode pour trouver le plus grand entier dans un tableau
    private static int trouverPlusGrand(int[] tableau) {
        // Vérifier si le tableau n'est pas vide
        if (tableau == null || tableau.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou nul.");
        }

        // Initialiser la variable pour stocker le plus grand entier
        int plusGrand = tableau[0];

        // Parcourir le tableau pour trouver le plus grand entier
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > plusGrand) {
                plusGrand = tableau[i];
            }
        }

        // Retourner le plus grand entier
        return plusGrand;
    }

}
