package ejercicio13;

/**
 * Clase GeneradorQR
 * DEPENDENCIA DE CREACIÓN: crea CodigoQR dentro de un método pero no lo conserva como atributo
 */
public class GeneradorQR {
    private String nombre;

    public GeneradorQR(String nombre) {
        this.nombre = nombre;
    }

    // DEPENDENCIA DE CREACIÓN: crea CodigoQR pero no lo guarda
    public void generar(String valor, Usuario usuario) {
        // Se crea el objeto CodigoQR dentro del método
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        
        System.out.println("📱 Generando código QR...");
        System.out.println("   Valor: " + codigoQR.getValor());
        System.out.println("   Usuario: " + codigoQR.getUsuario().getNombre());
        System.out.println("   Email: " + codigoQR.getUsuario().getEmail());
        System.out.println("   ✓ Código QR generado exitosamente");
        
        // El objeto codigoQR se crea y usa localmente, no se almacena como atributo
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "GeneradorQR{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
