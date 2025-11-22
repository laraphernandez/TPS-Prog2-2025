package EjercicioDos;

public class Rectangulo extends Figura{ // Extendemos de figura
    // Creamos los atributos base y altura
    private double base;
    private double altura;

    // Creamos el constructor
    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    // Sobreescribimos al metodo calcular area
    @Override
    public void calcularArea(){
        System.out.println("El area del rectangulo " + nombre
            + " es: " + (base * altura));
    }
}
