public class Libro extends Producto{

    public Libro(String nombre, double precio) {
        super(nombre, precio);
        //TODO Auto-generated constructor stub
    }

    double calcularDescuento() {
        return getPrecio() * 0.1;
    }
    
}
