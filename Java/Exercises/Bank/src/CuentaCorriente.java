public class CuentaCorriente extends CuentaBancaria{

    private double limite;

    public CuentaCorriente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public CuentaCorriente(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    
}
