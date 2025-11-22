package EjercicioUno;

public class Auto extends Vehiculo { // Extendemos de la clase vehiculo
    // Declaramos el metodo adicional de clase auto
    private int cantidadDePuertas;

    // Creamos el constructor llamando al constructor de la clase padre
    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    // Sobreescribimos al metodo mostrarInfo
    @Override
    public void mostrarInfo(){
        System.out.println("Modelo: " + this.modelo + " ,marca: "
            + this.marca + ", cantidad de puertas: " + cantidadDePuertas);
    }
}
