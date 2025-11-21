package ejercicio7;

/**
 * Ejercicio 7: Vehículo - Motor - Conductor
 * 
 * Relaciones demostradas:
 * - AGREGACIÓN: Vehículo → Motor
 *   El motor puede existir independientemente del vehículo
 * 
 * - ASOCIACIÓN BIDIRECCIONAL: Vehículo ↔ Conductor
 *   Ambos objetos se conocen mutuamente
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 7: Vehículo - Motor - Conductor ===\n");

        // Crear un motor (AGREGACIÓN - existe independientemente)
        Motor motor = new Motor("V6 Turbo", "MOT-789456");
        System.out.println("Motor creado: " + motor);

        // Crear un vehículo con el motor
        Vehiculo vehiculo = new Vehiculo("ABC-123", "Ford Mustang", motor);
        System.out.println("\nVehículo creado: " + vehiculo);

        // Crear un conductor
        Conductor conductor = new Conductor("Luis Fernández", "B-12345678");
        System.out.println("\nConductor creado: " + conductor);

        // Establecer ASOCIACIÓN BIDIRECCIONAL entre Vehículo y Conductor
        vehiculo.setConductor(conductor);
        System.out.println("\n--- Después de establecer la asociación bidireccional ---");
        System.out.println("Vehículo: " + vehiculo);
        System.out.println("El conductor " + conductor.getNombre() + " maneja el vehículo: " + conductor.getVehiculo().getModelo());

        // Demostrar la agregación
        System.out.println("\n--- Agregación: Vehículo → Motor ---");
        System.out.println("El motor " + motor.getNumeroSerie() + " puede ser usado en otro vehículo.");
        System.out.println("Si el vehículo se desguaza, el motor puede ser reutilizado.");
    }
}
