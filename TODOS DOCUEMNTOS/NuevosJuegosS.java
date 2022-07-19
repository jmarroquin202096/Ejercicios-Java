//importar solo el scannerS
import java.util.Scanner;


public class NuevosJuegosS {
	public static void main(String []args){

	 Scanner entrada=new Scanner(System.in);
	 boolean salir=false;
	 int opcion;
	 String juego;
	 String generodeljuego;

	 while (!salir) {

	 	System.out.println("Bienvenido al MENU Agregar o Elminar un Juego ");
	 	System.out.println("1.Agregar un Juego");
	 	System.out.println("2.Eliminar un Juego");
	 	System.out.println("Salir o Regresar al MENU");
	 	System.out.println();
		System.out.println("Que opcion deseas elegir: ");
	 	opcion =entrada.nextInt();
	 	entrada.nextLine();
	 	System.out.println();

 	switch (opcion) {
 		case 1:
 			//Imprimir
 			System.out.println("Bienvenido al MENU Agregar un juego");
 			//Imprimir
 			System.out.println("si deseas agregar un juego solo escribe su nombre");
 			System.out.println();
 			juego = entrada.nextLine();
 			System.out.println();
 			System.out.println("El juego que deseas Agregar es:"+juego);
 			System.out.println("ingresa el genero del juego:");
 			//Ingresar el generodeljuego
 			generodeljuego = entrada.nextLine();
 			//Imprimir
 			System.out.println("El juego que vas a Agregar es: " + juego +" "+"el genero del juego es"+" "+ generodeljuego);
 			System.out.println();
 			break;
	 		}
 		}
	}

}