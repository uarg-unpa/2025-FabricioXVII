import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese 3 numeros");
        int Nro1 = scanner.nextInt();
        int Nro2 = scanner.nextInt();
        int Nro3 = scanner.nextInt();
        scanner.nextLine();
        if (Nro1 > Nro2 && Nro1 > Nro3) {
            System.out.println("el numero mas grande es el primero");
        }
        else
            if (Nro2 > Nro1 && Nro2 > Nro3){
                System.out.println("el numero mas grande es el segundo");
            }
            else
                System.out.println("el numero mas grande es el tercero");
        scanner.close();
    }
}