package ParteUno;

public interface PagoConDescuento extends Pago {
    // Metodo adicional para aplicar descuento
    double aplicarDescuento(double monto);
}