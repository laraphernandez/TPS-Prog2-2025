package EjercicioCuatro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Inicializamos array vacio de animales
        ArrayList<Animal> animales = new ArrayList<>();

        // Creamos y agregamos animales al array
        Perro p1 = new Perro();
        Gato g1 = new Gato();
        Vaca v1 = new Vaca();

        animales.add(p1);
        animales.add(g1);
        animales.add(v1);

        // Recorremos el array y llamamos al metodo hacer sonido
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
