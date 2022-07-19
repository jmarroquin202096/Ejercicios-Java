//Utilizamos el Scanner
import java.util.Scanner;

public class Menu {
 
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        //Guardaremos la opcion del usuario
        int opcion; 
 
        while (!salir) {
 
            System.out.println("1. Obtener membresia del club.");
            System.out.println("2. Crear y eliminar un video juego.");
            System.out.println("3. Eliminar una membresia.");
            System.out.println("4. Ingrese el alquiler de un juego por un miembro del club y cuantos dias lo alquilara.");
            System.out.println("5. Ingrese la devolución de un video juego alquilado.");
            System.out.println("6. Mostrar los video juegos alquilados y que miembro lo tienen.");
            System.out.println("7. Mostrar los video juegos que se pueden alquilar.");
            System.out.println("8. Mostrar los video juegos alquilados por un cliente especifico y un historial de los que ya alquilo.");
            System.out.println("9. Salir");

            System.out.println("Escribe una de las opciones");  
            opcion = sn.nextInt();


 
                switch(opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        System.out.println("hola");
                        break;
                    case 5:
                        System.out.println("hola");
                        break;
                    case 6:
                        System.out.println("hola");
                        break;
                    case 7:
                        System.out.println("hola");
                        break;
                    case 8:
                        System.out.println("hola");
                        break;
                    case 9:
                        salir = true;
                        break;
                        default:
             }

         }
     }
 }  