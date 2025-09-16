public class personalcomputer{
    String marca;
    String procesador;
    double precio;
    int ram;

    public personalcomputer(String marca, String procesador, double precio, int ram){
        this.marca = marca;
        this.procesador = procesador;
        this.precio = precio;
        this.ram = ram;
    }
    //getters y setters 
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) { 
        this.ram = ram;
    }
    // metodos
    public void aplicarDescuento(double porcentaje){
        if(porcentaje > 0 && porcentaje <= 100){
            double descuento = (porcentaje / 100) * precio;
           precio -= descuento;
        }
        else {
            System.out.println("Porcentaje de descuento inválido.");
        }
    }
    public void actualizarRam(int nuevaRam){
        if(nuevaRam > 0){
            ram = nuevaRam;
        } else {
            System.out.println("La cantidad de RAM debe ser posible.");
        }
    }
    public String mostrarInfo(){
        return "Marca: " + marca + ", Procesador: " + procesador + ", Precio: $" + precio + ", RAM: " + ram + "GB";
    } 
    public int MayorRam (personalcomputer pc1, personalcomputer pc2){
        if(pc1.getRam() > pc2.getRam()){
            return pc1.getRam();
        } else if(pc2.getRam() > pc1.getRam()){
            return pc2.getRam();
        } else {
            return -1; 
        }
    }

}