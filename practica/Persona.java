public class Persona {
    private String nombre;
    private String apellido;
    private char sexo;
    private int dni;
    private double altura;
    private double peso;

    public Persona(String nombre, String apellido, char sexo, int dni, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public int getDni() {
        return dni;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void mostrarGenero() {
        if (this.sexo == 'M' || this.sexo == 'm') {
            System.out.println("El género de la persona es masculino");
        } else if (this.sexo == 'F' || this.sexo == 'f') {
            System.out.println("El género de la persona es femenino");
        } else {
            System.out.println("Género no válido");
        }
    }


    public double pesoFinal() {
        if (this.peso < 80) return 1;
        else {
            return 2;
        }
    }
}
