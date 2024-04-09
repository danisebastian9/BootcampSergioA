public class Nodo {
    private int valor;
    private Nodo siguiente;
    
    public Nodo() {
        this.valor = 0;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void imprimir(Nodo raiz, Nodo recorrido){
        recorrido = raiz;
        while (recorrido.getSiguiente()!= null){
            System.out.println(recorrido.getValor());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println(recorrido.getValor());
    }

    
    
}
