package Foro1.MainClasses;
import java.util.ArrayList;
import java.util.List;
public class ListEjemplo {
    public static void main(String[] args) {
        // Primero se crea un instancia de la clase ArrayList
        List<String> arrayList = new ArrayList<>();

        // Se agregan elementos a la lista
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");
        arrayList.add("Elemento 4");

        // Se muestra el contenido de la lista
        for (String elemento : arrayList) {
            System.out.println(elemento);
        }
    }
}
