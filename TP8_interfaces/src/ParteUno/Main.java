package ParteUno;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente1 = new Cliente("Juan Perez", "juan@mail.com");

        // Crear pedido
        Pedido pedido1 = new Pedido(cliente1);

        // Agregar productos
        pedido1.agregarProducto(new Producto("Notebook", 1500.0));
        pedido1.agregarProducto(new Producto("Mouse", 50.0));
        pedido1.agregarProducto(new Producto("Teclado", 80.0));

        // Calcular total
        System.out.println("Total del pedido: $" + pedido1.calcularTotal());

        // Procesar pago con tarjeta (con descuento)
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        double totalConDescuento = tarjeta.aplicarDescuento(pedido1.calcularTotal());
        tarjeta.procesarPago(totalConDescuento);

        // Cambiar estado del pedido
        pedido1.cambiarEstado("En camino");

        // Crear otro pedido con PayPal
        Cliente cliente2 = new Cliente("Maria Lopez", "maria@mail.com");
        Pedido pedido2 = new Pedido(cliente2);
        pedido2.agregarProducto(new Producto("Celular", 800.0));

        PayPal paypal = new PayPal("maria@mail.com");
        paypal.procesarPago(pedido2.calcularTotal());

        pedido2.cambiarEstado("Procesando");
    }
}