package Packages.customClases;

//todo: what to do with unused variables?
public class Lote {
    int idPadron;
    int superficie;
    // Diagram uses PADLOCK for both
    protected String domicilio;
    protected float avaluoxmt;

    // Are represented as + and - respectively
    public Registro inscripto;
    private Edificio construccion;

    // If initial values are provided, will construct with them
    public Lote(int idPadron, int superficie, String domicilio, float avaluoxmt, Registro inscripto) {
        this.idPadron = idPadron;
        this.superficie = superficie;
        this.domicilio = domicilio;
        this.avaluoxmt = avaluoxmt;
        this.inscripto = inscripto;
    }

    // Will prevent crashing initial values are not provided
    public Lote() {
        this.idPadron = -1;
        this.superficie = -1;
        this.domicilio = "";
        this.avaluoxmt = -1;
    }

    // If necessary, more setters can be made
    public void setAllValues(int idPadron, int superficie, String domicilio, float avaluoxmt, Registro inscripto) {
        this.idPadron = idPadron;
        this.superficie = superficie;
        this.domicilio = domicilio;
        this.avaluoxmt = avaluoxmt;
        this.inscripto = inscripto;
    }

    public void setRegistro(Registro inscripto) {
        this.inscripto = inscripto;
    }

    // Necessary inside Registro.valuar() implementation
    public float getAvaluoxmt() {
        return this.avaluoxmt;
    }

    public int getSuperficie() {
        return this.superficie;
    }

    public float valuar() {
        return this.superficie * this.avaluoxmt;
    }

}