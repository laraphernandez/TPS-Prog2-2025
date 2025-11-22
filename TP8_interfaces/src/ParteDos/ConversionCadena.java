package ParteDos;

import java.util.Scanner;

public class ConversionCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un numero: ");
            String texto = sc.nextLine();

            // Intentamos convertir a int
            int numero = Integer.parseInt(texto);
            System.out.println("El numero ingresado es: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un numero valido");
        } finally {
            sc.close();
        }
    }
}