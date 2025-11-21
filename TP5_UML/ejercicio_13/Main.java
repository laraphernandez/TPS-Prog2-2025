package ejercicio13;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 13: GeneradorQR - Usuario - CódigoQR ===\n");

        Usuario usuario = new Usuario("Federico Ramos", "federico@email.com");
        System.out.println("Usuario creado: " + usuario);

        GeneradorQR generador = new GeneradorQR("QR Generator Pro");
        System.out.println("\nGenerador QR creado: " + generador);

        System.out.println("\n--- Dependencia de Creación: GeneradorQR crea CodigoQR ---");
        generador.generar("https://miapp.com/profile/federico", usuario);
        
        System.out.println("\nEl CodigoQR se crea dentro del método pero NO se conserva como atributo.");
    }
}
