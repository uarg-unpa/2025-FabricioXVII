import java.util.Scanner;

public class main {
    public main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un dia de la semana");
        String dia = scanner.nextLine();
        String l = "Lunes";
        String m = "Martes";
        String M = "Miercoles";
        String j = "Jueves";
        String v = "Viernes";
        if ("j".equalsIgnoreCase(dia)) {
            System.out.println("Hoy tengo programación");
        } else {
            System.out.println("Hoy no tengo programación");
        }
    }
}