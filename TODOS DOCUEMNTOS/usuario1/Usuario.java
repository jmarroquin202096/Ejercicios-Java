package usuario1;

public class Usuario {
	
     private String nombredeusuario;
     private int edad;
	
     public Usuario(){

    }
    public Usuario(String nombredeusuario,int edad){
    	this.nombredeusuario = nombredeusuario;
        this.edad = edad;
    }
    public String getNombredeusuario(){
        return nombredeusuario;
    }
    public void setNombredeusuario(String nombredeusuario){
        this.nombredeusuario = nombredeusuario;
    }
    public int getEdad(){
        return edad;
    } 
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String toString(){
        String nombre="nombre el usuario"+nombredeusuario;
        return nombre; 
    }


}