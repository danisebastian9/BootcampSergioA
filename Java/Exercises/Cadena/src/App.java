import java.util.Stack;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        balanceada();
    }

    public static void balanceada(){
        Stack<Character> pila = new Stack<>();
        
        //Ingreso datos
        Scanner dato = new Scanner(System.in);
        System.out.println("Digite la cadena de caracteres a validar: ");
        String cadena = dato.next();

        //Recorrer cadena
        for (int x=0; x<cadena.length(); x++) {
            char caracter =  cadena.charAt(x);
            if (caracter == '('){
                pila.push(caracter);
            }else if(caracter == ')') {
                if (pila.isEmpty() == false){
                    pila.pop();
                }
            }
        }
        if (pila.isEmpty()) {
            System.out.println("La cadena está balanceada");
        } else {
            System.out.println("La cadena no está balanceada");
        }

    }
}
