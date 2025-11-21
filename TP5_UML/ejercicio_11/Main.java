package ejercicio11;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 11: Reproductor - Canción - Artista ===\n");

        Artista artista = new Artista("Gustavo Cerati", "Rock Alternativo");
        System.out.println("Artista creado: " + artista);

        Cancion cancion = new Cancion("Crimen", artista);
        System.out.println("\nCanción creada: " + cancion);

        Reproductor reproductor = new Reproductor("Spotify Player");
        System.out.println("\nReproductor creado: " + reproductor);

        System.out.println("\n--- Dependencia de Uso: Reproductor usa Cancion como parámetro ---");
        reproductor.reproducir(cancion);
        System.out.println("\nLa canción se pasa al método pero NO se almacena como atributo.");
    }
}
