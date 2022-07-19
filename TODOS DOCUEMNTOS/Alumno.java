//importaciones y paquetes
package persona;

//Clase Hija o SubClase
public class Alumno extends Persona {
	//Atributos
	private int carnet;
	private int edad;
	private String grado;
	private String seccion;

	//Constructores
	public Alumno(){

	}
	public Alumno(String identificacion, String nombre, String apellido, String sexo,
				 int carnet, int edad, String grado, String seccion){
		super(identificacion, nombre, apellido, sexo);
		this.carnet = carnet;
		this.edad = edad;
		this.grado = grado;
		this.seccion = seccion;
	}

	//Metodos get y set
	public int getCarnet(){
		return carnet;
	}
	public void setCarnet(int carnet){
		this.carnet = carnet;
	}

	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}

	public String getGrado(){
		return grado;
	}
	public void setGrado(String grado){
		this.grado = grado;
	}

	public String getSeccion(){
		return seccion;
	}
	public void setSeccion(String seccion){
		this.seccion = seccion;
	}

	//METODO TO STRING
	public String toString(){
		return super.toString() + " (Carnet: " + carnet + ", Edad: " + edad + ", Grado: " + grado + " " + seccion + " )";
	} //El super en super.toString manda a llamar al to string de la clase Persona.

}