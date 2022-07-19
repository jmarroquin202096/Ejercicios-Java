//importar a la libreria de java (scanner)
import java.util.Scanner;

// creamos la clase con el nombre de TablasdeMultiplcar
public class TablasdeMultiplicar {
	//ponemos la funcion main para ejecutar la clase
	public static void main(String[] args) {

		//usamos el scanner
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int n3;

		//Mandar a imprimir
		System.out.println("Bienvenidos al MENU ");
		//usamos el scanner
		Scanner sn = new Scanner(System.in);

       	boolean salir = false;
        //Guardaremos la opcion del usuario
       	int opcion; 
        
      	 while(!salir) {
            
           System.out.println("1. Mostrar una Tablas Especifica ");
           System.out.println("2. Cantidad de Tablas a Multiplicar ");
           System.out.println("3. Salir");
            
           System.out.println("Escribe una de las opciones");  
           opcion = sn.nextInt();

           switch(opcion){
               case 1 :
               		//Mandar a imprimir
                   System.out.println("Ingresar el Numero de la Tabla que Desea:");
                   		//Ingresar iel numero1
						n1 = sc.nextInt();
						//Mandar a imprimir 
					System.out.println("Ingrese hasta donde quiere que llegue la tabla del: ");
					 	//Ingresar el numero2
						n2 = sc.nextInt();
						// Imprimir como la respuesta de la opcion1 = case1
            			System.out.println("Tabla del " + n1);
            				//usamos for para dar a enterner la multi`licacion
       						for(int i = 1; i<=n2; i++){
       							//multiplicar y dar la respuesta
            				System.out.println(n1 + " * " + i + " = " + (n1*i));
            				}

                   break;
              case 2 :
              		//mandar a imprimir
               		System.out.println("Ingresar la Tabla que hasta donde dese: ");
                   		//Ingresar el n3
						n3 = sc.nextInt();
								for (int i= 1; i<=n3; i++) {
						//mandar a imprimir
						System.out.println("Tablas de Multiplicar del " + i);
							for (int j=1; j<=10; j++) {
						//mandar a imprimir
						System.out.println(i +" * "+ j +" = " +(i*j));
							}
						}
                   break;
                case 3:
                   salir=true;
                   break;
                default:
			}
		}	
	}
}