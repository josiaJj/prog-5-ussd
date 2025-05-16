package school.hei;

import java.util.Scanner;

import static school.hei.UssdMenu.displayMainMenu;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code;
        do {
            System.out.print("Entrez code USSD (#111# pour démarrer) : ");
            code =  scanner.nextLine().trim();
            if ("#111#".equals(code)) {
                break;
            } else {
                System.out.println("Code USSD invalide.");
            }
        } while (!"#111#".equals(code));
        displayMainMenu(scanner);
        scanner.close();
    }

}