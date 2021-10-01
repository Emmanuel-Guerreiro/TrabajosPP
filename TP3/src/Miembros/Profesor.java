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

    public void getCurso() {
        // todo: Formatear respuesta, si no va a mostrar
        // dir de memoria
        System.out.println(curso);
    }
}