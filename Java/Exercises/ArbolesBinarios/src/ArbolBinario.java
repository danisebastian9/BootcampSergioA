public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public ArbolBinario() {
        this.raiz = null;
    } 

    //Metodo para insertar nodos de manera recursiva:
    public Nodo insertarRecursivo(Nodo raiz, int dato){
        //Si el arbol es null, entonces creamos el primer Nodo o raiz del arbol
        if (this.raiz == null){
            this.raiz = new Nodo(dato);
            return this.raiz; 
        }
        // Si no es null, entonces cargamos el arbol con valores menores a la izquierda y valores mayores a la derecha
        if(dato < this.raiz.valor){
            this.raiz.izquierda = insertarRecursivo(raiz.izquierda, dato); 
        }else if(dato >= this.raiz.valor){
            this.raiz.derecha = insertarRecursivo(raiz.derecha, dato); 
        }
        return raiz;
    }
    
    public void insertar(int numero){
        this.raiz = insertarRecursivo(raiz, numero); 
    }
}
