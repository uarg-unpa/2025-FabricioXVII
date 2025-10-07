 public class Lampara {
    String nombre;
    String encendido;
    int brillo;
    double consumo;


    public Lampara(String nombre, String encendido, int brillo, double consumo){
        this.nombre = nombre;
        this.encendido = encendido;
        this.consumo = consumo;
        this.brillo = brillo;
    }

    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEncendido(String e){
        this.encendido = e;
    }
    public String getEncendido(){
        return this.encendido;
    }

        public void setBrillo(int b){
        this.brillo = b;
    }
    public int getBrillo(){
        return this.brillo;
    }

        public void setConsumo(Double c){
        this.consumo = c;
    }
    public double getConsumo(){
        return this.consumo;
    }

    public boolean brilloahorro(){
        boolean resultado;
        if (this.brillo < 50) {
            resultado = true;
        }
        else{
            resultado = false;
        }
        return resultado;
    }

}
