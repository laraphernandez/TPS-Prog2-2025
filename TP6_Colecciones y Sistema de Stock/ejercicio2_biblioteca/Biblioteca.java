import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // Agregar libro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println("Libro agregado: " + titulo);
    }

    // Listar todos los libros
    public void listarLibros() {
        System.out.println("\n=== LIBROS EN LA BIBLIOTECA " + nombre + " ===");
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    // Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Eliminar libro
    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado: " + libro.getTitulo());
        } else {
            System.out.println("Libro con ISBN " + isbn + " no encontrado.");
        }
    }

    // Obtener cantidad de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // Filtrar libros por año
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n=== LIBROS PUBLICADOS EN " + anio + " ===");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros publicados en " + anio + ".");
        }
    }

    // Mostrar autores disponibles
    public void mostrarAutoresDisponibles() {
        System.out.println("\n=== AUTORES EN LA BIBLIOTECA ===");
        Set<String> autoresUnicos = new HashSet<>();
        for (Libro libro : libros) {
            if (autoresUnicos.add(libro.getAutor().getId())) {
                libro.getAutor().mostrarInfo();
            }
        }
    }
}
