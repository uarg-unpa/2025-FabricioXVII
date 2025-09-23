import java.util.Scanner; 
public class MenuPila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilaEnteros pila = new PilaEnteros();
        int opcion;

        do {
            System.out.println("=== Menu de la Pila===");
            System.out.println("1. Meter  elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Verificar estado(vacia/llena)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a meter: ");
                    int elem = scanner.nextInt();
                    pila.meter(elem);
                    System.out.println("Elemento " + elem + " metido en la pila.");
                    break;
                case 2:
                    if (pila.esVacia()) {
                        int sacado = pila.sacar();
                        System.out.println("Elemento " + sacado + " sacado de la pila.");
                    } else {
                        System.out.println("La pila esta vacia, no se puede sacar elemento.");
                    }
                    break;
                case 3:
                    if (pila.esVacia()) {
                        System.out.println("La pila esta vacia.");
                    } else if (pila.esLlena()) {
                        System.out.println("La pila esta llena.");
                    } else {
                        System.out.println("La pila tiene espacio disponible.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
                }
            } while (opcion != 0);
        scanner.close();
        }
    }

