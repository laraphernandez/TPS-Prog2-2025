package ejercicio12;

/**
 * Clase Calculadora
 * DEPENDENCIA DE USO: usa Impuesto como parámetro pero no la almacena como atributo
 */
public class Calculadora {
    private String tipo;

    public Calculadora(String tipo) {
        this.tipo = tipo;
    }

    // DEPENDENCIA DE USO: recibe Impuesto como parámetro pero no lo guarda
    public void calcular(Impuesto impuesto) {
        double montoOriginal = impuesto.getMonto();
        double interes = montoOriginal * 0.10; // 10% de interés
        double total = montoOriginal + interes;

        System.out.println("💰 Calculando impuesto para: " + impuesto.getContribuyente().getNombre());
        System.out.println("   CUIL: " + impuesto.getContribuyente().getCuil());
        System.out.println("   Monto Original: $" + montoOriginal);
        System.out.println("   Interés (10%): $" + interes);
        System.out.println("   Total a Pagar: $" + total);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
