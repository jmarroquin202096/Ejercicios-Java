//importar a la libreria de java (scanner)
import java.util.Scanner;

// creamos la clase con el nombre de Ejercicio1
public class Ejercicio1 {
	//ponemos la funcion main para ejecutar la clase
	public static void main(String[] args) {
		
		//usamos el scanner
		Scanner datos = new Scanner(System.in); 
			
			// definir las numero1, numero2
			double numero1;
			double numero2;
		//mandamar a imprimir
		System.out.println("los numeros pueden llevar decimales...");
		System.out.println("ingrse el primer numero a comparar: ");
			//pedimos al usuario que ingrese el valor del numero1
			numero1 = datos.nextDouble();
		
		//mandamar a imprimir el proceso              
		System.out.println("el numero que ingreso es: " + numero1);
		
		System.out.println("ingrese el segundo numero a comparar ");
			//pedimos al usuario que ingrese un numero para el numero2
			numero2 = datos.nextDouble();
		//mandamar a imprimir el proceso
		System.out.println("el numero que ingreso es: " + numero2);
		//mandamoas a imprimir
		System.out.println("los numero " + numero1 + " y " + numero2 + 
			" los cuales ingreso quedan ordenados de la siguiente manera:");

		/*aca utilizamos un if para poder comparar y hacer mas facil en procedimineto de la 
		operacion fuera incorecta*/
		if (numero1>numero2) {
			//mandamos a imprimir si y solo si la operacion es verdadera
			System.out.println(numero2 + "," + numero1);
				//utilizamos un else para decir que la operacion es falsa
				} else {
					//mandamos a imprimir si y solo si la operacion es falsa
					System.out.println(numero1 + "," + numero2);
		}
	
	} 
}