package exo4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        // Une boutique propose à ses clients, une réduction de 15% pour les montants d’achat supérieurs à 200 Euros. 
        // Écrire un programme en Java permettant de saisir le prix total HT et de calculer le  montant TTC en prenant en compte la réduction et la TVA=20%. 
        
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrez le prix total HT : ");
    double prixHT = scanner.nextDouble();

    // Calculer le montant TTC en prenant en compte la réduction et la TVA
    double reduction = 0.15; // 15% de réduction
    double seuilReduction = 200; // Seuil pour la réduction
    double tva = 0.20; // Taux de TVA

    double montantTTC;
    if (prixHT > seuilReduction) {
        // Appliquer la réduction
        prixHT = prixHT - (prixHT * reduction);
    }

    // Calculer le montant TTC en ajoutant la TVA
    montantTTC = prixHT * (1 + tva);

    // Afficher le montant TTC
    System.out.println("Le montant TTC est : " + montantTTC + " Euros");

    // Fermeture du scanner
    scanner.close();
        }
           
}
