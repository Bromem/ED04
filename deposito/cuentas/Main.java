package cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta1;
        //double saldoActual;

        miCuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(miCuenta1, 0);
    }

	private static void operativa_cuenta(CCuenta miCuenta1, float cantidad) {
		double saldoActual;
		saldoActual = miCuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
