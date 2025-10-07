import java.util.Locale;
import java.util.Scanner;

public class pruebaPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Permite leer decimales con punto

        // Ingreso de datos para la primera persona
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el sexo (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Ingrese el DNI:");
        int dni = scanner.nextInt();

        System.out.println("Ingrese la altura (ej: 1.75):");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese el peso (en kg):");
        double peso = scanner.nextDouble();

        // Crear objeto persona con los datos ingresados
        Persona p1 = new Persona(nombre, apellido, sexo, dni, altura, peso);

        // Mostrar datos de la persona
        System.out.println("\n=== Datos de la persona ===");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Apellido: " + p1.getApellido());
        System.out.println("DNI: " + p1.getDni());
        System.out.println("Altura: " + p1.getAltura());
        System.out.println("Peso: " + p1.getPeso());

        // Mostrar género
        p1.mostrarGenero();

        // Verificar peso final
        double resultado = p1.pesoFinal();
        if (resultado == 1) {
            System.out.println("La persona está en su peso normal (peso < 80kg).");
        } else {
            System.out.println("La persona tiene sobrepeso (peso >= 80kg).");
        }

        scanner.close();
    }
}
