import java.io.*;

public class TablasMultiplicar {


	public static void main(String[] args) {
		
		   InputStreamReader isr = new InputStreamReader(System.in);
		   BufferedReader br = new BufferedReader(isr);


		   // Variables para el manejo del número
		   String sNumero = ""; 
		   Integer iNumero = null;
		   int iNumeroCalculo;
		   
		   // Pedimos por consola el número del cual queremos
		   // la tabla de multiplicar
		   
		   System.out.println("Introduce el numero de la tabla de multiplicar");
		   
		   try {
		   
		     // Leemos del buffer 
		     sNumero = br.readLine(); 
		     // Convertimos la cadena a un número Integer
		     iNumero = new Integer(sNumero);

		     System.out.println("El numero introducido es " + sNumero);
		     iNumeroCalculo = iNumero.intValue();
		  
		     // Mostramos la tabla de multiplicar
		     for (int x=1;x<100;x++) 
		       System.out.println(iNumeroCalculo + " x " + x + " = " + 
		             (x*iNumeroCalculo));
		   
		   } catch (IOException ioe){
		     System.out.println("No se pudo leer de consola");
		   }catch (NumberFormatException nfe){
		     System.out.println("El valor introducido no es valido");  
		   }
	}

}
