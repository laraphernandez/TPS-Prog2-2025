package ejercicio12;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 12: Impuesto - Contribuyente - Calculadora ===\n");

        Contribuyente contribuyente = new Contribuyente("Patricia Gómez", "27-35678901-4");
        System.out.println("Contribuyente creado: " + contribuyente);

        Impuesto impuesto = new Impuesto(5000.00, contribuyente);
        System.out.println("\nImpuesto creado: " + impuesto);

        Calculadora calculadora = new Calculadora("Calculadora Fiscal");
        System.out.println("\nCalculadora creada: " + calculadora);

        System.out.println("\n--- Dependencia de Uso: Calculadora usa Impuesto como parámetro ---");
        calculadora.calcular(impuesto);
        System.out.println("\nEl impuesto se pasa al método pero NO se almacena como atributo.");
    }
}
