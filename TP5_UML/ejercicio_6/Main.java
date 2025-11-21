package ejercicio6;

/**
 * Ejercicio 6: Reserva - Cliente - Mesa
 * 
 * Relaciones demostradas:
 * - ASOCIACIÓN UNIDIRECCIONAL: Reserva → Cliente
 *   Solo la reserva conoce al cliente, el cliente no conoce la reserva
 * 
 * - AGREGACIÓN: Reserva → Mesa
 *   La mesa puede existir independientemente de la reserva
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 6: Reserva - Cliente - Mesa ===\n");

        // Crear un cliente
        Cliente cliente = new Cliente("Pedro Gómez", "11-2345-6789");
        System.out.println("Cliente creado: " + cliente);

        // Crear una mesa (AGREGACIÓN - existe independientemente)
        Mesa mesa = new Mesa(5, 4);
        System.out.println("\nMesa creada: " + mesa);

        // Crear una reserva (ASOCIACIÓN UNIDIRECCIONAL con Cliente y AGREGACIÓN con Mesa)
        Reserva reserva = new Reserva("2024-12-25", "20:00", cliente, mesa);
        System.out.println("\nReserva creada: " + reserva);

        // Demostrar la asociación unidireccional
        System.out.println("\n--- Asociación Unidireccional: Reserva → Cliente ---");
        System.out.println("La reserva conoce al cliente: " + reserva.getCliente().getNombre());
        System.out.println("Pero el cliente NO tiene referencia a la reserva (unidireccional)");

        // Demostrar la agregación
        System.out.println("\n--- Agregación: Reserva → Mesa ---");
        System.out.println("La mesa " + mesa.getNumero() + " puede ser usada para múltiples reservas.");
        System.out.println("Si la reserva se cancela, la mesa sigue existiendo.");
    }
}
