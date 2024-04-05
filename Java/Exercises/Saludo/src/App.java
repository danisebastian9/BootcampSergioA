public class App {
    public static void main(String[] args) throws Exception {
        Persona maestro = new Persona("Carlos", 45);
        maestro.saludar();


        Estudiante alumno = new Estudiante("Sebastian", 29, "Programación");
        alumno.estudiar();

        Perro labrador = new Perro("Max", 3, "Guuuau!");
        labrador.sonido();

        Gato angora = new Gato("Garfield", 2, "Miaau!");
        angora.sonido();
    }
}
