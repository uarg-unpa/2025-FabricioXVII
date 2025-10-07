public class ColaCaracteres {
    private char[] cola;  
    private int tamaño;    
    private int finalCola; 

    // Constructor
    public ColaCaracteres(int tamaño) {
        this.tamaño = tamaño;
        this.cola = new char[tamaño];
        this.finalCola = 0;
    }

    // Verifica si la cola está vacía
    public boolean estaVacia() {
        return finalCola == 0;
    }

    // Verifica si la cola está llena
    public boolean estaLlena() {
        return finalCola == tamaño;
    }

    // Encola un nuevo carácter
    public void encolar(char c) {
        if (estaLlena()) {
            System.out.println(" La cola está llena. No se puede encolar más comandos.");
        } else {
            cola[finalCola] = c;
            finalCola++;
            System.out.println(" Comando '" + c + "' encolado correctamente.");
        }
    }

    // Desencola (elimina) el primer carácter y lo retorna
    public char desencolar() {
        if (estaVacia()) {
            System.out.println(" La cola está vacía. No hay comandos para eliminar.");
            return '\0'; // carácter nulo
        } else {
            char frente = cola[0];
            // Desplazamiento hacia la izquierda
            for (int i = 0; i < finalCola - 1; i++) {
                cola[i] = cola[i + 1];
            }
            finalCola--;
            System.out.println("🗑️ Comando '" + frente + "' desencolado.");
            return frente;
        }
    }

    // Muestra los elementos actuales de la cola
    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.print("Contenido actual de la cola: ");
            for (int i = 0; i < finalCola; i++) {
                System.out.print(cola[i] + " ");
            }
            System.out.println();
        }
    }
}
 