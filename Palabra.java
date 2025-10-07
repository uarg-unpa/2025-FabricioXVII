import java.util.Scanner;

public class Palabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        String invertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        System.out.println("Palabra invertida: " + invertida);
    }
}

