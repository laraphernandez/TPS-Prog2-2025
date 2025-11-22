package EjercicioUno;

public class Vehiculo {
    // Declaramos los atributos de la clase padre protegidos
    protected String marca;
    protected String modelo;

    // Creamos su constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Metodo para mostrar la informacion de un vehiculo
    public void mostrarInfo(){
        System.out.println("Modelo: " + modelo + " ,marca: " + marca);
    }
}
