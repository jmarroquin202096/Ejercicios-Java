//importamos la clase scanner
import java.util.Scanner;
//importamos la clase BufferedReader
import java.io.*;
	
	//abrir la clase con el nombre de Ejercicio5
	public class Ejercicio5	{
		
		//utilizamos la funcion main pra ejecutar la clase
		public static void main(String[] args) {
		
			//utilizamos a scanner
			Scanner datos = new Scanner(System.in);
		 	    //definir el n1
		 		Double n1;
				//definir el n2
				double n2;
				//definir la variante a para utilizar el BufferedReader
				String a= null;
		
			//mandar a imprimir que ingrese el valor n1
			System.out.println("ingrese el primer numero ");
				
				//mandar a pedir datos
				n1 = datos.nextDouble();
			
			//mandar a imprimir que ingrse el valor n2
			System.out.println("ingrese el segundo numero ");
				
				//mandar a pedir datos 
				n2 = datos.nextDouble();

			//mandar a imprimir preguntando que desea hacer
			System.out.println("que desea hacer ");
		
			//mandar a imprimir si el usuario quiere mandar a sumar que escriba la palabra suma
			System.out.println("sumar escriba: suma ");
		

			//mandar a imprimir si el usuario quiera mandar a restar que escriba la palabra resta
			System.out.println("restar escriba: resta ");
			

			//mandar a imprimir si el usuario quiera mandar a multiplicar que escriba la palabra multiplcar
			System.out.println("multiplicar escriba: multiplicar ");
			

			//mandar a imprimir si el usuario quiera mandar a dividir que escriba la palabra  dividir
			System.out.println("dividir escriba: dividir");
			a = datos.nextLine();
			
			//mandar a utilizar a BufferedReader
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try { 
			//madar a pedir datos para la variante a
				a = entrada.readLine();
			} catch (IOException ioe) {
				System.out.println( "error de I/O");
				System.exit(1);
			}
			//definir la suma como n1+n2
			Double suma =n1+n2;
			
			//definir la resta como n1-n2
			Double resta =n1-n2;
			
			//definir la multiplicacion como n1*n2
			Double multiplicacion =n1*n2;
			
			//definir la divicion como n1/n2
			Double divicion =n1/n2;
			
			
			//utilizae un switch para definir la accion
			switch (a) {
				//definir la suma con la impresion "el resultado de la suma es " + suma ")
				case "sumar":
					System.out.println("el resultado de la suma es " + suma);
					break;
				//definir el caso resta con la impresion "el resultado de la resta es " + resta ")
				case "restar":
					System.out.println("el resultado de la resta es " + resta);
					break;
				//definir la multiplicacion con la impresion "el resultado de la multiplicacion es " + multiplicacion)
				case "multiplicar":
					System.out.println("el resultado de la multiplicacion es " + multiplicacion);
					break;
				//definir la divicion con la impresion "el resultado de la divicion es " + divicion)
				case "dividir":
					System.out.println("el resultado de la divicion es " + divicion);
					break;


			}


	}
}
