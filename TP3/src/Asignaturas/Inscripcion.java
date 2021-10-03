package Asignaturas;

import Miembros.Estudiante;

public class Inscripcion {
    private Curso paraEl;
    private Estudiante estudiante;

    public static boolean estaInscripto(int legajo, Curso c) {
        String xd = c.get(legajo);
        if (xd != null) {
            return true;
        }
        return false;
    }

    public Inscripcion(Estudiante e, Curso c) {
        this.paraEl = c;
        this.estudiante = e;
        c.put(e.getLegajo(), c.getTitulo());
        c.addInscripto(this);
    }

    public Curso getCurso() {
        return paraEl;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}