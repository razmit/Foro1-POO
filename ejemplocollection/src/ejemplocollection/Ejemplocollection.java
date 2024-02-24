
package ejemplocollection;


import java.util.ArrayList; 
import java.util.Collection; 
import java.util.Scanner;
        
public class Ejemplocollection {

    public static void main(String[] args) {
        
        Collection medicationInventory = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
          
        medicationInventory.add("Acetaminofen");
        medicationInventory.add("Ambrosol");
        medicationInventory.add("Clofenamida");
        medicationInventory.add("Naproxeno"); 
        medicationInventory.add("Bevacizumab");
        medicationInventory.add("Dabrafenib Mesylate");
        medicationInventory.add("Temozolomide");
        medicationInventory.add("Everolimus");

        System.out.println("Bienvenido al inventario de Farmacia especializada");
        System.out.println("Seleccione la accion que quiere realizar");
        System.out.println("1 - Mostrar inventario");
        System.out.println("2 - Mostrar medicamentos para el cancer");
        System.out.println("3 - Buscar medicamento");
        
        String option = entrada.nextLine();        
        int i = Integer.parseInt(option);

        switch(i) {
         
          case 1:
            System.out.println("Medicamento : " +medicationInventory.toString());
            break;
          case 2:
              
            medicationInventory.remove("Acetaminofen");
            medicationInventory.remove("Ambrosol");
            medicationInventory.remove("Clofenamida");
            medicationInventory.remove("Naproxeno");
            System.out.println("Medicamento para el tratamiento del cancer: " +medicationInventory.toString());
            break;
          case 3:
            System.out.println("Ingrese el nombre del medicamento"); 
            String me = entrada.nextLine();  
            boolean result = medicationInventory.contains(me);
            if(result==true){
                System.out.println("El medicamento se encuentra en el inventario");
            }
            if(result==false){
                System.out.println("El medicamento no se encuentra en el inventario");
            }
            break;
          default:
            System.out.println("Usted no ingreso una opcion valida");
        }
    }
    
}
