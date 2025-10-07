public void encolar (int elem){
    elementos[fin] = elem;
    fin++; 
    // enocolar circular
    fin = (fin +1) %MAX;
}
public int desencolar (){
    int aux elementos[frente];
    for (int i = 0; i < fin-1; i++){
        elementos[i] = elementos[i+1];
    }
    fin--;
    return aux; 