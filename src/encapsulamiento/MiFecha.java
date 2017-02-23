/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author dyno
 */
public class MiFecha {

    static final int ENERO = 1;
    static final int FEBRERO = 2;
    static final int MARZO = 3;
    static final int ABRIL = 4;
    static final int MAYO = 5;
    static final int JUNIO = 6;
    static final int JULIO = 7;
    static final int AGOSTO = 8;
    static final int SEPTIEMBRE = 9;
    static final int OCTUBRE = 10;
    static final int NOVIEMBRE = 11;
    static final int DICIEMBRE = 12;

    private int dia, mes, anio;
    private boolean resultado;

    MiFecha() {
        this.dia = 10;
        this.anio = 2015;
        this.mes = 11;
    }

    public int getDia() {
        return dia;
    }

    public boolean setDia(int dia, int mes, int anio) {
        resultado = verificarFecha(dia, mes, anio);
        if (resultado) {
            this.dia = dia;
        }

        return resultado;
    }

    public int getMes() {
        return mes;
    }

    public boolean setMes(int dia, int mes, int anio) {
        resultado = verificarFecha(dia, mes, anio);
        if (resultado) {
            this.dia = dia;
        }

        return resultado;
    }

    public int getAnio() {
        return anio;
    }

    public boolean setAnio(int dia, int mes, int anio) {
        resultado = verificarFecha(dia, mes, anio);
        if (resultado) {
            this.dia = dia;
        }

        return resultado;
    }

    public boolean verificarFecha(int dia, int mes, int anio) {
        if (mes >= ENERO && mes <= DICIEMBRE && dia >= 1 && dia <= 31) { //comprueba mes y dias dentro de los parametros
            if (anio >= 0 && anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) { //linea comprobacion anio bisiesto //

                switch (mes) { // Y si es anio bisiesto
                    case ENERO:
                    case MARZO:
                    case MAYO:
                    case JULIO:
                    case AGOSTO:
                    case OCTUBRE:
                    case DICIEMBRE:
                        return true; //true porque la fecha puede ser de 1 al 31

                    case ABRIL:
                    case JUNIO:
                    case SEPTIEMBRE:
                    case NOVIEMBRE:
                        return dia <= 30; //comprobacion del dia de meses con terminacion 30

                    default://case FEBRERO
                        return dia <= 29; //return resultado febrero

                }
            } else { //NO es anio BISIESTO
                switch (mes) {
                    case ENERO:
                    case MARZO:
                    case MAYO:
                    case JULIO:
                    case AGOSTO:
                    case OCTUBRE:
                    case DICIEMBRE:
                        return true;//comprobacion del dia de meses con terminacion 31

                    case ABRIL:
                    case JUNIO:
                    case SEPTIEMBRE:
                    case NOVIEMBRE:
                        return dia <= 30;//comprobacion del dia de meses con terminacion 30

                    default://case FEBRERO
                        return dia <= 28; // 28 por default
                }
            }
        } else { //else comprobacion de fechas de MES y DIAS 
            return false;
        }
    }

}
