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
        Map<String, String> Asignatura = new HashMap<>();

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
                    String nombreAsignatura = JOptionPane.showInputDialog("Ingrese el nombre de la Asignatura: ");
                    String codigoAsignatura = JOptionPane.showInputDialog("Ingrese el código de la Asignatura: ");
                    if (nombreAsignatura.isEmpty() || codigoAsignatura.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error: Debe proporcionar tanto el nombre como el código de la Asignatura.");
                    } else {
                        Asignatura.put(codigoAsignatura, nombreAsignatura);
                        JOptionPane.showMessageDialog(null, "¡Asignaturas agregada con éxito!");
                    }
                    break;
                    
                case 2:
                    String AsignaturaEliminar = JOptionPane.showInputDialog("Ingrese el código de la Asignaturas a eliminar: ");
                    if (Asignatura.containsKey(AsignaturaEliminar)) {
                        int confirmacion = JOptionPane.showConfirmDialog(null,"¿Seguro quiere eliminar esta asignatura?", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        if (confirmacion == JOptionPane.YES_OPTION) {
                            Asignatura.remove(AsignaturaEliminar);
                            JOptionPane.showMessageDialog(null, "¡Asignatura eliminada con éxito!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La Asignatura no fue encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 3:
                    String AsignaturaBuscar = JOptionPane.showInputDialog("Ingrese el nombre de la Asignatura a buscar: ");
                    if (Asignatura.containsKey(AsignaturaBuscar)) {
                        JOptionPane.showMessageDialog(null, "Descripción de la Asignatura: " + Asignatura.get(AsignaturaBuscar));
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: La Asignaturas no fue encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 4:
                    if (Asignatura.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay Asignaturas inscritas.");
                    } else {
                        StringBuilder sb = new StringBuilder("Asignaturas Inscritas:\n");
                        for (Map.Entry<String, String> entry : Asignatura.entrySet()) {
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
