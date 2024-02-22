package Foro1.MainClasses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CollectionEjemplo collectionEjemplo = new CollectionEjemplo();
        ListEjemplo listEjemplo = new ListEjemplo();
        MainEjercicio mainEjercicio = new MainEjercicio();
        MapEjemplo mapEjemplo = new MapEjemplo();

        int chosenOption = 0;

        displayMainMenu();

        chosenOption = scanner.nextInt();
        if (chosenOption > 5 || chosenOption < 1)
            System.out.println("Hey nambe, van de 1 a 5");
        if (chosenOption == 1)
            mainEjercicio.mapPrincipal();
        if (chosenOption == 2)
            collectionEjemplo.placeHolderCollection();
        if (chosenOption == 3)
            listEjemplo.placeHolderList();
        if (chosenOption == 4)
            mapEjemplo.placeHolderMap();

//        do {
//            System.out.println("El Pepe: "+chosenOption);
//
//        } while (chosenOption != 5);
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
