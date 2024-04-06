public class Camion extends Vehiculo {

    private int ejes;

    public Camion(String marca, String modelo, double valorComercial) {
        super(marca, modelo, valorComercial);
    }

    public Camion() {
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public double Impuesto(){
        return getValorComercial() * 0.010;
    }
}
