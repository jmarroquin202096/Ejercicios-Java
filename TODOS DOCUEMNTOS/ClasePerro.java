//Importaciones
//paquetes
//ANOTACIONES
/*
@Autor( //Anotación
	nombre="Juan Perez",
	fecha="05/12/2000"
)
*/
public class ClasePerro {
	//CUERPO
	//atributos
	public String nombrePerro;
	public int edad;
	public String raza;
	//Conctructor Vacio
	public ClasePerro(){
	}
	//Constructor lleno
	public ClasePerro(String n, int e, String r){
		nombrePerro = n;
		edad = e;
		raza = r;
	}
	//metodos
	public void comerPerro(){
		System.out.println("Comiendo...");
	}
	public int obtenerEdad(){
		return edad;
	}
	public void cambiarNombre(String nuevoNombre){
		nombrePerro = nuevoNombre;
	}
}