package Asignaturas;

import Miembros.Estudiante;

public class Inscripcion {
    private Curso paraEl;
    private Estudiante estudiante;

    public Inscripcion(Estudiante e, Curso c) throws ErrorInscripcion {
        if (e.getNInscripciones() > 3) {
            throw new ErrorInscripcion("El alumno " + e.getName() + " supera la cantidad max de inscripciones");
        }
        this.paraEl = c;
        this.estudiante = e;
        c.put(e.getLegajo(), this);
    }

    public static boolean estaInscripto(int legajo, Curso c) {
        Inscripcion estaIns = c.get(legajo);
        if (estaIns != null) {
            return true;
        }
        return false;
    }

    public Curso getCurso() {
        return paraEl;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}