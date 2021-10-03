package Miembros;

import Asignaturas.Curso;

public class Profesor extends Persona {
    public Curso curso;

    Profesor(String n) {
        super(n);
    }

    public void dicta(Curso c) {
        this.curso = c;
    }

    public void showCurso() {
        System.out.println(curso.getTitulo());
    }
}