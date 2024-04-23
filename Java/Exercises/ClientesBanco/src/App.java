import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        simulacion1();
    }

    public static void simulacion1() {
        //Definimos la estructura tipo cola
        Queue<String> colaClientes = new LinkedList<String>(); 
        //Definimos una variable para capturar por teclado 
        
        try (Scanner datos = new Scanner(System.in)) {
            //Definimos una variable para validar cuando finaliza el programa
            boolean continuar = true;

            while(continuar){
                System.out.println("----------------------Menú----------------------");
                System.out.println("1. Agregar cliente a la Cola. ");
                System.out.println("2. Atender cliente ");
                System.out.println("3. Salir ");
                System.out.println("------------------------------------------------");

                System.out.println("Ingrese una opción: ");
                int opcion = datos.nextInt();
                datos.nextLine(); //Limpiamos el buffer del Scanner. 

                //Validamos la variable opcion: 
                switch (opcion) {
                    case 1:
                        System.out.println("Digite el nombre del cliente: ");
                        String nombreCliente = datos.next();
                        colaClientes.add(nombreCliente);
                        System.out.println(nombreCliente + "ha sido agregado a la cola del banco");
                        break;
                    case 2:
                        if(!colaClientes.isEmpty()){
                            String clienteAtendido = colaClientes.poll();
                            System.out.println("Atendiendo a: " + clienteAtendido);
                        }else{
                            System.out.println("No hay clientes para atender");
                        }
                        break;

                    case 3:
                        System.out.println("*****************************************");
                        System.out.println("Saliendo del programa");    
                        continuar = false;
                        System.out.println("*****************************************");
                        break;
                    default:
                        System.out.println("Opcion no valida, por favor ingrese un valor de 1 a 3");
                        break;
                }

            }
        }

    }
}
