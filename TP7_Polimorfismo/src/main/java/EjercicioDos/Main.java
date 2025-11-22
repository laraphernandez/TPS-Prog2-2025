package EjercicioDos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Creamos un array vacio de figuras
        ArrayList<Figura> figuras = new ArrayList<>();
        
        // Creamos y añadimos 4 figuras al array
        Rectangulo r1 = new Rectangulo(4.0, 4.0, "Rectangulo 1");
        Rectangulo r2 = new Rectangulo(6.0, 4.0, "Rectangulo 2");
        Circulo c1 = new Circulo(10, "Circulo 1");
        Circulo c2 = new Circulo(15, "Circulo 2");
        
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(c1);
        figuras.add(c2);
        
        // Recorremos el array y llamamos al metodo calcular area
        for(Figura f : figuras){
            f.calcularArea();
        }
    }
}
