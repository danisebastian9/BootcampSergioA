public class Automovil extends Vehiculo{
    
    private int numPasajeros;

    public Automovil(String marca, String modelo, double valorComercial, int numPasajeros) {
        super(marca, modelo, valorComercial);
        this.numPasajeros = numPasajeros;
    }

    public Automovil(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public double Impuesto(){
        return getValorComercial() * 0.015;
    }


}
