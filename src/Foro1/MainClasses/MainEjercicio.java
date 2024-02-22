package Foro1.MainClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEjercicio {

    Scanner scanner = new Scanner(System.in);
    int chosenMapOption = 0;
    Map<String, String> alumnos = new HashMap<>();
    String carnetAlumno;
    String nombreAlumno;

    public void mapPrincipal() {
        displayMapMenu();
        chosenMapOption = scanner.nextInt();
        if (chosenMapOption > 4 || chosenMapOption < 1)
            System.out.println("Hey nambe, van de 1 a 4");
        if (chosenMapOption == 1)
            ingresarAlumno();
    }

    private void displayMapMenu() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ ¿Qué operación quiere hacer?         ║");
        System.out.println("║                                      ║");
        System.out.println("║ 1) Ingresar un nuevo alumno          ║");
        System.out.println("║ 2) Buscar un alumno                  ║");
        System.out.println("║ 3) Eliminar un alumno                ║");
        System.out.println("║ 4) Mostrar alumnos                   ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
    private void ingresarAlumno() {

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ Ingrese el carnet del alumno         ║");
        System.out.println("╚══════════════════════════════════════╝");

        carnetAlumno = scanner.nextLine();

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ Ingrese el nombre del alumno         ║");
        System.out.println("╚══════════════════════════════════════╝");

        nombreAlumno = scanner.nextLine();

        alumnos.put(carnetAlumno, nombreAlumno);

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ Alumno ingresado exitosamente        ║");
        System.out.println("╚══════════════════════════════════════╝");

        mapPrincipal();
    }

    private void buscarAlumno() {

    }

    private void eliminarAlumno() {

    }

    private void mostrarAlumnos() {

    }
}
