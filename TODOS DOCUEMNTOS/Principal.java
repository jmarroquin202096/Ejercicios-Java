//Importaciones y paquetes
import persona.*; //ESTA LINEA DE CODIGO IMPORTA TODAS LAS CLASES DEL PAQUETE persona
import java.util.Scanner;

//Principal.java
public class Principal{
	public static void main(String args[]){
		//Instanciar
		Scanner entrada = new Scanner(System.in);
		//LLama al constructor vacio
		Persona persona = new Persona();

		System.out.println("Ingresa tu nombre");
		String nombre = entrada.nextLine();
		System.out.println("Ingresa tu apellido");
		String apellido = entrada.nextLine();

		persona.setNombre(nombre);
		persona.setApellido(apellido);

		System.out.println("Los datos son " + persona.getNombre() + " " + persona.getApellido());


		//System.out.println("EJECUTANDO");
		//metodo();	//MANDO A LLAMAR AL METODO ESTATICO
	}

	//BLOQUES ESTATICOS, SE EJECTURAN PRIMERO EN EL CODIGO
	/*static int a=3;
	static int b;
	static void metodo() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	static {
		System.out.println("Bloque Estático");
		b = a * 10;
	}	*/
	
}