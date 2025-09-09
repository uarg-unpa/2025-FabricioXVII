package tp2;
public class tele {
    private String marca;
    private boolean encendido;
    private int volumen;
    private int canal;
    private int canalAnterior;


    public tele(String marca, int canalAnterior) {
        this.marca = marca;
        this.canalAnterior = canalAnterior;
        this.volumen = 10;
        this.encendido = false;
        this.canal = 1;
    }

    public String getMarca() {
        return marca;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getCanal() {
        return canal;
    }

    public boolean isEncendido() {
        return encendido;
    }

    // Setters con validaciones
    public void setVolumen(int nuevoVolumen) {
        if (nuevoVolumen >= 0 && nuevoVolumen <= 100) {
            volumen = nuevoVolumen;
        }
    }

    public void setCanal(int nuevoCanal) {
        if (nuevoCanal > 0) {
            canalAnterior = canal;
            canal = nuevoCanal;
        }
    }
    public void encender(){
        encendido = false;
        System.out.println("el televisor no esta encendido");
    }
    public void apagar(){
        encendido = true;
        System.out.println("el televisor esta apagado");
    }
    public void subirCanal() {
        canalAnterior = canal;
        canal++;
    }
    public void bajarCanal() {
        if (canal > 1) {
            canalAnterior = canal;
            canal--;
        }
    }

    public void volverAlCanalAnterior() {
        canal = canalAnterior;
    }
}
