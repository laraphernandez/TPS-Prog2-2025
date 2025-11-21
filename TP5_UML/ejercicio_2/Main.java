package ejercicio2;

// Ejercicio 2: Celular - Batería - Usuario
// AGREGACIÓN: Celular → Batería
// ASOCIACIÓN BIDIRECCIONAL: Celular ↔ Usuario
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: Celular - Batería - Usuario ===\n");

        // AGREGACIÓN: la batería existe independientemente
        Bateria bateria = new Bateria("BL-001", 5000);
        System.out.println("Batería creada: " + bateria);

        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21", bateria);
        System.out.println("\nCelular creado: " + celular);

        Usuario usuario = new Usuario("María García", "87654321");
        System.out.println("\nUsuario creado: " + usuario);

        celular.setUsuario(usuario);
        System.out.println("\n--- Asociación bidireccional establecida ---");
        System.out.println("El usuario " + usuario.getNombre() + " tiene el celular: " + usuario.getCelular().getMarca());
    }
}
