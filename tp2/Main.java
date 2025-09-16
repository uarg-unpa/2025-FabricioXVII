package tp2;

public class Main {
    public static void main(String[] args) {
        Tele tv = new Tele("Samsung");

        tv.encender();

        tv.setCanal(5);
        System.out.println("Canal actual: " + tv.getCanal());

        tv.subirCanal();
        tv.subirCanal();
        System.out.println("Canal después de subir: " + tv.getCanal());

        tv.volverAlCanalAnterior();
        System.out.println("Canal después de volver: " + tv.getCanal());

        tv.subirVolumen();
        tv.subirVolumen();
        tv.bajarVolumen();
        System.out.println("Volumen actual: " + tv.getVolumen());

        tv.apagar();
    }
}
