public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    } 

    @Override
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

}