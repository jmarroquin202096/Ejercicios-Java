import usuario1.Usuario;
import java.util.Scanner;

public class Principal extends Usuario {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int opciones;
	boolean salir = false;

     	while(!salir){
	System.out.println();
    System.out.println ("1.Ingreso de clientes para obtener membresia del club.");
    System.out.println ("2.Crear y eliminar un video juego.");
    System.out.println ("3.Eliminar una membresia.");
    System.out.println ("4.Ingresar el alquiler de un juego a un miembro del club, colocando cuantos días lo alquilara, cada dia de alquiler es de Q8.00 por video juego.");
    System.out.println ("5.Ingresar la devolucion de un video juego alquilado.");
    System.out.println ("6.Mostrar los video juegos alquilados y que miembros los tienen.");
   	System.out.println ("7.Mostrar los video juegos que se pueden alquilar.");
    System.out.println ("8.Mostrar los video juegos alquilados por un cliente especifico y un historial de los que ya a alquilado.");
    System.out.println ("9.salir del programa");
    System.out.println ();
    System.out.println ("elige tu opcion");
    opciones =entrada.nextInt();
   	 
   	
 	 	switch (opciones){
     	case 1:
        Usuario usuario1 = new Usuario();
        System.out.println("ingrese su nombre de usuario");
        String nombredeusuario = entrada.next();
        System.out.println("ingrese su edad");
        int edad = entrada.nextInt();
        
        
        usuario1.setNombredeusuario(nombredeusuario);
        usuario1.setEdad(edad);
        System.out.println(usuario1.toString());
        
        System.out.println("los datos de tu usuario para obtener tu membresia");
       	System.out.println("nombre de usuario:"+" "+ usuario1.getNombredeusuario());
       	System.out.println("tu edad:"+" "+usuario1.getEdad());
       	System.out.println();
        break;
        case 2:
        break;
        case 3:
        break;
        case 4:
        break;
        case 5:
        break;
        case 6:
        break;
        case 7:
        break;
        case 8:
        break;
        case 9:
        System.out.println("Gracias por usar nuestra aplicacion: " + usuario1.getNombredeusuario);
       
        salir = true;
        break;
        default:




   	
    }










	 }

	}
}