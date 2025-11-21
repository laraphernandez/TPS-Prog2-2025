public class Main {
    public static void main(String[] args) {
        // inventario
        Inventario inventario = new Inventario();

        System.out.println("=== TRABAJO PRÁCTICO 6 - EJERCICIO 1: SISTEMA DE STOCK ===\n");

        // Tarea 1: Crear al menos cinco productos con diferentes categorías
        System.out.println("TAREA 1: Creando productos...");
        Producto p1 = new Producto("001", "Arroz", 1500, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("002", "Notebook HP", 450000, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("003", "Remera Nike", 25000, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("004", "Lámpara LED", 8000, 30, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("005", "Fideos", 2200, 80, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Tarea 2: Listar todos los productos
        System.out.println("\nTAREA 2: Listando todos los productos...");
        inventario.listarProductos();

        // Tarea 3: Buscar un producto por ID
        System.out.println("\nTAREA 3: Buscando producto por ID...");
        String idBuscar = "002";
        Producto encontrado = inventario.buscarProductoPorId(idBuscar);
        if (encontrado != null) {
            System.out.println("Producto encontrado con ID " + idBuscar + ":");
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // Tarea 4: Filtrar por categoría
        System.out.println("\nTAREA 4: Filtrando productos por categoría...");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // Tarea 5: Eliminar un producto
        System.out.println("\nTAREA 5: Eliminando producto...");
        inventario.eliminarProducto("004");
        inventario.listarProductos();

        // Tarea 6: Actualizar stock
        System.out.println("\nTAREA 6: Actualizando stock...");
        inventario.actualizarStock("001", 150);

        // Tarea 7: Mostrar total de stock
        System.out.println("\nTAREA 7: Total de stock disponible...");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Total de productos en stock: " + totalStock + " unidades");

        // Tarea 8: Producto con mayor stock
        System.out.println("\nTAREA 8: Producto con mayor stock...");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }

        // Tarea 9: Filtrar por rango de precio
        System.out.println("\nTAREA 9: Filtrando productos por precio...");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // Tarea 10: Mostrar categorías disponibles
        System.out.println("\nTAREA 10: Mostrando categorías disponibles...");
        inventario.mostrarCategoriasDisponibles();
    }
}
