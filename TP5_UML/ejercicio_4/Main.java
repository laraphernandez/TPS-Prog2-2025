package ejercicio4;

/**
 * Ejercicio 4: TarjetaDeCrédito - Cliente - Banco
 * 
 * Relaciones demostradas:
 * - ASOCIACIÓN BIDIRECCIONAL: TarjetaDeCrédito ↔ Cliente
 *   Ambos objetos se conocen mutuamente
 * 
 * - AGREGACIÓN: TarjetaDeCrédito → Banco
 *   El banco puede existir independientemente de la tarjeta
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 4: TarjetaDeCrédito - Cliente - Banco ===\n");

        // Crear un banco (AGREGACIÓN - existe independientemente)
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        System.out.println("Banco creado: " + banco);

        // Crear una tarjeta de crédito con el banco
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4532-1234-5678-9010", "12/2027", banco);
        System.out.println("\nTarjeta de crédito creada: " + tarjeta);

        // Crear un cliente
        Cliente cliente = new Cliente("Ana López", "34567890");
        System.out.println("\nCliente creado: " + cliente);

        // Establecer ASOCIACIÓN BIDIRECCIONAL entre TarjetaDeCrédito y Cliente
        tarjeta.setCliente(cliente);
        System.out.println("\n--- Después de establecer la asociación bidireccional ---");
        System.out.println("Tarjeta: " + tarjeta);
        System.out.println("El cliente " + cliente.getNombre() + " tiene la tarjeta: " + cliente.getTarjeta().getNumero());

        // Demostrar la agregación
        System.out.println("\n--- Agregación: TarjetaDeCrédito → Banco ---");
        System.out.println("El banco " + banco.getNombre() + " puede emitir múltiples tarjetas.");
        System.out.println("Si una tarjeta se cancela, el banco sigue operando.");
    }
}
