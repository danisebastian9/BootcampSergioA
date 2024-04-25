public class App {
    public static void main(String[] args) throws Exception {
        crearArbol();

    }

    public static void crearArbol(){
        ArbolBinario arbol = new ArbolBinario();

        // INsertamos el primer Nodo del arbol (la raiz)

        arbol.insertar(50);
        // Insertamos otro nodo, se ubicara en la izquierda por ser menor a la raiz
        arbol.insertar(35);

        arbol.insertar(22);
        arbol.insertar(80);
        arbol.insertar(95);
        arbol.insertar(99);
        arbol.insertar(84);
        arbol.insertar(83);
        arbol.insertar(95);
        arbol.insertar(80);

        System.out.println("Recorrido del arbol en INORDEN: ");
        arbol.imprimir_inorden();
        System.out.println("Recorrido del arbol en PREORDEN: ");
        arbol.imprimir_preorden();
        System.out.println("Recorrido del arbol en POSTORDEN: ");
        arbol.imprimir_postorden();
    }
}
