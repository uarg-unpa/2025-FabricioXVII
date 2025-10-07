public class ColaNombres {
    private String[] cola;   
    private int tamaño;      
    private int frente;      
    private int fin;        
    private int cantidad;    

    // Constructor
    public ColaNombres(int tamaño) {
        this.tamaño = tamaño;
        this.cola = new String[tamaño];
        this.frente = 0;
        this.fin = 0;
        this.cantidad = 0;
    }

    // Verifica si la cola está vacía
    public boolean estaVacia() {
        return cantidad == 0;
    }

    // Verifica si la cola está llena
    public boolean estaLlena() {
        return cantidad == tamaño;
    }

    // Encola un nuevo nombre
    public void encolar(String nombre) {
        if (estaLlena()) {
            System.out.println("La cola está llena. No se puede encolar más nombres.");
        } else {
            cola[fin] = nombre;
            fin = (fin + 1) % tamaño; 
            cantidad++;
            System.out.println(" Nombre \"" + nombre + "\" encolado correctamente.");
        }
    }

    // Desencola
    public String desencolar() {
        if (estaVacia()) {
            System.out.println(" La cola está vacía. No hay nombres para desencolar.");
            return null;
        } else {
            String nombre = cola[frente];
            frente = (frente + 1) % tamaño; // movimiento circular
            cantidad--;
            System.out.println(" Nombre \"" + nombre + "\" desencolado.");
            return nombre;
        }
    }

    
    public String peek() {
        if (estaVacia()) {
            System.out.println("La cola está vacía, no hay frente.");
            return null;
        } else {
            System.out.println("👀 Frente actual: \"" + cola[frente] + "\"");
            return cola[frente];
        }
    }

    // Muestra todos los nombres
    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.print(" Contenido actual de la cola: ");
            int indice = frente;
            for (int i = 0; i < cantidad; i++) {
                System.out.print(cola[indice] + " ");
                indice = (indice + 1) % tamaño; // movimiento circular
            }
            System.out.println();
        }
    }

    // Muestra el estado de la cola
    public void mostrarEstado() {
        System.out.println("Estado de la cola:");
        System.out.println(" - Vacía: " + estaVacia());
        System.out.println(" - Llena: " + estaLlena());
        System.out.println(" - Cantidad actual: " + cantidad);
    }
}

