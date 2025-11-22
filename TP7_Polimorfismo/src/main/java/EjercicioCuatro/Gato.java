package EjercicioCuatro;

public class Gato extends Animal{ // Extendemos de animal
    // Sobreescribimos hacer sonido
    @Override
    public void hacerSonido(){
        System.out.println("Miau!");
    }
}
