public class Gato extends Animal{

    private String sonido;

    public Gato(String nombre, int edad, String sonido) {
        super(nombre, edad);
        this.sonido = sonido;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }


    public void sonido(){
        
        System.out.println("El gato hace " + this.sonido);
    }
    
}