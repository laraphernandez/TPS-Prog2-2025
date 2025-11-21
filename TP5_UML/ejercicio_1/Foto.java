package ejercicio1;

/**
 * Clase Foto
 * Participa en una COMPOSICIÓN con Pasaporte (es parte integral del Pasaporte)
 */
public class Foto {
    private String imagen;
    private String formato;

    // Constructor
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    // Getters y Setters
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" +
                "imagen='" + imagen + '\'' +
                ", formato='" + formato + '\'' +
                '}';
    }
}
