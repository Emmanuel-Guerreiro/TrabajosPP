package Packages.customClases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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

    public void guardar() {
        try {
            Registro guardable = this;

            FileOutputStream fs = new FileOutputStream("clase.ser");

            ObjectOutputStream outputStream = new ObjectOutputStream(fs);
            outputStream.writeObject(guardable);
            outputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al escribir el archivo");
        }

    }

    public void recuperar() {
        Registro recuperada = null;
        try {
            FileInputStream fis = new FileInputStream("clase.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            recuperada = (Registro) inputStream.readObject();
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (recuperada != null)
            System.out.println(recuperada);
    }
}