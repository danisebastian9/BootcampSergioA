import java.util.Queue;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        varios();
    }


    public static void varios(){
        // 1. creamos la estructura tipo cola
        Queue<Integer> datos = new LinkedList<Integer>();
        // 2. llenar la cola con 10 números aleatorios entre 100 y 500
        for (int x=1; x<11;x++){
            datos.add((int)(Math.random() * 401) + 100);
        }
        System.out.println(datos);
        // 3. Imprimimos el tamaño
        System.out.println("El tamaño actual es: " + datos.size());
        // 4. Extraer dato de la cola
        int extraer = datos.poll();
        System.out.println("Usando el metodo Poll: " + extraer);
        System.out.println(datos);

        //5. Conocer primer elemento de la cola
        System.out.println("El primer elemento es: " + datos.peek());
    }
}
