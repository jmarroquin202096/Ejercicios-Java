import java.util.Scanner;
import persona.*;

public class ListaNombres{
	public static void main(String[] args) {

		//GUARDAR DATOS DEL USUARIO EN UN ARRAY DE TIPO CLASE (Persona)
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de personas que quieres en tu lista");
		int limiteListaPersonas = entrada.nextInt();
		Persona listaPersonas[] = new Persona[limiteListaPersonas];

		for(int i=0; i<listaPersonas.length; i++){
			System.out.println("Posicion. " + (i));
			listaPersonas[i] = new Persona(entrada.next(), entrada.next(), entrada.next(), entrada.next());
		}
		for(Persona a : listaPersonas){
			System.out.println(a);
		}
		
		//GUARDAR DATOS DEL USARUIO EN UN ARRAY TIPO STRING
		System.out.println("Que cantidad de espacios quieres en tu lista?");
		int limiteLista = entrada.nextInt();
		String lista[] = new String[limiteLista];

		for(int i=0; i<lista.length; i++){
			System.out.println("No. " + (i+1) );
			lista[i] = entrada.next();
		}

		System.out.println("Datos de la lista");
		for(String recorrerLista : lista){	
			System.out.println(recorrerLista);
		}
	

	}
}