package Asignaturas;

public class ErrorInscripcion extends Exception {

    public ErrorInscripcion(String s) {
        super("No es posible realizar la inscripción " + s);
    }
}