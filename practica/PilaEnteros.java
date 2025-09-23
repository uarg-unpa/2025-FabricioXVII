public class PilaEnteros {
    private int[] elementos;
    private int cima;
    private final int MAX = 10;
    public PilaEnteros() {
        elementos = new int[MAX];
        cima = -1;
    }
    public PilaEnteros(int max) {
        elementos = new int[max];
    }
    public boolean esVacia() {
        return false;
    }
    public boolean esLlena() {
        if (cima == MAX - 1)
            return true;
        else
            return false;
    }
    public void meter(int elem) {
    }
    public int sacar(){
        return 0;
    }
}
