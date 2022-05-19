/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5.entidades;

/**
 *
 * @author Jorge
 */
public class Cuenta {

    private int numeroDeCuenta;
    private long numeroDni;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroDeCuenta, long numeroDni, double saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.numeroDni = numeroDni;
        this.saldoActual = saldoActual;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setNumeroDni(long numeroDni) {
        this.numeroDni = numeroDni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public long getNumeroDni() {
        return numeroDni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void ingresar(double montoIngresado) {
        saldoActual += montoIngresado;
    }

    public void retirar(double montoRetiro) {
        saldoActual -= montoRetiro;
    }

    public void extraccionRapida(double extraccion) {
        if (extraccion <= (getSaldoActual() * 20) / 100) {
            this.retirar(extraccion);
        } else {
            System.out.println("El limite es del 20%");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo Actual:" + getSaldoActual());
    }

    public void mostrarDatos(){
        System.out.println(" | " + "Numero de Cuenta:" + " | " + "Numero De Dni:" +   " | " + "Saldo Actual:" );
        System.out.println(" | " + getNumeroDeCuenta() + " | " + getNumeroDni() + " | " + getSaldoActual() );
    }
}
