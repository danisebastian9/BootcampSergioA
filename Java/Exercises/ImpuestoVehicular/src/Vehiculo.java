public class Vehiculo {

    private String marca;
    private String modelo;
    private double valorComercial;
    
    public Vehiculo(String marca, String modelo, double valorComercial) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorComercial = valorComercial;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    
    
}
