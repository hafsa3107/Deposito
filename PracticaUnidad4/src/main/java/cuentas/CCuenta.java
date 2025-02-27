package cuentas;
/**
 *
 * @author Hafsa
 */


/**
 * Clase que representa una cuenta bancaria.
 * Permite ingresar y retirar dinero, además de consultar el saldo.
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;

    /** Número de cuenta bancaria */
    private String cuenta;

    /** Saldo disponible en la cuenta */
    private double saldo;

    /** Tipo de interés asociado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor vacío de CCuenta.
     */
    public CCuenta() { }

    /**
     * Constructor con parámetros.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta bancaria.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo disponible.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     * 
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
