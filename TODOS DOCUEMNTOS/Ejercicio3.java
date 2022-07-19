//importe la clase scanner
import java.util.Scanner;
//importe la clase BufferedReader
import java.io.*;

//abrir la clase con el nombre de Ejercicio3
public class Ejercicio3 {
	//poner la funcion main para ejecutar la clase
	public static void main(String[] args) {
		
		//utilizar el scanner
		Scanner datos = new Scanner(System.in);
		//definir metrosxpies como 3.28
		Double metrosxpies= 3.28;
		//definir los metros
		Double metros;
		//mandar a imprimir para que el usuario ingrese datos 
		System.out.println("ingrese la cantidad de metros a convertir a pies: ");
		//pedimos los datos al usuario
		metros = datos.nextDouble();
		//definimos la respuesta en metros por metrosxpies
		Double respuesta = metros*metrosxpies;
		//mandamos a imprimir la respuesta
		System.out.println("el resultado es: " + respuesta+ " ft");

	}
}