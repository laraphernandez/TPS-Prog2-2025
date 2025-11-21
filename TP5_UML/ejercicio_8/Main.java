package ejercicio8;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 8: Documento - FirmaDigital - Usuario ===\n");

        Usuario usuario = new Usuario("Elena Martínez", "elena@email.com");
        System.out.println("Usuario creado: " + usuario);

        Documento documento = new Documento(
            "Contrato de Compraventa", 
            "Este documento certifica...",
            "SHA256-ABCD1234",
            "2024-11-21",
            usuario
        );
        System.out.println("\nDocumento creado: " + documento);

        System.out.println("\n--- Composición: Documento → FirmaDigital ---");
        System.out.println("La firma digital es parte integral del documento.");
        
        System.out.println("\n--- Agregación: FirmaDigital → Usuario ---");
        System.out.println("El usuario puede firmar múltiples documentos.");
    }
}
