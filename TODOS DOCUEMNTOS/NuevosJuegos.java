//importar solo el scanner
import java.util.Scanner;


public class NuevosJuegos {
	public static void main(String []args){

	 Scanner entrada = new Scanner(System.in);
	 boolean salir = false;
	 int opcion;
	 String nombrejuego="";
	 String generojuego;

	 while (!salir) {

	 	System.out.println("Bienvenido al MENU Agregar o Elminar un Juego ");
	 	System.out.println("1.Agregar un Juego");
	 	System.out.println("2.Eliminar un Juego");
	 	System.out.println("3.Salir o Regresar al MENU");

	 	System.out.println("Que opcion deseas elegir: ");
	 	opcion = entrada.nextInt();

 	switch (opcion) {
 		case 1:
 			//Imprimir
 			System.out.println("Bienvenido al MENU Agregar un juego");
 			//Imprimir
 			System.out.println("Que Juego deseas Agregar: ");
 			//Ingresar el nombrejuego
 			nombrejuego = entrada.nextLine();
 			//Imprimir
 			//Imprimir
 			System.out.println("De que Genero es el juego:  " + nombrejuego);
 			//Ingresar el generojuego
 			generojuego = entrada.nextLine();
 			//Imprimir
 			System.out.println("El juego que vas a Agregar es: " + nombrejuego + generojuego);
 			break;
 		case 2:
 			//Imprimir
 			System.out.println("Bienvenido al MENU Eleminar un juego");
 			//Imprimir
 			System.out.println("Que Juego deseas Eleminar de nuestra Lista: ");
 			
	 		}
 		}
	}

}