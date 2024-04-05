import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
                
        FiguraGeometrica circulo = new Circulo(5.0);
        FiguraGeometrica cuadrado = new Cuadrado(4.0);
        FiguraGeometrica triangulo = new Triangulo(3.0, 6.0);

        List<FiguraGeometrica> figuras = Arrays.asList(circulo, cuadrado, triangulo);

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Area: " + figura.calcularArea());
        }
    }
}
