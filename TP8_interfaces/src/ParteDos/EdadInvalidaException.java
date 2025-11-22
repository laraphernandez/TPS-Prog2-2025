package ParteDos;

// Creamos nuestra excepcion personalizada
public class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}