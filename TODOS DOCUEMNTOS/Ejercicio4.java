//importamos la clase scanner
import java.util.Scanner;
//importamos la clase BufferedReader
import java.io.*;

	//abrir la clase conel nombre Ejercicio4
	public class Ejercicio4	{
		//utilizamos la funcion main par ejecutar la clase
		public static void main(String[] args) {
		
		//utilizamos el scanner
		Scanner datos = new Scanner(System.in);
		//definir unkilometro tiene 1000.o m que son km
		Double unkilometro= 1000.0 /3600;
		//definir los km
		Double km;
		 //mandar a imprimir el mensaje para ingresar los satos
		System.out.println("ingresar la cantidad de km/h para convertir a m/s ");
			//pedimos}datos al usuario
			km = datos.nextDouble();
		// definir la variante resp como la multiplicacion de km*unkilometro
		Double resp = km*unkilometro;

       	//mandar a imprimir el resultado
		System.out.println(" el resultado es: " + resp + "m/s ");
		}
	}