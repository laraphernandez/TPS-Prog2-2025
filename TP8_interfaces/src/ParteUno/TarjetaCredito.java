package ParteUno;

public class TarjetaCredito implements PagoConDescuento {
    private String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con tarjeta " + numero);
    }

    // Aplicamos 10% de descuento en tarjeta
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9; // 10% off
    }
}