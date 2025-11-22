package ParteDos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaConRecursos {
    public static void main(String[] args) {
        // Try-with-resources cierra automaticamente el recurso
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            System.out.println("Leyendo archivo con try-with-resources:");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        // No hace falta cerrar el BufferedReader manualmente
    }
}