import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Producto prodLibro = new Libro("Java Programming", 20.00);
        Producto prodElectrodomestico = new Electrodomestico("Refrigerador", 500.00);

        List<Producto> listProductos = Arrays.asList(prodLibro,prodElectrodomestico);

        for (Producto iteraproducto : listProductos) {
            System.out.println("Descuento para " + iteraproducto.getNombre() + ": " + iteraproducto.calcularDescuento());
        }

    }
}
