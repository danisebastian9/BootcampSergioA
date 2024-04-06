public class Electrodomestico extends Producto{

    public Electrodomestico(String nombre, double precio) {
        super(nombre, precio);
        //TODO Auto-generated constructor stub
    }

    double calcularDescuento() {
        return getPrecio() * 0.05;
    }
}
