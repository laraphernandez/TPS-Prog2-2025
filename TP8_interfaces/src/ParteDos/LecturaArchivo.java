package ParteDos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        try {
            // Intentamos leer el archivo
            File archivo = new File("datos.txt");
            Scanner lector = new Scanner(archivo);

            System.out.println("Contenido del archivo:");
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe");
        }
    }
}