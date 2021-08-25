package Packages.customClases;

/* 
todo: elijo uno de inmueble (desde el mismo objeto registro) o le paso los valores a valuar
El método valuar() de esta clase, debe invocar el método valuar() de la clase Lote, por lo
que deberá indicarse a qué lote se refiere el avalúo. Por esto, el método valuar() de
Registro, sería conveniente que recibiera como parámetro el objeto Lote a valuar. Este
lote podría pasarse en forma directa o utilizando el elemento correspondiente del arreglo.


todo: emitirBoletos() => log datos para cada inmueble formateados?

todo: registrar()
*/

public class Registro {
    float coefAvaluoEdificio;
    String municipio;
    // Diagram uses PADLOCK
    protected float tasa;
    // size is arbitrary
    Lote[] inmueble = new Lote[1000];

    public Registro(String municipio, float tasa, float coefAvaluoEdificio) {
        this.coefAvaluoEdificio = coefAvaluoEdificio;
        this.municipio = municipio;
        this.tasa = tasa;
    }

    /** Setters and getters */

    public void setCoefAvaluoEdificio(float nuevoAvaluo) {
        if (nuevoAvaluo < 0) {
            this.coefAvaluoEdificio = 0;
            return;
        }
        this.coefAvaluoEdificio = nuevoAvaluo;
    }

    public float getCoefAvaluoEdificio() {
        return this.coefAvaluoEdificio;
    }

    public void setTasa(float tasa) {
        if (tasa < 0) {
            this.tasa = 0;
            return;
        }
        this.tasa = tasa;
    }

    public float getTasa() {
        return this.tasa;
    }

    /** Other methods */
    // If avaluoxmt from Lote is big enough, a double may be necessary
    public float valuar(Lote loteAValuar) {
        return loteAValuar.valuar();
    }

    public float valuar(float avaluoxmt, int superficie) {
        return avaluoxmt * superficie;
    }

}