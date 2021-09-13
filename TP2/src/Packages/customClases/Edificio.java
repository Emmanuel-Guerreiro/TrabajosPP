package Packages.customClases;

public class Edificio {

    protected float avaluoXmtr;

    public Edificio(float avaluoXmtr) {
        this.avaluoXmtr = avaluoXmtr;
    }

    public void setAvaluo(float nuevoAvaluo) {
        if (nuevoAvaluo < 0) {
            this.avaluoXmtr = 0;
            return;
        }
        this.avaluoXmtr = nuevoAvaluo;
    }

    public float getAvaluo() {
        return this.avaluoXmtr;
    }

    public void demoler() {
        // todo: is ok?
        this.avaluoXmtr = 0;
    }

}