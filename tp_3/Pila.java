package tp_3;
public class Pila {
    private int[] elementos;
    private int tope;

    public Pila(int capacidad) {
        elementos = new int[capacidad];
        tope = -1;
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public void meter(int x) {
        if (tope < elementos.length - 1) {
            tope++;
            elementos[tope] = x;
        }
    }

    public int sacar() {
        if (estaVacia()) {
            return -1;
        }
        int elem = elementos[tope];
        tope--;
        return elem;
    }

    public int elementoCima() {
        if (estaVacia()) {
            return -1;
        }
        return elementos[tope];
    }

    public Pila copiar() {
        Pila copia = new Pila(elementos.length);
        Pila aux = new Pila(elementos.length);

        while (!estaVacia()) {
            aux.meter(sacar());
        }

        while (!aux.estaVacia()) {
            int elem = aux.sacar();
            meter(elem);
            copia.meter(elem);
        }

        return copia;
    }

    public int tamaño() {
        return tope + 1;
    }

    public int elementoEn(int i) {
        if (i >= 0 && i <= tope) {
            return elementos[i];
        }
        return -1;
    }
}
