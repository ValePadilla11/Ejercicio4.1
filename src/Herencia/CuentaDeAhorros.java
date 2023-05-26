
package Herencia;
public class CuentaDeAhorros extends Cuenta {
    boolean activa;
    public CuentaDeAhorros(float saldo, float tAnual) {
        super(saldo, tAnual);
        if (saldo<1000)
            activa = false;
        else
            activa = true;
    }
    public void retirar(float cantidad){
        if (activa)
            super.retirar(cantidad);
    }
    public void consignar(float cantidad){
        if (activa)
            super.consignar(cantidad);
    }
    public void extractoMensual(){
        if (nRetiros>4){
            cMensual += (nRetiros - 4)*1000;
        }
        super.extractoMensual();
        if(saldo<10000)
            activa = false;
    }
    public void imprimir(){
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " + cMensual);
        System.out.println("Número de transacciones = " +(nConsignaciones + nRetiros));
        System.out.println();
    }
}