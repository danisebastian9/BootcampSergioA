import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        varios();
    }

    public static void varios() {
        // 1. Creamos una Pila
        Stack datos= new Stack();
        // 2. llenar la pila Datos con los primeros 10 numeros impares
        //datos.push(1);
       for (int x = 1; x<20; x+=2){
            datos.push(x);
       }
       System.out.println(datos);

       //3. Eliminamos el ultimo elemento ingresado
       datos.pop();
       System.out.println(datos);

       //4. Tamaño de la pila
       System.out.println(datos.size());

    }
}