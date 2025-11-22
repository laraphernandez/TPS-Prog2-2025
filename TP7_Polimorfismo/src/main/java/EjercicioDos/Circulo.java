package EjercicioDos;

public class Circulo extends Figura{ // Extendemos de figura
    // Declaramos el atributo radio
    private double radio;

    // Creamos el constructor
    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    // Sobreescribimos al metodo calcular area
    @Override
    public void calcularArea(){
        System.out.println("El area del circulo " + nombre
            + " es: " + (radio * 3.14));
    }
}
