package tp_3;

public class pruebaPila {
    public static void main(String[] args) {
        Pila pila = new Pila(20);

        pila.meter(10);
        pila.meter(20);
        pila.meter(30);
        pila.meter(40);
        pila.meter(50);

        System.out.print("Pila inicial: ");
        for (int i = 0; i < pila.tamaño(); i++) {
            System.out.print(pila.elementoEn(i) + " ");
        }
        System.out.println();

        int X = pila.sacar();
        int segundo = pila.sacar();
        X = segundo;
        System.out.println("X = " + X);

        pila.meter(40);
        pila.meter(50);

        Pila aux = new Pila(20);
        aux.meter(pila.sacar());
        X = pila.elementoCima();
        pila.meter(aux.sacar());
        System.out.println("X = " + X);

        int N = 3;
        X = -1;
        for (int i = 1; i <= N; i++) {
            X = pila.sacar();
        }
        System.out.println("X = " + X);

        pila.meter(30);
        pila.meter(40);
        pila.meter(50);

        X = -1;
        aux = new Pila(20);
        for (int i = 1; i < N; i++) {
            aux.meter(pila.sacar());
        }
        X = pila.elementoCima();
        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }
        System.out.println("X = " + X);

        X = -1;
        while (!pila.estaVacia()) {
            X = pila.sacar();
        }
        System.out.println("X = " + X);

        pila.meter(10);
        pila.meter(20);
        pila.meter(30);
        pila.meter(40);
        pila.meter(50);

        X = -1;
        aux = new Pila(20);
        while (!pila.estaVacia()) {
            aux.meter(pila.sacar());
        }
        X = aux.elementoCima();
        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }
        System.out.println("X = " + X);

        Pila copia = pila.copiar();
        System.out.print("Copia de la pila: ");
        for (int i = 0; i < copia.tamaño(); i++) {
            System.out.print(copia.elementoEn(i) + " ");
        }
        System.out.println();

        System.out.print("Pila original: ");
        for (int i = 0; i < pila.tamaño(); i++) {
            System.out.print(pila.elementoEn(i) + " ");
        }
        System.out.println();
    }
}
