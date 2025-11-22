package EjercicioCuatro;

public class Vaca extends Animal{ // Extendemos de animal
    // Sobreescribimos hacer sonido
    @Override
    public void hacerSonido(){
        System.out.println("MU!");
    }
}
