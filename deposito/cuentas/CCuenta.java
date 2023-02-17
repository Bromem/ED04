package cuentas;

/**
 * Esta clase se ha diseñado para probar los conceptos aprendidos en ED04 y simula algunas de la funciones de
 * una aplicación bancaria.
 * 
 * @author Entornos de desarrollo
 * @version 1.0
 * 
 * */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
	private double tipoInterés;
	
    private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}


	/**
	 * Constructor por defecto
	 * */
    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros
     * 
     * @param nom
     * @param cue
     * @param tipo
     * */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * Devuelve el estado del saldo
     * */
    public double estado()
    {
        return saldo;
    }

    /**
     * Permite hacer un ingreso.
     * @param cantidad
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     *Permite hacer un reintegro
     *@param cantidad
     *@throws Exception si la cantidad es 0 o negativa.
     * */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
