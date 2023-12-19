package exo10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Exercice 10 :
        // Écrivez un programme Java qui inverse une chaîne de caractères.

        Scanner scanner = new Scanner(System.in);

             // Saisie de la chaîne de caractères
             System.out.print("Veuillez saisir une chaîne de caractères : ");
             String chaineOriginale = scanner.nextLine();
     
             // Inversion de la chaîne
             String chaineInverse = inverserChaine(chaineOriginale);
     
             // Affichage du résultat
             System.out.println("Chaine originale : " + chaineOriginale);
             System.out.println("Chaine inversée : " + chaineInverse);
     
        // Fermeture du scanner
        scanner.close();
    }
    // Méthode pour inverser une chaîne
    private static String inverserChaine(String chaine) {
        char[] caracteres = chaine.toCharArray();
        int debut = 0;
        int fin = chaine.length() - 1;

        while (debut < fin) {
            // Échange des caractères aux positions début et fin
            char temp = caracteres[debut];
            caracteres[debut] = caracteres[fin];
            caracteres[fin] = temp;

            // Déplacement des indices
            debut++;
            fin--;
        }

        return new String(caracteres);
    }

}
