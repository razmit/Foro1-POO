package Foro1.MainClasses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chosenOption = "0";
        do {
            displayMainMenu();

            chosenOption = scanner.nextLine();
            System.out.println("El Pepe: "+chosenOption);

        } while (chosenOption.equals(5));
    }

    private static void displayMainMenu() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ Bienvenido al menú de compilaciones  ║");
        System.out.println("║                                      ║");
        System.out.println("║ 1) Ejercicio principal               ║");
        System.out.println("║ 2) Ejemplo Collection                ║");
        System.out.println("║ 3) Ejemplo List                      ║");
        System.out.println("║ 4) Ejemplo Map                       ║");
        System.out.println("║ 5) Salir                             ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
}
