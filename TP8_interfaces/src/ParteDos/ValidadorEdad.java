package ParteDos;

import java.util.Scanner;

public class ValidadorEdad {
    // Metodo que valida la edad
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120");
        }
        System.out.println("Edad valida: " + edad);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese una edad: ");
            int edad = sc.nextInt();
            validarEdad(edad);

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}