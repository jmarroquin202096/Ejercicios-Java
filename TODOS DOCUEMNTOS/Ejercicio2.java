//importamos la clase scanner
import java.util.Scanner; 

//importamos la clase BufferedReader
import java.io.*;

	
	//abrimos la clase con el nombre de  Ejercicio2
	public class Ejercicio2 {
		
		//utilizamos la funcion main para ejecutar la clase
		public static void main(String[] args) {
			// definimos la variante a para utilizarla con BufferedReader
			
			String a = null;
			//definimos la variante base, altura pra utilizarla con scanner
			double base;
			double altura;
			
			//utilizamos el scanner
			Scanner datos = new Scanner(System.in);

			//mandar a imprimir los datos de la base pedida
			System.out.println("ingrese un numero positivo para la Base: ");
			//pedimos datos al usuario
			base = datos.nextDouble();

			///mandar a imprimir los datos de la altura pedida
			System.out.println("ingrese un numero positivo para la altura: ");
			//pedimos datos al usuario
			altura = datos.nextDouble();
			
			//mandar a inprimir para preguntarle al usuario que desea hacer
			System.out.println("que desea sacar  perimetro escriba perimetro, area escriba area..");
			
			//utilizamos el BufferedReader
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try { 
				a = entrada.readLine();
			} catch (IOException ioe) {
				System.out.println( "error de I/O");
				System.exit(1);
			}
			//mandar a imprimir lo que el usuario nos mando hacer
			System.out.println("Que desea hacer " + a);


			
			//definir el valor de la base al cuadrado
			double baseAlCuadrado = Math.pow(base,2);
			//definir el valor de la altura al cuadrado
			double alturaAlcuadrado = Math.pow(altura,2);
			//definir SBxA(suma de base por altura)
			double sdba = baseAlCuadrado + alturaAlcuadrado;
			//definir c como la raiz de SBxA(suma de base por altura)
			double c = Math.sqrt(sdba );
			//definir abc como la suma de base altura y c
			double abc = base+altura+c;

			//definir x como base por altura
			double x = base*altura;
			//definir y_area (respuesta de area) como m/2
			double y_area = x / 2;

			

			//utilizar un switch
			switch(a){
				
				//definir el case para el perimetro
				case "perimetro":
				
				//mandar a imprimir la primera parte de que lo quiere imprimir
				System.out.println("el perimetro del tringulo dado los datos " + base + "= base " + altura +"= altura ");
				//mandar a imprimir la segunda parte de que lo quiere imprimir
				System.out.println("es: " + abc);
					break;


				//definir el case para el area
				case "area":
				
				//mandae a imprimir la primera parte de que lo quiera imprimir
				System.out.println("el area del tringulo dado los datos " + base + " = base " + altura +" = altura ");
				//mandar a imprimir la segunda parte de que lo quiera imprimir
				System.out.println("es: " + y_area);
					break;
				
				//poner el defaul por si coloco un mal dato
				 default:
				 	
				 	//mamdar a imprimir el mensaje que aparecera si el usario se equivoco.
				 	System.out.println("repitalo siga instrucciones XD");

	
			}
			
		}

	}