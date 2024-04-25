public class ArbolBinario {

    private Nodo raiz;


    public ArbolBinario() {
        this.raiz = null;
    } 

    //Metodo para insertar nodos de manera recursiva:
    public Nodo insertarRecursivo(Nodo raiz, int dato){
        //Si el arbol es null, entonces creamos el primer Nodo o raiz del arbol
        if (raiz == null){
            raiz = new Nodo(dato);
            return raiz; 
        }
        // Si no es null, entonces cargamos el arbol con valores menores a la izquierda y valores mayores a la derecha
        if(dato < raiz.valor){
            raiz.izquierda = insertarRecursivo(raiz.izquierda, dato); 
        }else if(dato >= raiz.valor){
            raiz.derecha = insertarRecursivo(raiz.derecha, dato); 
        }
        return raiz;
    }
    
    public void insertar(int numero){
        this.raiz = insertarRecursivo(raiz, numero); 
    }

    // Inorden = Izquierda - Raiz - Derecha 

    public void imprimir_inorden_recursivo(Nodo raiz){
        if(raiz!=null){
            imprimir_inorden_recursivo(raiz.izquierda);
            System.out.println(raiz.valor);
            imprimir_inorden_recursivo(raiz.derecha);
        }
    }

    public void imprimir_inorden(){
        imprimir_inorden_recursivo(raiz);
    }    

    // Preorden = Raiz - Izquierda - Derecha

    public void imprimir_preorden_recursivo(Nodo raiz){
        if(raiz!=null){
            System.out.println(raiz.valor);
            imprimir_preorden_recursivo(raiz.izquierda);
            imprimir_preorden_recursivo(raiz.derecha);
        }
    }

    public void imprimir_preorden(){
        imprimir_preorden_recursivo(raiz);
    } 

    // Postorden = Izquierda - Derecha - Raiz 

    public void imprimir_postorden_recursivo(Nodo raiz){
        if(raiz!=null){
            imprimir_postorden_recursivo(raiz.izquierda);
            imprimir_postorden_recursivo(raiz.derecha);
            System.out.println(raiz.valor);
            
        }
    }

    public void imprimir_postorden(){
        imprimir_postorden_recursivo(raiz);
    } 

}
