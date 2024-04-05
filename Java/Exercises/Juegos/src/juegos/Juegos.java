import java.util.Scanner;

public class Juegos {

    public static void main(String[] args) {
        try (Scanner ingreso = new Scanner(System.in)) {
            System.out.println("************Tablero Principal**********");
            System.out.println("Seleccione una opción");
            System.out.println("1. Lanzar Dados");
            System.out.println("2. Adivinar el número");
            System.out.println("3. Salir");
            System.out.println("***************************************");

            int opcion = ingreso.nextInt();
            switch (opcion) {
                case 1:

                    //Creamos el objeto de la clase
                    JuegoDados lanzar = new JuegoDados();
                    System.out.println("Bienvenido al Juego de los Dados.");
                    System.out.println("Digite el nombre del Jugador No.1: ");
                    lanzar.setJugador1(ingreso.next());
                    System.out.println("Digite el nombre del Jugador No.2: ");
                    lanzar.setJugador2(ingreso.next());

                    //Usamos los métodos de la clase
                    lanzar.iniciar();
                    lanzar.jugar();
                    System.out.println("El Jugador " + lanzar.getJugador1() + " obtuvo " + lanzar.getDado1());
                    System.out.println("El Jugador " + lanzar.getJugador2() + " obtuvo " + lanzar.getDado2());

                    lanzar.finalizar();
                    if (lanzar.getGanador() == 1) {
                        System.out.println("Ganador: " + lanzar.getJugador1());
                    } else if (lanzar.getGanador() == 2) {
                        System.out.println("Ganador: " + lanzar.getJugador2());
                    } else {
                        System.out.println("Empate técnico");
                    }
                    break;
                case 2:
                    //Creamos el objeto de la clase
                    JuegoAdivinar juego1 = new JuegoAdivinar();
                    System.out.println("Bienvenido al Juego de adivinar un número.");
                    System.out.println("Digite el nombre del Jugador: ");
                    juego1.setJugador(ingreso.next());
                    System.out.println("-----------------------------------------------");
                    System.out.println("Tienes 3 intentos a partir de ahora: ");
                    System.out.println("-----------------------------------------------");
                    juego1.setIntentos(1);
                    //Usamos los métodos
                    juego1.iniciar();

                    while (juego1.getIntentos() < 4) {
                        System.out.println("Por favor, digite el número: ");
                        juego1.setNumero_jugador(ingreso.nextInt());
                        juego1.jugar();
                        System.out.println(juego1.getResultado());
                        juego1.setIntentos(juego1.getIntentos() + 1);
                    }

                    juego1.finalizar();
                    break;
                case 3:
                    System.out.println("Fin del juego.");

            }
        }
    }

}
