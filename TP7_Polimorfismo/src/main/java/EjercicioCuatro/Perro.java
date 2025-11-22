package EjercicioCuatro;

public class Perro extends Animal{ // Extendemos de animal
    // Sobreescribimos hacer sonido
    @Override
    public void hacerSonido(){
        System.out.println("Guau!");
    }
}
