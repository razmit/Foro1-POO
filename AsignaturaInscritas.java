/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignaturainscritas;
import java.util.HashMap;
//import java.util.Scanner;
import java.util.Map;
import javax.swing.JOptionPane; //generar cuadro de dialogo para el usuario

/**
 *
 * @author ramir
 */
public class AsignaturaInscritas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> materias = new HashMap<>();

        while (true) {
            String inputMateria = JOptionPane.showInputDialog(
                    "1. Agregar Asignatura\n" +
                    "2. Eliminar Asignatura\n" +
                    "3. Buscar una Asignatura\n" +
                    "4. Mostar Asignaturas Inscritas\n" +
                    "5. Salir\n\n" +
                    "Ingrese una Opcion:");

            int opcion = Integer.parseInt(inputMateria.trim());

            switch (opcion) {
                 case 1:
                    String nombreMateria = JOptionPane.showInputDialog("Ingrese el nombre de la Asignatura: ");
                    String codigoMateria = JOptionPane.showInputDialog("Ingrese el código de la Asignatura: ");
                    if (nombreMateria.isEmpty() || codigoMateria.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error: Debe proporcionar tanto el nombre como el código de la Asignatura.");
                    } else {
                        materias.put(codigoMateria, nombreMateria);
                        JOptionPane.showMessageDialog(null, "¡Asignaturas agregada con éxito!");
                    }
                    break;
                    
                case 2:
                    String materiaEliminar = JOptionPane.showInputDialog("Ingrese el código de la Asignaturas a eliminar: ");
                    if (materias.containsKey(materiaEliminar)) {
                        int confirmacion = JOptionPane.showConfirmDialog(null,"¿Seguro quiere eliminar esta asignatura?", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        if (confirmacion == JOptionPane.YES_OPTION) {
                            materias.remove(materiaEliminar);
                            JOptionPane.showMessageDialog(null, "¡Asignaturas eliminada con éxito!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La Asignaturas no fue encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 3:
                    String materiaBuscar = JOptionPane.showInputDialog("Ingrese el nombre de la Asignaturas a buscar: ");
                    if (materias.containsKey(materiaBuscar)) {
                        JOptionPane.showMessageDialog(null, "Descripción de la Asignaturas: " + materias.get(materiaBuscar));
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: La Asignaturas no fue encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 4:
                    if (materias.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay Asignaturas inscritas.");
                    } else {
                        StringBuilder sb = new StringBuilder("Asignaturas Inscritas:\n");
                        for (Map.Entry<String, String> entry : materias.entrySet()) {
                            sb.append("Código: ").append(entry.getKey()).append(", Asignaturas: ").append(entry.getValue()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                    break;
               case 5:
                    JOptionPane.showMessageDialog(null, "¡Hasta Pronto!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, por favor intente de nuevo.");
            }
        }
    }
}