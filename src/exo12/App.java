package exo12;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Exercice 12 : Nombre magique
        // Écrire un programme Java qui permet à l'utilisateur de deviner un nombre
        // choisi aléatoirement par l'ordinateur.
        // Le programme doit donner des indications à l'utilisateur sur si le nombre à
        // deviner est plus grand ou plus petit que la proposition de l'utilisateur.
        // Le jeu doit se poursuivre tant que l'utilisateur n'a pas correctement deviné
        // le nombre.

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        // Générer un nombre aléatoire entre 1 et 100
        int nombreMagique = random.nextInt(100) + 1;

        System.out.println("Bienvenue dans le jeu du Nombre Magique!");
        System.out.println("Devinez le nombre entre 1 et 100.");

        int proposition;
        int tentatives = 0;

        do {
            System.out.print("Votre proposition : ");
            proposition = scanner.nextInt();
            tentatives++;

            if (proposition < nombreMagique) {
                System.out.println("Le nombre magique est plus grand. Essayez à nouveau.");
            } else if (proposition > nombreMagique) {
                System.out.println("Le nombre magique est plus petit. Essayez à nouveau.");
            } else {
                System.out.println("Félicitations! Vous avez trouvé le nombre magique en " + tentatives + " tentatives.");
            }

        } while (proposition != nombreMagique);


        scanner.close();
    }


}
