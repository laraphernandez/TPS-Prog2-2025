public class Main {
    public static void main(String[] args) {
        System.out.println("=== TRABAJO PRÁCTICO 6 - EJERCICIO 2: BIBLIOTECA Y LIBROS ===\n");

        // Tarea 1: Crear una biblioteca
        System.out.println("TAREA 1: Creando biblioteca...");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UTN");
        System.out.println("Biblioteca creada: " + biblioteca.getNombre());

        // Tarea 2: Crear al menos tres autores
        System.out.println("\nTAREA 2: Creando autores...");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        
        System.out.println("Autores creados:");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();

        // Tarea 3: Agregar 5 libros a la biblioteca
        System.out.println("\nTAREA 3: Agregando libros a la biblioteca...");
        biblioteca.agregarLibro("978-0307474728", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-0142437223", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("978-0142180303", "Ficciones", 1944, autor2);
        biblioteca.agregarLibro("978-0142437209", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("978-1501117015", "La casa de los espíritus", 1982, autor3);

        // Tarea 4: Listar todos los libros
        System.out.println("\nTAREA 4: Listando todos los libros...");
        biblioteca.listarLibros();

        // Tarea 5: Buscar un libro por ISBN
        System.out.println("\nTAREA 5: Buscando libro por ISBN...");
        String isbnBuscar = "978-0142180303";
        Libro encontrado = biblioteca.buscarLibroPorIsbn(isbnBuscar);
        if (encontrado != null) {
            System.out.println("Libro encontrado:");
            encontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // Tarea 6: Filtrar libros por año
        System.out.println("\nTAREA 6: Filtrando libros por año específico...");
        biblioteca.filtrarLibrosPorAnio(1967);

        // Tarea 7: Eliminar un libro
        System.out.println("\nTAREA 7: Eliminando un libro...");
        biblioteca.eliminarLibro("978-1501117015");
        biblioteca.listarLibros();

        // Tarea 8: Mostrar cantidad total de libros
        System.out.println("\nTAREA 8: Cantidad total de libros...");
        int cantidad = biblioteca.obtenerCantidadLibros();
        System.out.println("Cantidad de libros en la biblioteca: " + cantidad);

        // Tarea 9: Listar todos los autores
        System.out.println("\nTAREA 9: Listando autores disponibles...");
        biblioteca.mostrarAutoresDisponibles();
    }
}
