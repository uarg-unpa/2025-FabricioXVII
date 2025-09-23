package tp2;

public class hora {
    private int hora;
    private int segundos;
    private int minutos;

    public hora(int hora, int minutos, int segundos) {
        if (eshoravalida(minutos, hora, segundos)) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    private boolean eshoravalida(int h, int m, int s) {
        return (h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
    }

    public void setHora(int nuevahora) {
        if (eshoravalida(nuevahora, this.minutos, this.segundos)) {
            this.hora = nuevahora;
        }
    }

    public void setMinutos(int nuevomin) {
        if (eshoravalida(this.hora, nuevomin, this.segundos)) {
            this.minutos = nuevomin;
        }
    }

    public void setSegundos(int nuevoseg) {
        if (eshoravalida(this.hora, this.minutos, nuevoseg)) {
            this.segundos = nuevoseg;
        }
    }
    public String mostrarHora(){
        return String.format("%02d:%02d:%02d",hora , minutos, segundos);
    }
}