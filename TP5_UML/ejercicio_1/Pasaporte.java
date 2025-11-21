package ejercicio1;

/**
 * Clase Pasaporte
 * Relaciones:
 * COMPOSICIÓN con Foto (Pasaporte → Foto): La foto se crea con el pasaporte y no existe sin él
 * ASOCIACIÓN BIDIRECCIONAL con Titular (Pasaporte ↔ Titular): Ambos se conocen mutuamente
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composición: la foto es parte integral del pasaporte
    private Titular titular; 

    // Constructor - COMPOSICIÓN
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // Composición: se crea la foto
    }

    // Método para establecer la asociación bidireccional con Titular
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this); // Establece la bidireccionalidad
        }
    }

    // Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", fechaEmision='" + fechaEmision + '\'' +
                ", foto=" + foto +
                ", titular=" + (titular != null ? titular.getNombre() : "sin titular") +
                '}';
    }
}
