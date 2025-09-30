package tp_2;

public class TestHora {
      public static void main(String[] args) {
        // Crear dos objetos de la clase Hora
        hora h1 = new hora(13, 45, 30);  // hora válida
        hora h2 = new hora(25, 70, -10); // hora inválida -> 00:00:00

        System.out.println("Hora 1: " + h1.mostrarHora());
        System.out.println("Hora 2: " + h2.mostrarHora());

        h1.setHora(15);
        h1.setMinutos(20);
        h1.setSegundos(50);

        System.out.println("Hora 1 después de cambios: " + h1.mostrarHora());

    }
}
    
