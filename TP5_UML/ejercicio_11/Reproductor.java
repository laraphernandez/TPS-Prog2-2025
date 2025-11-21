package ejercicio11;

/**
 * Clase Reproductor
 * DEPENDENCIA DE USO: usa Cancion como parámetro pero no la almacena como atributo
 */
public class Reproductor {
    private String nombre;

    public Reproductor(String nombre) {
        this.nombre = nombre;
    }

    // DEPENDENCIA DE USO: recibe Cancion como parámetro pero no la guarda
    public void reproducir(Cancion cancion) {
        System.out.println("🎵 Reproduciendo: " + cancion.getTitulo() + 
                         " - " + cancion.getArtista().getNombre());
        System.out.println("   Género: " + cancion.getArtista().getGenero());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Reproductor{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
