package ParteDos;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer numero: ");
            int num1 = sc.nextInt();

            System.out.print("Ingrese el segundo numero: ");
            int num2 = sc.nextInt();

            // Intentamos dividir
            int resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        } finally {
            sc.close();
        }
    }
}