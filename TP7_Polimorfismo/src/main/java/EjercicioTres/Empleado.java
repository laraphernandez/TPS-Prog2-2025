package EjercicioTres;

public abstract class Empleado {

    /**
     * Calcula el sueldo correspondiente a un empleado según su tipo.
     * @param e el empleado del cual se desea calcular el sueldo.
     * @return el sueldo del empleado
     */
    public double calcularSueldo(Empleado e) {
        if (e instanceof EmpleadoPlanta) {
            return 900000.0;
        } else if (e instanceof EmpleadoTemporal) {
            return 850000.0;
        } else {
            return 0;
        }
    }
}
