package Miembros;

import java.util.ArrayList;

import Asignaturas.Curso;
import Asignaturas.Inscripcion;

public class Estudiante extends Persona {
    private int legajo;
    private ArrayList<Inscripcion> inscripto = new ArrayList<Inscripcion>();

    public Estudiante(String name, int l) {
        super(name);
        this.legajo = l;
    }

    // Recibe un objeto curso y genera una nueva clase de
    // tipo inscripcion. De paso esa inscripcion la sumo
    // al array de inscripciones
    public void inscribir(Curso c) {
        Inscripcion ins = new Inscripcion(this, c);
        inscripto.add(ins);
    }

    public int getLegajo() {
        return legajo;
    }

    public void cursosInscriptos() {
        for (Inscripcion i : inscripto) {
            System.out.println(i.getCurso());
        }
    }
}