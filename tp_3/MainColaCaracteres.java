import java.util.Scanner;

public class MainColaCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColaCaracteres cola = new ColaCaracteres(10); // tamaño máximo 10
        char opcion;

        do {
            System.out.println("\n--- MENÚ COLA DE COMANDOS ---");
            System.out.println("1. Encolar comando");
            System.out.println("2. Desencolar comando");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case '1':
                    System.out.print("Ingrese un carácter: ");
                    char c = scanner.next().charAt(0);
                    cola.encolar(c);
                    break;
                case '2':
                    cola.desencolar();
                    break;
                case '3':
                    cola.mostrarCola();
                    break;
                case '4':
                    System.out.println(" Saliendo");
                    break;
                default:
                    System.out.println(" esta Opción  es inválida.");
            }

        } while (opcion != '4');

        scanner.close();
    }
}