/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaventanas;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author AdminFull
 */
public class Municipalidad {

    private ArrayList<Multa> multas;
    private static Municipalidad muni = null;
    private static Object sincronizador = new Object();

    public ArrayList<Multa> getMultas() {
        return multas;
    }

    private Municipalidad() {
        this.multas = new ArrayList<Multa>();
    }

    public static Municipalidad initMunicipalidad() {
        if (muni == null) {
            synchronized (sincronizador) {
                if (muni == null) {
                    muni = new Municipalidad();
                }
            }
        }

        return muni;
    }

    public void agregarMulta(Multa multa) {
        this.multas.add(multa);
    }

    public void eliminarMulta(Multa multa) {
        this.multas.remove(multa);
    }

    public int[] cantidadPorTipo() {
        int[] totales = new int[3];

        for (Multa multa : multas) {
            if (multa.getTipoInfraccion() == 1) {
                totales[0]++;
            } else if (multa.getTipoInfraccion() == 2) {
                totales[1]++;
            } else {
                totales[2]++;
            }
        }

        return totales;
    }

    public double totalRecaudado() {
        double total = 0;

        for (Multa multa : multas) {
            total += multa.getImporte();
        }

        return total;
    }

    public double porcentajeTipo2() {
        int total = multas.size();
        int tipo2 = 0;
        double porcentaje = 0;

        for (Multa multa : multas) {
            if (multa.getTipoInfraccion() == 2) {
                tipo2++;
            }
        }

        porcentaje = (tipo2 / total) * 100;

        return porcentaje;
    }

    public String nombreMultaMasElevada() {
        String nombre = "";
        double monto = 0;

        for (Multa multa : multas) {
            if (monto == 0) {
                monto = multa.getImporte();
                nombre = multa.getTitular();
            } else if (multa.getImporte() > monto) {
                monto = multa.getImporte();
                nombre = multa.getTitular();
            }
        }

        return nombre;
    }

    public Object[] ultimos10() {
        if (multas.size() > 10) {
            ArrayList<Multa> ultimos10 = new ArrayList<Multa>();
            for (int i = multas.size() - 10; i <= (i + 10); i++) {
                ultimos10.add(multas.get(i));
            }
            return ultimos10.toArray();
        } else {
            return multas.toArray();
        }
    }
    
    public Object[] listadoMultas() {
        return multas.toArray();
    }
}
