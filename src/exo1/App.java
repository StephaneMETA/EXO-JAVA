package exo1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


    // Exercice 1 :
    // Écrire un programme en Java qui demande l'âge d'un enfant et permet
    // d'informer de sa catégorie sachant que les catégories sont les suivantes:
    // "poussin de 6 a 7 ans"
    // "pupille de 8 a 9 ans "
    // "minime de 10 a 11 ans "
    // " cadet après 12 ans ".
    Scanner scanner = new Scanner(System.in);

    // Demander à l'utilisateur d'entrer l'âge de l'enfant
    System.out.println("Entrez l'âge de l'enfant : ");

    // Lire l'âge saisi par l'utilisateur
    int age = scanner.nextInt();

    // Utiliser switch expression pour déterminer la catégorie
    String categorie = switch (age) {
        case 6, 7 -> "poussin";
        case 8, 9 -> "pupille";
        case 10, 11 -> "minime";
        default -> "cadet (après 12 ans)";
     };
            
    // Afficher la catégorie
    System.out.println("La catégorie de l'enfant est : " + categorie);

    // Fermeture du scanner
    scanner.close();
        }
           
}
