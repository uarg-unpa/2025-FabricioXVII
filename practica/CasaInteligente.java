public class CasaInteligente {
    public static void main(String[] args) {
        
        Lampara lampara1;

        lampara1 = new Lampara("Samsung", "apagado", 56, 30);

        System.out.println(lampara1.getNombre());
        System.out.println(lampara1.getEncendido());
        System.out.println(lampara1.getBrillo());
        System.out.println(lampara1.getConsumo());
        System.out.println(lampara1.brilloahorro());
    }
}
