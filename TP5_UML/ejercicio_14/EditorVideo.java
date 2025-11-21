package ejercicio14;

/**
 * Clase EditorVideo
 * DEPENDENCIA DE CREACIÓN: crea Render dentro de un método pero no lo conserva como atributo
 */
public class EditorVideo {
    private String nombre;

    public EditorVideo(String nombre) {
        this.nombre = nombre;
    }

    // DEPENDENCIA DE CREACIÓN: crea Render pero no lo guarda
    public void exportar(String formato, Proyecto proyecto) {
        // Se crea el objeto Render dentro del método
        Render render = new Render(formato, proyecto);
        
        System.out.println("🎬 Exportando video...");
        System.out.println("   Proyecto: " + render.getProyecto().getNombre());
        System.out.println("   Duración: " + render.getProyecto().getDuracionMin() + " minutos");
        System.out.println("   Formato: " + render.getFormato());
        System.out.println("   ⏳ Procesando render...");
        System.out.println("   ✓ Video exportado exitosamente");
        
        // El objeto render se crea y usa localmente, no se almacena como atributo
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EditorVideo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
