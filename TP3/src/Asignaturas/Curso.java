package Asignaturas;

import java.util.ArrayList;
import java.util.Hashtable;

public class Curso extends Hashtable<Integer, Inscripcion> {
    private String titulo;
    private ArrayList<Inscripcion> inscrpciones = new ArrayList<Inscripcion>();

    public Curso(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Inscripcion> inscriptos() {
        return inscrpciones;
    }

    public String getTitulo() {
        return titulo;
    }

}