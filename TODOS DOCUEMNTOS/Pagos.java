//importar scanner
import java.util.Scanner;

	public class Pagos {
 		public static void main(String[] args) {
  	
  		Scanner pago = new Scanner(System.in);
  		boolean salir = false;
  		int metodopago;
		String nombre;
		int dias = 8;
		int n1;
		Double numtarjeta;	
		Double codseguridad;
		String moneda;
		int n2;

	while (!salir) {
		System.out.println("Bienvenidos al Metodo de Pagos de Juegos");
		System.out.println("Tu metodo de pago va ser: ");
		System.out.println("1.Tarjeta de Credito");
		System.out.println("2.Efectivo");
		System.out.println("3.Salir");
		metodopago = pago.nextInt();
		pago.nextLine();

	switch (metodopago) {
		case 1:
		System.out.println("Has Elegido el Metodo de Pago por Trajeta de Credito");
		System.out.println("Ingresa tu nombre de Usuario: ");
		nombre = pago.nextLine();
		System.out.println("Ingrese cuantos Dias tendra el juego: ");
		n1 = pago.nextInt();
		//multiplicar
		//no mostrar multiplicacion
		int resultado = dias*n1;
       	//multiplicar y dar la respuesta
        System.out.println(n1 + " * " + dias + " = ");
        System.out.println("Su pago es de: " + "Q" + resultado);
		System.out.println("Ingresa tu numero de Tarjeta de Credito: ");
		numtarjeta = pago.nextDouble();
		System.out.println("Ingresa tu Codigo de Seguridad: ");
		codseguridad = pago.nextDouble();
		System.out.println("Ingresa en que Mondea deseas Pagar: ");
		moneda = pago.nextLine();
		System.out.println("-----------TU TRANSACCION FUE EXITOSA----------");
		break;
		case 2:
		System.out.println("Has Elegido el Metodo de Pago  de Efectivo");
		System.out.println("Ingrese cuantos Dias tendra el juego: ");
		n2 = pago.nextInt();
		//multiplicar
		//no mostrar multiplicacion
		int resultado1 = dias*n2;
       	//multiplicar y dar la respuesta
        System.out.println(n2 + " * " + dias + " = ");
        System.out.println("El pago que debe hacer es de: " + "Q" + resultado1);
		System.out.println("--------Puedes Pagar en Recepcion tu Cantidad.---------");
		break;
		case 3:
		salir = true;
		break;
			}
		}
	}
}