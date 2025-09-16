
import java.util.Scanner;
public class testpersonalcomputer{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca de la primer PC:");
        String marca1 = scanner.nextLine();
        System.out.println("Ingrese el procesador de la primer PC:");
        String procesador1 = scanner.nextLine();
        System.out.println("Ingrese el precio de la primer PC:");
        double precio1 = scanner.nextDouble();
        System.out.println("Ingrese la RAM de la primer PC (en GB):");
        int ram1 = scanner.nextInt();
        scanner.nextLine(); 

        personalcomputer pc1 = new personalcomputer(marca1, procesador1, precio1, ram1);

        System.out.println("Ingrese la marca de la segunda PC:");
        String marca2 = scanner.nextLine();
        System.out.println("Ingrese el procesador de la  segunda PC:");
        String procesador2 = scanner.nextLine();
        System.out.println("Ingrese el precio de la segunda  PC:");
        double precio2 = scanner.nextDouble();
        System.out.println("Ingrese la RAM de  la segunda  PC (en GB):");
        int ram2 = scanner.nextInt();

        personalcomputer pc2 = new personalcomputer(marca2, procesador2, precio2, ram2);

        System.out.println("Información de la primer PC:");
        System.out.println(pc1.mostrarInfo());
        System.out.println("Información de la segunda PC:");
        System.out.println(pc2.mostrarInfo());

        System.out.println("Aplicando un 10% de descuento a la  primer PC...");
        pc1.aplicarDescuento(10);
        System.out.println("Nuevo precio de la  primer PC: $" + pc1.getPrecio());

        System.out.println("Actualizando la RAM de la segunda PC a 16GB...");
        pc2.actualizarRam(16);
        System.out.println("Nueva RAM de la segunda PC: " + pc2.getRam() + "GB");

        int mayorRam = pc1.MayorRam(pc1, pc2);
        if(mayorRam == -1){
            System.out.println("los dos PCs tienen la misma cantidad de RAM.");
        } else {
            System.out.println("El PC con mayor RAM tiene: " + mayorRam + "GB");
        }

        scanner.close();
    }
}