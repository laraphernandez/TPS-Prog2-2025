package ejercicio5;

/**
 * Ejercicio 5: Computadora - PlacaMadre - Propietario
 * 
 * Relaciones demostradas:
 * - COMPOSICIÓN: Computadora → PlacaMadre
 *   La placa madre se crea con la computadora y no existe sin ella
 * 
 * - ASOCIACIÓN BIDIRECCIONAL: Computadora ↔ Propietario
 *   Ambos objetos se conocen mutuamente
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 5: Computadora - PlacaMadre - Propietario ===\n");

        // Crear un propietario
        Propietario propietario = new Propietario("Carlos Rodríguez", "23456789");
        System.out.println("Propietario creado: " + propietario);

        // Crear una computadora (COMPOSICIÓN con PlacaMadre)
        // La placa madre se crea automáticamente con la computadora
        Computadora computadora = new Computadora("Dell", "SN123456789", "ASUS Z390", "Intel Z390");
        System.out.println("\nComputadora creada: " + computadora);

        // Establecer ASOCIACIÓN BIDIRECCIONAL entre Computadora y Propietario
        computadora.setPropietario(propietario);
        System.out.println("\n--- Después de establecer la asociación bidireccional ---");
        System.out.println("Computadora: " + computadora);
        System.out.println("El propietario " + propietario.getNombre() + " tiene la computadora: " + propietario.getComputadora().getMarca());

        // Demostrar la composición
        System.out.println("\n--- Composición: La placa madre es parte integral de la computadora ---");
        System.out.println("Placa madre de la computadora: " + computadora.getPlacaMadre());
        System.out.println("Si la computadora se destruye, la placa madre también desaparece.");
    }
}
