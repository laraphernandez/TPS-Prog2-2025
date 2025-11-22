package ParteUno;

public class Producto implements Pagable {
    // Atributos del producto
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Implementamos el metodo de la interfaz
    @Override
    public double calcularTotal() {
        return precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}