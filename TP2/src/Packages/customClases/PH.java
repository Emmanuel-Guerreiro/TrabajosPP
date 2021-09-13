package Packages.customClases;

import java.util.ArrayList;

public class PH extends Edificio {
    protected byte cantPisos;
    private ArrayList<Departamento> listaDepartamentos = new ArrayList<Departamento>();

    PH(float axm, byte cantPisos) {
        super(axm);
        this.cantPisos = cantPisos;
    }

    public void agregarDepartamento(byte piso, char dpto, int superficie) {
        byte pisoValido = piso;
        // En el caso de que quiera setearse un pis mayor al maximo, setea -1
        if (piso > cantPisos)
            pisoValido = -1;

        listaDepartamentos.add(new Departamento(pisoValido, dpto, superficie));
    }
}
