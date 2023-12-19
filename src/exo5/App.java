package exo5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


    // Écrivez un programme Java qui demande son nom à l’utilisateur et qui affiche «Bonjour» à l'écran et le nom sur une ligne distincte.
        
    Scanner scanner = new Scanner(System.in);

          // Demander à l'utilisateur de saisir son nom
          System.out.print("Entrez votre nom : ");
          String nomUtilisateur = scanner.nextLine();
  
          // Afficher le message de salutation avec le nom sur une ligne distincte
          System.out.println("Bonjour !");
          System.out.println(nomUtilisateur);

    // Fermeture du scanner
    scanner.close();
        }
           
}
