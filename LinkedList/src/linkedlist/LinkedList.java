package linkedlist;

public class LinkedList {

    public static void main(String[] args) {
        
        try {
            ListaEnlazada<String> lista = new ListaEnlazada<>();

            // 1 - Prueba para size y clear con una lista vacía
            System.out.println("Tamano inicial: " + lista.size());

            System.out.println("-----------------------------------------------------------");
            
            // 2 - Prueba para insert
            // La lista esperada quedaria asi: [Hola, Java, Mundo]
            lista.insert("Hola", 0);
            lista.insert("Mundo", 1);
            lista.insert("Java", 1); 

            System.out.println("Tamano despues de insertar: " + lista.size());
            
            System.out.println("-----------------------------------------------------------");

            // 3 - Prueba para get
            System.out.println("Elemento en 0: " + lista.get(0));
            System.out.println("Elemento en 1: " + lista.get(1));
            System.out.println("Elemento en 2: " + lista.get(2));
            
            System.out.println("-----------------------------------------------------------");

            // 4 - Prueba para remove
            // Aqui se elimina la palabra "Java"
            String eliminado = lista.remove(1); 
            System.out.println("Elemento eliminado: " + eliminado);
            System.out.println("Nuevo tamano: " + lista.size());
            System.out.println("Elemento en el indice 1 ahora: " + lista.get(1));
            
            System.out.println("-----------------------------------------------------------");

            // 5 - Prueba para invertir
            // La lista quedaria asi: [Hola, Mundo, Estructuras]
            lista.insert("Estructuras", 2); 
            System.out.println("Primer elemento antes de invertir: " + lista.get(0));
            
            // Aqui se debería invertir el orden
            lista.invertir(); 
            System.out.println("Primer elemento despues de invertir: " + lista.get(0));

            System.out.println("-----------------------------------------------------------");
            
            // 6 - Prueba para concatenar
            ListaEnlazada<String> otraLista = new ListaEnlazada<>();
            otraLista.insert("Prueba1", 0);
            otraLista.insert("Prueba2", 1);

            lista.concatenar(otraLista);
            System.out.println("Tamano total tras concatenar: " + lista.size());
            System.out.println("Ultimo elemento de la lista: " + lista.get(lista.size() - 1));
            
            System.out.println("-----------------------------------------------------------");

            // 7 - Prueba para clear
            lista.clear();
            System.out.println("Tamano despues de clear: " + lista.size());

        } catch (ListException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }
}
