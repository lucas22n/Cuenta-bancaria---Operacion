/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

import java.util.Scanner;
import poop5.entidades.Cuenta;

public class POOP5 {

    public static Cuenta crear() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta:");
        int numeroDeCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI:");
        long dni = leer.nextLong();
        System.out.println("Ingrese el Saldo Actual:");
        float saldoActual = leer.nextFloat();

        Cuenta cuenta = new Cuenta(numeroDeCuenta, dni, saldoActual);

        return cuenta;
    }
    
    public static double ingresarMonto(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un monto el cual se le sumara al saldo: ");
        double montoIngresado = leer.nextDouble();
        
        return montoIngresado;
    }
    
    public static double ingresoRetiro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un monto el cual se le restara al saldo: ");
        double montoRetiro = leer.nextDouble();
        
        return montoRetiro;
    }
    
    public static double extraccionIngreso(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto a retirar (Debe ser del 20% o menos)");
        double montoRapida = leer.nextDouble();
        
        return montoRapida;
    }
    
    public static void main(String[] args) {
        Cuenta cuenta = crear();
        double monto = ingresarMonto();
        
        cuenta.ingresar(monto);
        double montoRetiro = ingresoRetiro();
        cuenta.mostrarDatos();
        cuenta.retirar(montoRetiro);
        cuenta.mostrarDatos();
        double montoRapida = extraccionIngreso();
        cuenta.mostrarDatos();
        cuenta.extraccionRapida(montoRapida);
        cuenta.consultarSaldo();
        cuenta.mostrarDatos();
        
    }

}
