import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        colaTareas();
    }

    public static void colaTareas(){
        Queue<String> colaTareas = new LinkedList<>();

        Scanner datos = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("----------------------Menú----------------------");
            System.out.println("1. Agregar Tarea ");
            System.out.println("2. Realizar Siguiente Tarea ");
            System.out.println("3. Mostrar Tareas Pendientes ");
            System.out.println("4. Salir ");
            System.out.println("------------------------------------------------");

            System.out.println("Ingrese una opción: ");
            int opcion = datos.nextInt();
            datos.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre de Tarea: ");
                    String tareaNombre = datos.next();
                    System.out.println("Prioridad tarea: ");
                    String tareaPrioridad = datos.next();
                    colaTareas.add(tareaNombre + tareaPrioridad);
                    System.out.println("Tarea agregada: " + tareaNombre + "tareaPrioridad");
                    break;
                case 2: 

                case 3:
                    System.out.println("Tareas Pendientes: " + colaTareas);
                    break;
                case 4:
                    System.out.println("*****************************************");
                    System.out.println("Saliendo del programa");    
                    continuar = false;
                    System.out.println("*****************************************");
                break;    
                default:
                    break;
            }

        }
    }
}
