public class Estudiante extends Persona {

    private String curso;


    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void estudiar(){
        
        System.out.println("Esta realizando el curso: " + this.curso);
        //System.out.println("Hola mi nombre es " + nombre + "y tengo " + edad + "años. Me encuentro cursando el grado " + this.curso );
    }

}
