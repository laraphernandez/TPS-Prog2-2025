package ejercicio1;

/**
 * Ejercicio 1: Pasaporte - Foto - Titular
 * Relaciones demostradas:
 * COMPOSICIÓN: Pasaporte → Foto
 *   La foto se crea cuando se crea el pasaporte y no existe sin él
 * ASOCIACIÓN BIDIRECCIONAL: Pasaporte ↔ Titular; ambos objetos se conocen mutuamente
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1: Pasaporte - Foto - Titular ===\n");

        // Crear un titular
        Titular titular = new Titular("Juan Pérez", "12345678");
        System.out.println("Titular creado: " + titular);

        // Crear un pasaporte (COMPOSICIÓN con Foto)
        Pasaporte pasaporte = new Pasaporte("ARG123456", "2024-01-15", "foto_juan.jpg", "JPG");
        System.out.println("\nPasaporte creado: " + pasaporte);

        // Establecer ASOCIACIÓN BIDIRECCIONAL entre Pasaporte y Titular
        pasaporte.setTitular(titular);
        System.out.println("\n--- Después de establecer la asociación bidireccional ---");
        System.out.println("Pasaporte: " + pasaporte);
        System.out.println("El titular " + titular.getNombre() + " tiene el pasaporte: " + titular.getPasaporte().getNumero());

        // Demostrar la composición
        System.out.println("\n--- Composición: La foto es parte integral del pasaporte ---");
        System.out.println("Foto del pasaporte: " + pasaporte.getFoto());
        System.out.println("Si el pasaporte se destruye, la foto también desaparece.");
    }
}
