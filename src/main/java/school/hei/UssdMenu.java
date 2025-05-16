package school.hei;

import java.util.Scanner;

public class UssdMenu {

    static void displayMainMenu(Scanner scanner) {
        System.out.println("1. Mvola");
        System.out.println("2. Mes offres");
        System.out.print("Sélectionnez une option : ");
        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                displayMvolaMenu(scanner);
                break;
            case "2":
                displayOffersMenu(scanner);
                break;
            default:
                System.out.println("Option invalide.");
        }
    }

    private static void displayMvolaMenu(Scanner scanner) {
        System.out.println("1. Transfert d'argent");
        System.out.println("2. Retrait d'argent");
        System.out.print("Sélectionnez : ");
        String subChoice = scanner.nextLine().trim();

        if ("1".equals(subChoice)) {
            System.out.println("a) Vers Mvola");
            System.out.println("b) Vers autres opérateurs");
        } else if ("2".equals(subChoice)) {
            System.out.println("a) Via un Cash point");
            System.out.println("b) Via un GAB");
        } else {
            System.out.println("Sous-option invalide.");
        }
    }

    private static void displayOffersMenu(Scanner scanner) {
        System.out.println("1. Acheter une offre");
        System.out.println("2. Envoyer une offre");
        System.out.print("Sélectionnez : ");
        String subChoice = scanner.nextLine().trim();

        if ("1".equals(subChoice)) {
            System.out.println("a) Via Mvola");
            System.out.println("b) Vita crédit principal");
        } else if ("2".equals(subChoice)) {
            System.out.println("a) Vers un abonné Yas");
            System.out.println("b) Vers un autre opérateur");
        } else {
            System.out.println("Sous-option invalide.");
        }
    }
}

