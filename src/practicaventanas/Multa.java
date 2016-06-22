/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaventanas;

/**
 *
 * @author AdminFull
 */
public class Multa {

    private String dominio;
    private String titular;
    private int tipoInfraccion;
    private double importe;

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getTipoInfraccion() {
        return tipoInfraccion;
    }

    public void setTipoInfraccion(int tipoInfraccion) {
        this.tipoInfraccion = tipoInfraccion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Multa() {
    }

    public Multa(String dominio, String titular, int tipoInfraccion, double importe) {
        this.dominio = dominio;
        this.titular = titular;
        this.tipoInfraccion = tipoInfraccion;
        this.importe = importe;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        String txt = "Multa{" + "dominio=" + dominio + ", titular=" + titular + ", tipoInfraccion=" + tipoInfraccion + ", importe=" + importe + '}';
        text.append(txt);
        return text.toString();
    }

    public String txtTipo() {
        String txt = "";

        if (this.tipoInfraccion == 1) {
            txt = "Adelantamiento indebido";
        } else if (this.tipoInfraccion == 2) {
            txt = "Consumo de alcohol";
        } else if (this.tipoInfraccion == 3){
            txt = "Luces apagadas";
        } else {
            txt = "No seleccionado";
        }

        return txt;
    }

}
