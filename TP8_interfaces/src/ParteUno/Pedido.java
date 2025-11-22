package ParteUno;

import java.util.ArrayList;

public class Pedido implements Pagable {
    // Lista de productos del pedido
    private ArrayList<Producto> productos;
    private String estado;
    private Cliente cliente;

    // Constructor
    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
        this.cliente = cliente;
    }

    // Agregar producto al pedido
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Implementamos calcular total sumando todos los productos
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    // Cambiar estado y notificar al cliente
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("Tu pedido cambio a: " + nuevoEstado);
    }

    public String getEstado() {
        return estado;
    }
}