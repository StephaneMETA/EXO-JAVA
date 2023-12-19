package exo9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Exercice 9 :
        // Écrivez un programme Java qui itère les entiers de 1 à 100 :
        // ‐ Pour les multiples de trois, imprimez "Fizz" au lieu du nombre et pour les multiples de cinq
        // imprimez "Buzz".
        // ‐ Pour les nombres qui sont des multiples de trois et cinq, imprimez "FizzBuzz".
        

        Scanner scanner = new Scanner(System.in);

    
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    // Fermeture du scanner
    scanner.close();
        }
           
}
