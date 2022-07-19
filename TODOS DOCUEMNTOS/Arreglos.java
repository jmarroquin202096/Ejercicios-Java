public class Arreglos {
	public static void main(String[] args) {
		
		//STRING
		String nombre = "Juan";
		//length() = Muestra la cantidad que tiene el string
		//System.out.println("La cantidad de letras del nombre " + nombre.length());
		//charAt() = Devuelve una letra pero hay que indicar su posición
		//System.out.println("La letra es " + nombre.charAt(3) );
		//For donde deletreo el string
		for(int i=0;i<nombre.length();i++){
			//System.out.println(nombre.charAt(i));
		}

		//Arreglo de tipo int
		int[] listaNumeros;
		listaNumeros=new int[5];
		//Se llana el arreglo de tipo int
		listaNumeros[0] = 15;
		listaNumeros[1] = 20;
		listaNumeros[2] = 25;
		listaNumeros[3] = 30;
		listaNumeros[4] = 35;

		//For normal
		for(int i=0;i<5;i++){
			//System.out.println("Arreglo en posicion "+i+" es: "+ listaNumeros[i]);
		}
		//For each
		for(int i:listaNumeros){
			//System.out.println("Usando for each lista numeros " + i);
		}

		int[] arreglo= {2,47,13,97,100,150,160,200,300,4,61,99,105,20};
		// .length es para arreglos, nos dice que cantidad de datos tenemos
		//System.out.println("La cantidad de espacios es " + arreglo.length);
		//for each
		for(int indice : arreglo){
			//System.out.println("Usando For each " + indice);
		}

		//Arreglos decimal y string
		double[] arrDouble={28.93,283.22,964.91};
		String[] arrString={"Juan","Maria","Ana","Jose","Paco","Susana"};
		//System.out.println("La lista vip tiene un total de " + arrString.length + " , Nombres");
		
		//recorremos el arreglo de double
		for(int i=0;i<3;i++){
			//System.out.println("arrDouble en posicion "+i+" es: "+arrDouble[i]);
		}
		//recorremos el arreglo de String
		for(int i=0;i<arrString.length;i++){
			//System.out.println("arrString en posicion "+i+" es: "+arrString[i]);
		}

		//ARRAY Bidimensionales
		int[][] arregloBidimensional=new int[2][2];
		arregloBidimensional[0][0]=46;
		arregloBidimensional[0][1]=94;
		arregloBidimensional[1][0]=583;
		arregloBidimensional[1][1]=4;
		//FOR para recorrer arreglos bidimensionales
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				//System.out.println("arreglo["+i+"]["+j+"] = "+arregloBidimensional[i][j]);
			}
		}
		//Declaración arrelgos dibimensionales (Forma easy)
		int[][] arreglo2={ {2,5,1},{0,5,9} };

	}
}