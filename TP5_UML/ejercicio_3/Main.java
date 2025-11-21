package ejercicio3;

/**
 * Ejercicio 3: Libro - Autor - Editorial
 * 
 * Relaciones demostradas:
 * - ASOCIACIÓN UNIDIRECCIONAL: Libro → Autor
 *   Solo el libro conoce al autor, el autor no conoce al libro
 * 
 * - AGREGACIÓN: Libro → Editorial
 *   La editorial puede existir independientemente del libro
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: Libro - Autor - Editorial ===\n");

        // Crear un autor
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        System.out.println("Autor creado: " + autor);

        // Crear una editorial (AGREGACIÓN - existe independientemente)
        Editorial editorial = new Editorial("Editorial Sudamericana", "Av. Corrientes 123, Buenos Aires");
        System.out.println("\nEditorial creada: " + editorial);

        // Crear un libro (ASOCIACIÓN UNIDIRECCIONAL con Autor y AGREGACIÓN con Editorial)
        Libro libro = new Libro("Cien Años de Soledad", "978-0307474728", autor, editorial);
        System.out.println("\nLibro creado: " + libro);

        // Demostrar la asociación unidireccional
        System.out.println("\n--- Asociación Unidireccional: Libro → Autor ---");
        System.out.println("El libro conoce a su autor: " + libro.getAutor().getNombre());
        System.out.println("Pero el autor NO tiene referencia al libro (unidireccional)");

        // Demostrar la agregación
        System.out.println("\n--- Agregación: Libro → Editorial ---");
        System.out.println("La editorial " + editorial.getNombre() + " puede publicar múltiples libros.");
        System.out.println("Si el libro deja de existir, la editorial continúa operando.");
    }
}
