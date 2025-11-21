import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Agregar producto
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }

    // Listar todos los productos
    public void listarProductos() {
        System.out.println("\n=== LISTADO DE PRODUCTOS ===");
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    // Buscar producto por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // Eliminar producto
    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto eliminado: " + p.getNombre());
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }

    // Actualizar stock
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para " + p.getNombre() + ": " + nuevaCantidad);
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }

    // Filtrar por categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n=== PRODUCTOS DE CATEGORÍA: " + categoria + " ===");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en esta categoría.");
        }
    }

    // Obtener total de stock
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // Obtener producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    // Filtrar productos por rango de precio
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n=== PRODUCTOS CON PRECIO ENTRE $" + min + " Y $" + max + " ===");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en ese rango de precios.");
        }
    }

    // Mostrar categorías disponibles
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n=== CATEGORÍAS DISPONIBLES ===");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat + ": " + cat.getDescripcion());
        }
    }
}
