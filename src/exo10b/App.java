package exo10b;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Écrivez un programme Java qui inverse une chaîne de caractères.
        // Aide : Utiliser StringBuilder pour inverser la chaîne de manière efficace
        // https://www.codecademy.com/resources/docs/java/stringbuilder/reverse

        Scanner scanner = new Scanner(System.in);

        // Saisie de la chaîne de caractères
        System.out.print("Veuillez saisir une chaîne de caractères : ");
        String chaineOriginale = scanner.nextLine();

        // Inversion de la chaîne avec StringBuilder
        String chaineInverse = inverserChaineAvecStringBuilder(chaineOriginale);

        // Affichage du résultat
        System.out.println("Chaine originale : " + chaineOriginale);
        System.out.println("Chaine inversée : " + chaineInverse);


        // Fermeture du scanner
        scanner.close();
    }

    // Méthode pour inverser une chaîne avec StringBuilder
    private static String inverserChaineAvecStringBuilder(String chaine) {
        StringBuilder stringBuilder = new StringBuilder(chaine);
        return stringBuilder.reverse().toString();
    }

}
