package Asignaturas;

import java.util.ArrayList;
import java.util.Hashtable;

public class Curso extends Hashtable<Integer, String> {
    private String titulo;
    private ArrayList<Inscripcion> inscrpciones = new ArrayList<Inscripcion>();

    public Curso(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Inscripcion> inscriptos() {
        return inscrpciones;
    }

    public void addInscripto(Inscripcion i) {
        inscrpciones.add(i);
    }

    public String getTitulo() {
        return titulo;
    }

}