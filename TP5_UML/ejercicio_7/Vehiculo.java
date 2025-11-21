package ejercicio7;

// AGREGACIÓN + ASOCIACIÓN BIDIRECCIONAL
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // Agregación: el motor puede existir sin el vehículo
    private Conductor conductor; // Asociación bidireccional

    // Constructor - El motor se pasa como parámetro (AGREGACIÓN)
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    // Método para establecer la asociación bidireccional con Conductor
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", conductor=" + (conductor != null ? conductor.getNombre() : "sin conductor") +
                '}';
    }
}
