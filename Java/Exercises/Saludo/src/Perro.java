public class Perro extends Animal{

    private String sonido;

    public Perro(String nombre, int edad, String sonido) {
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
        
        System.out.println("El perro hace " + this.sonido);
    }

}
