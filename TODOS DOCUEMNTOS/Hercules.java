import java.util.ArrayList;

    public class Hercules {
         public static void main(String[] args) { 
        // Creando una ArrayList genérica  
         ArrayList arlTest = new ArrayList(); 
 
        // Tamaño de arrayList  
        System.out.println("Tamaño de ArrayList en la creación:" + arlTest.size()); 
 
        // Permite agregarle algunos elementos  
        arlTest.add("D"); 
        arlTest.add("U"); 
        arlTest.add("K"); 
        arlTest.add("E");  
 
        // Vuelva a verificar el tamaño después de agregar elementos 
        System.out.println("Tamaño de ArrayList después de agregar elementos:" + arlTest.size());  
 
        // Mostrar todos los contenidos de ArrayList  
        System.out.println("Lista de todos los elementos:" + arlTest);  
 
        // Eliminar algunos elementos de la lista  arlTest.remove ("D");  
        System.out.println("Ver contenido después de eliminar un elemento:" + arlTest);  
 
        // Eliminar elemento por índice  arlTest.remove (2);  
        System.out.println("Ver contenido después de eliminar elemento por índice:" + arlTest);  
 
        // Verifique el tamaño después de eliminar los elementos  
        System.out.println("Tamaño de arrayList después de eliminar elementos:" + arlTest.size()); 
        System.out.println("Lista de todos los elementos después de eliminar elementos:" + arlTest);  
 
        // Verifica si la lista contiene "K"  
        System.out.println(arlTest.contains("K")); 
        //Tamaño de ArrayList en la creación: 0
        //Tamaño de ArrayList después de agregar elementos: 4
        //Lista de todos los elementos: [D, U, K, E]
        //Ver el contenido después de eliminar un elemento: [U, K, E]
        //Ver contenido después de eliminar elemento por índice: [U, K]
        //Tamaño de arrayList después de eliminar elementos: 2
        //Lista de todos los elementos después de eliminar los elementos: [U, K]
        //cierto
    }
}