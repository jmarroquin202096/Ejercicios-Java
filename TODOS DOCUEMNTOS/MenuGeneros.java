import java.util.Scanner;
import java.util.ArrayList;
 
public class MenuGeneros {
 
     
    public static void main(String[] args) {
         
       Scanner sn = new Scanner(System.in);
       ArrayList array = new ArrayList();
       boolean salir = false;
       int opcion;
       int opcion2;
       int opcion3;
       int opcion4;
       int opcion5;
       //Guardaremos la opcion del usuario
        
       while(!salir){
            
          System.out.println(" Bienvenido al Menu de Generos de Juegos: ");
          System.out.println("1. Accion");
          System.out.println("2. Aventuras");
          System.out.println("3. Deportes");
          System.out.println("4. Terror");
          System.out.println("5. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();

      switch(opcion) {
                    case 1:
                        System.out.println("Los Juegos de Accion son: ");

                        System.out.println("1. Fornite");
                        System.out.println("2. Call of Duty");
                        System.out.println("3. Free Fire");
                        System.out.println("4. Halo");
                        System.out.println("Elige tu Juego: ");
                        opcion2 = sn.nextInt();
                        ArrayList accion = new ArrayList(4);
                        accion.add("Fornite");
                        accion.add("Call of Duty");
                        accion.add("Free Fire");
                        accion.add("Halo");
                        break;
                    case 2:

                        System.out.println("Los Juegos de Aventuras son: ");
                        System.out.println("1. Mario Bros");
                        System.out.println("2. Zelda");
                        System.out.println("3. Tom Breider");
                        System.out.println("Elige tu Juego: ");
                        opcion3 = sn.nextInt();

                        ArrayList aventuras = new ArrayList(3);
                        
                        aventuras.add("Mario Bros");
                        aventuras.add("Zelda");
                        aventuras.add("Tom Breider");
                        break;
                    case 3:

                        System.out.println("Los Juegos de  Deportes son: ");
                        System.out.println("1. FIFA");
                        System.out.println("2.NBA");
                        System.out.println("3. GTA");
                        System.out.println("Elige tu Juego: ");
                        opcion4 = sn.nextInt();

                        ArrayList deportes = new ArrayList(3);
                        deportes.add("FIFA");
                        deportes.add("NBA");
                        deportes.add("GTA");
                    case 4:
                        System.out.println("Los Juegos de Terror son: ");
                        System.out.println("1. Resident Evil");
                        System.out.println("2. Five Nights at Freddy´s");
                        System.out.println("3. Dead Space");
                        System.out.println("Elige tu Juego: ");
                        opcion5 = sn.nextInt();

                        ArrayList terror = new ArrayList(3);
                        terror.add("Resident Evil");
                        terror.add("Five Nigths at Freddy´s");
                        terror.add("Dead Space");
                        break;
                    case 5:
                        salir = true;
                        break;   
               }    
       }
        
    }
     
}