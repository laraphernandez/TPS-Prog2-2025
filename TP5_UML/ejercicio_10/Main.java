package ejercicio10;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 10: CuentaBancaria - ClaveSeguridad - Titular ===\n");

        Titular titular = new Titular("Marcos Díaz", "45678901");
        System.out.println("Titular creado: " + titular);

        CuentaBancaria cuenta = new CuentaBancaria(
            "0123456789012345678901",
            50000.00,
            "****1234",
            "2024-11-01"
        );
        System.out.println("\nCuenta Bancaria creada: " + cuenta);

        cuenta.setTitular(titular);
        System.out.println("\n--- Después de establecer la asociación bidireccional ---");
        System.out.println("Cuenta: " + cuenta);
        System.out.println("El titular " + titular.getNombre() + " tiene la cuenta CBU: " + titular.getCuenta().getCbu());

        System.out.println("\n--- Composición: CuentaBancaria → ClaveSeguridad ---");
        System.out.println("La clave de seguridad es parte integral de la cuenta.");
    }
}
